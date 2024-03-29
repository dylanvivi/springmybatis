package com.dylanvivi.util;

public class OracleDialect extends Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {

		sql = sql.trim();
		boolean isForUpdate = false;
		if (sql.toLowerCase().endsWith(" for update")) {
			sql = sql.substring(0, sql.length() - 11);
			isForUpdate = true;
		}

		StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);

		pagingSelect.append("select * from ( select row_.*, rownum rownum_ from ( ");

		pagingSelect.append(sql);

		pagingSelect
				.append(" ) row_ ) where rownum_ > " + offset * limit + " and rownum_ <= " + ((offset + 1) * limit));

		if (isForUpdate) {
			pagingSelect.append(" for update");
		}

		return pagingSelect.toString();
	}
}