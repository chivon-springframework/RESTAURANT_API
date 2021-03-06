package kh.com.kshrd.restaurant.locales;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Locale;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

@Component("HorizontalDatabaseMessageSource")
public class HorizontalDatabaseMessageSource extends DatabaseMessageSourceBase {

	private static final String I18N_QUERY = "select * from t_i18n_horizontal";

	private ResourceLoader resourceLoader;
	
	@Override
	protected String getI18NSqlQuery() {
		return I18N_QUERY;
	}

	@Override
	protected Messages extractI18NData(ResultSet rs) throws SQLException,
			DataAccessException {
		Messages messages = new Messages();
		ResultSetMetaData metaData = rs.getMetaData();
		int noOfColumns = metaData.getColumnCount();
		while (rs.next()) {
			String key = rs.getString("code");
			for (int i = 1; i <= noOfColumns; i++) {
				String columnName = metaData.getColumnName(i);
				if (!"code".equalsIgnoreCase(columnName)) {
					Locale locale = new Locale(columnName);
					String msg = rs.getString(columnName);
					messages.addMessage(key, locale, msg);
				}
			}
		}
		return messages;
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = (resourceLoader != null ? resourceLoader : new DefaultResourceLoader());
	}
}
