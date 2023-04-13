/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.recordedlectures.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;RL_lectureUpload&quot; database table.
 *
 * @author liferay
 * @see lectureUpload
 * @generated
 */
public class lectureUploadTable extends BaseTable<lectureUploadTable> {

	public static final lectureUploadTable INSTANCE = new lectureUploadTable();

	public final Column<lectureUploadTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<lectureUploadTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Long> uploadId = createColumn(
		"uploadId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<lectureUploadTable, String> Title = createColumn(
		"Title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, String> videoURL = createColumn(
		"videoURL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Long> recordedlectureId =
		createColumn(
			"recordedlectureId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Long> statusByUserId = createColumn(
		"statusByUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, String> statusByUserName =
		createColumn(
			"statusByUserName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<lectureUploadTable, Date> statusDate = createColumn(
		"statusDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private lectureUploadTable() {
		super("RL_lectureUpload", lectureUploadTable::new);
	}

}