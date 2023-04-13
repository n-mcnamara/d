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

package com.liferay.docs.recordedlectures.model.impl;

import com.liferay.docs.recordedlectures.model.lectureUpload;
import com.liferay.docs.recordedlectures.model.lectureUploadModel;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the lectureUpload service. Represents a row in the &quot;RL_lectureUpload&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>lectureUploadModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link lectureUploadImpl}.
 * </p>
 *
 * @author liferay
 * @see lectureUploadImpl
 * @generated
 */
@JSON(strict = true)
public class lectureUploadModelImpl
	extends BaseModelImpl<lectureUpload> implements lectureUploadModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lecture upload model instance should use the <code>lectureUpload</code> interface instead.
	 */
	public static final String TABLE_NAME = "RL_lectureUpload";

	public static final Object[][] TABLE_COLUMNS = {
		{"mvccVersion", Types.BIGINT}, {"uuid_", Types.VARCHAR},
		{"uploadId", Types.BIGINT}, {"Title", Types.VARCHAR},
		{"videoURL", Types.VARCHAR}, {"name", Types.VARCHAR},
		{"recordedlectureId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"status", Types.INTEGER},
		{"statusByUserId", Types.BIGINT}, {"statusByUserName", Types.VARCHAR},
		{"statusDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("uploadId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("Title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("videoURL", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("recordedlectureId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table RL_lectureUpload (mvccVersion LONG default 0 not null,uuid_ VARCHAR(75) null,uploadId LONG not null primary key,Title VARCHAR(75) null,videoURL VARCHAR(75) null,name VARCHAR(75) null,recordedlectureId LONG,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table RL_lectureUpload";

	public static final String ORDER_BY_JPQL =
		" ORDER BY lectureUpload.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY RL_lectureUpload.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long RECORDEDLECTUREID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public lectureUploadModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _uploadId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUploadId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _uploadId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return lectureUpload.class;
	}

	@Override
	public String getModelClassName() {
		return lectureUpload.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<lectureUpload, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<lectureUpload, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<lectureUpload, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((lectureUpload)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<lectureUpload, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<lectureUpload, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(lectureUpload)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<lectureUpload, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<lectureUpload, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<lectureUpload, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<lectureUpload, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<lectureUpload, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<lectureUpload, Object>>();
		Map<String, BiConsumer<lectureUpload, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<lectureUpload, ?>>();

		attributeGetterFunctions.put(
			"mvccVersion", lectureUpload::getMvccVersion);
		attributeSetterBiConsumers.put(
			"mvccVersion",
			(BiConsumer<lectureUpload, Long>)lectureUpload::setMvccVersion);
		attributeGetterFunctions.put("uuid", lectureUpload::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<lectureUpload, String>)lectureUpload::setUuid);
		attributeGetterFunctions.put("uploadId", lectureUpload::getUploadId);
		attributeSetterBiConsumers.put(
			"uploadId",
			(BiConsumer<lectureUpload, Long>)lectureUpload::setUploadId);
		attributeGetterFunctions.put("Title", lectureUpload::getTitle);
		attributeSetterBiConsumers.put(
			"Title",
			(BiConsumer<lectureUpload, String>)lectureUpload::setTitle);
		attributeGetterFunctions.put("videoURL", lectureUpload::getVideoURL);
		attributeSetterBiConsumers.put(
			"videoURL",
			(BiConsumer<lectureUpload, String>)lectureUpload::setVideoURL);
		attributeGetterFunctions.put("name", lectureUpload::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<lectureUpload, String>)lectureUpload::setName);
		attributeGetterFunctions.put(
			"recordedlectureId", lectureUpload::getRecordedlectureId);
		attributeSetterBiConsumers.put(
			"recordedlectureId",
			(BiConsumer<lectureUpload, Long>)
				lectureUpload::setRecordedlectureId);
		attributeGetterFunctions.put("groupId", lectureUpload::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<lectureUpload, Long>)lectureUpload::setGroupId);
		attributeGetterFunctions.put("companyId", lectureUpload::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<lectureUpload, Long>)lectureUpload::setCompanyId);
		attributeGetterFunctions.put("userId", lectureUpload::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<lectureUpload, Long>)lectureUpload::setUserId);
		attributeGetterFunctions.put("userName", lectureUpload::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<lectureUpload, String>)lectureUpload::setUserName);
		attributeGetterFunctions.put(
			"createDate", lectureUpload::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<lectureUpload, Date>)lectureUpload::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", lectureUpload::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<lectureUpload, Date>)lectureUpload::setModifiedDate);
		attributeGetterFunctions.put("status", lectureUpload::getStatus);
		attributeSetterBiConsumers.put(
			"status",
			(BiConsumer<lectureUpload, Integer>)lectureUpload::setStatus);
		attributeGetterFunctions.put(
			"statusByUserId", lectureUpload::getStatusByUserId);
		attributeSetterBiConsumers.put(
			"statusByUserId",
			(BiConsumer<lectureUpload, Long>)lectureUpload::setStatusByUserId);
		attributeGetterFunctions.put(
			"statusByUserName", lectureUpload::getStatusByUserName);
		attributeSetterBiConsumers.put(
			"statusByUserName",
			(BiConsumer<lectureUpload, String>)
				lectureUpload::setStatusByUserName);
		attributeGetterFunctions.put(
			"statusDate", lectureUpload::getStatusDate);
		attributeSetterBiConsumers.put(
			"statusDate",
			(BiConsumer<lectureUpload, Date>)lectureUpload::setStatusDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_mvccVersion = mvccVersion;
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getUploadId() {
		return _uploadId;
	}

	@Override
	public void setUploadId(long uploadId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uploadId = uploadId;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_Title == null) {
			return "";
		}
		else {
			return _Title;
		}
	}

	@Override
	public void setTitle(String Title) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Title = Title;
	}

	@JSON
	@Override
	public String getVideoURL() {
		if (_videoURL == null) {
			return "";
		}
		else {
			return _videoURL;
		}
	}

	@Override
	public void setVideoURL(String videoURL) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_videoURL = videoURL;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public long getRecordedlectureId() {
		return _recordedlectureId;
	}

	@Override
	public void setRecordedlectureId(long recordedlectureId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_recordedlectureId = recordedlectureId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalRecordedlectureId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("recordedlectureId"));
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_status = status;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return "";
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statusDate = statusDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(lectureUpload.class.getName()));
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), lectureUpload.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public lectureUpload toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, lectureUpload>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		lectureUploadImpl lectureUploadImpl = new lectureUploadImpl();

		lectureUploadImpl.setMvccVersion(getMvccVersion());
		lectureUploadImpl.setUuid(getUuid());
		lectureUploadImpl.setUploadId(getUploadId());
		lectureUploadImpl.setTitle(getTitle());
		lectureUploadImpl.setVideoURL(getVideoURL());
		lectureUploadImpl.setName(getName());
		lectureUploadImpl.setRecordedlectureId(getRecordedlectureId());
		lectureUploadImpl.setGroupId(getGroupId());
		lectureUploadImpl.setCompanyId(getCompanyId());
		lectureUploadImpl.setUserId(getUserId());
		lectureUploadImpl.setUserName(getUserName());
		lectureUploadImpl.setCreateDate(getCreateDate());
		lectureUploadImpl.setModifiedDate(getModifiedDate());
		lectureUploadImpl.setStatus(getStatus());
		lectureUploadImpl.setStatusByUserId(getStatusByUserId());
		lectureUploadImpl.setStatusByUserName(getStatusByUserName());
		lectureUploadImpl.setStatusDate(getStatusDate());

		lectureUploadImpl.resetOriginalValues();

		return lectureUploadImpl;
	}

	@Override
	public lectureUpload cloneWithOriginalValues() {
		lectureUploadImpl lectureUploadImpl = new lectureUploadImpl();

		lectureUploadImpl.setMvccVersion(
			this.<Long>getColumnOriginalValue("mvccVersion"));
		lectureUploadImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		lectureUploadImpl.setUploadId(
			this.<Long>getColumnOriginalValue("uploadId"));
		lectureUploadImpl.setTitle(
			this.<String>getColumnOriginalValue("Title"));
		lectureUploadImpl.setVideoURL(
			this.<String>getColumnOriginalValue("videoURL"));
		lectureUploadImpl.setName(this.<String>getColumnOriginalValue("name"));
		lectureUploadImpl.setRecordedlectureId(
			this.<Long>getColumnOriginalValue("recordedlectureId"));
		lectureUploadImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		lectureUploadImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		lectureUploadImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		lectureUploadImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		lectureUploadImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		lectureUploadImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		lectureUploadImpl.setStatus(
			this.<Integer>getColumnOriginalValue("status"));
		lectureUploadImpl.setStatusByUserId(
			this.<Long>getColumnOriginalValue("statusByUserId"));
		lectureUploadImpl.setStatusByUserName(
			this.<String>getColumnOriginalValue("statusByUserName"));
		lectureUploadImpl.setStatusDate(
			this.<Date>getColumnOriginalValue("statusDate"));

		return lectureUploadImpl;
	}

	@Override
	public int compareTo(lectureUpload lectureUpload) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), lectureUpload.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof lectureUpload)) {
			return false;
		}

		lectureUpload lectureUpload = (lectureUpload)object;

		long primaryKey = lectureUpload.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<lectureUpload> toCacheModel() {
		lectureUploadCacheModel lectureUploadCacheModel =
			new lectureUploadCacheModel();

		lectureUploadCacheModel.mvccVersion = getMvccVersion();

		lectureUploadCacheModel.uuid = getUuid();

		String uuid = lectureUploadCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			lectureUploadCacheModel.uuid = null;
		}

		lectureUploadCacheModel.uploadId = getUploadId();

		lectureUploadCacheModel.Title = getTitle();

		String Title = lectureUploadCacheModel.Title;

		if ((Title != null) && (Title.length() == 0)) {
			lectureUploadCacheModel.Title = null;
		}

		lectureUploadCacheModel.videoURL = getVideoURL();

		String videoURL = lectureUploadCacheModel.videoURL;

		if ((videoURL != null) && (videoURL.length() == 0)) {
			lectureUploadCacheModel.videoURL = null;
		}

		lectureUploadCacheModel.name = getName();

		String name = lectureUploadCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			lectureUploadCacheModel.name = null;
		}

		lectureUploadCacheModel.recordedlectureId = getRecordedlectureId();

		lectureUploadCacheModel.groupId = getGroupId();

		lectureUploadCacheModel.companyId = getCompanyId();

		lectureUploadCacheModel.userId = getUserId();

		lectureUploadCacheModel.userName = getUserName();

		String userName = lectureUploadCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			lectureUploadCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			lectureUploadCacheModel.createDate = createDate.getTime();
		}
		else {
			lectureUploadCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			lectureUploadCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			lectureUploadCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		lectureUploadCacheModel.status = getStatus();

		lectureUploadCacheModel.statusByUserId = getStatusByUserId();

		lectureUploadCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = lectureUploadCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			lectureUploadCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			lectureUploadCacheModel.statusDate = statusDate.getTime();
		}
		else {
			lectureUploadCacheModel.statusDate = Long.MIN_VALUE;
		}

		return lectureUploadCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<lectureUpload, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<lectureUpload, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<lectureUpload, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((lectureUpload)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, lectureUpload>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					lectureUpload.class, ModelWrapper.class);

	}

	private long _mvccVersion;
	private String _uuid;
	private long _uploadId;
	private String _Title;
	private String _videoURL;
	private String _name;
	private long _recordedlectureId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<lectureUpload, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((lectureUpload)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("mvccVersion", _mvccVersion);
		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("uploadId", _uploadId);
		_columnOriginalValues.put("Title", _Title);
		_columnOriginalValues.put("videoURL", _videoURL);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("recordedlectureId", _recordedlectureId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("statusByUserId", _statusByUserId);
		_columnOriginalValues.put("statusByUserName", _statusByUserName);
		_columnOriginalValues.put("statusDate", _statusDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("mvccVersion", 1L);

		columnBitmasks.put("uuid_", 2L);

		columnBitmasks.put("uploadId", 4L);

		columnBitmasks.put("Title", 8L);

		columnBitmasks.put("videoURL", 16L);

		columnBitmasks.put("name", 32L);

		columnBitmasks.put("recordedlectureId", 64L);

		columnBitmasks.put("groupId", 128L);

		columnBitmasks.put("companyId", 256L);

		columnBitmasks.put("userId", 512L);

		columnBitmasks.put("userName", 1024L);

		columnBitmasks.put("createDate", 2048L);

		columnBitmasks.put("modifiedDate", 4096L);

		columnBitmasks.put("status", 8192L);

		columnBitmasks.put("statusByUserId", 16384L);

		columnBitmasks.put("statusByUserName", 32768L);

		columnBitmasks.put("statusDate", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private lectureUpload _escapedModel;

}