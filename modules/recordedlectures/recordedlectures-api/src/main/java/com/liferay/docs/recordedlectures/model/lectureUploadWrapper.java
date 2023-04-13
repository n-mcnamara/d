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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link lectureUpload}.
 * </p>
 *
 * @author liferay
 * @see lectureUpload
 * @generated
 */
public class lectureUploadWrapper
	extends BaseModelWrapper<lectureUpload>
	implements lectureUpload, ModelWrapper<lectureUpload> {

	public lectureUploadWrapper(lectureUpload lectureUpload) {
		super(lectureUpload);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("uploadId", getUploadId());
		attributes.put("Title", getTitle());
		attributes.put("videoURL", getVideoURL());
		attributes.put("name", getName());
		attributes.put("recordedlectureId", getRecordedlectureId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long uploadId = (Long)attributes.get("uploadId");

		if (uploadId != null) {
			setUploadId(uploadId);
		}

		String Title = (String)attributes.get("Title");

		if (Title != null) {
			setTitle(Title);
		}

		String videoURL = (String)attributes.get("videoURL");

		if (videoURL != null) {
			setVideoURL(videoURL);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long recordedlectureId = (Long)attributes.get("recordedlectureId");

		if (recordedlectureId != null) {
			setRecordedlectureId(recordedlectureId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public lectureUpload cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this lecture upload.
	 *
	 * @return the company ID of this lecture upload
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this lecture upload.
	 *
	 * @return the create date of this lecture upload
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this lecture upload.
	 *
	 * @return the group ID of this lecture upload
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this lecture upload.
	 *
	 * @return the modified date of this lecture upload
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this lecture upload.
	 *
	 * @return the mvcc version of this lecture upload
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the name of this lecture upload.
	 *
	 * @return the name of this lecture upload
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this lecture upload.
	 *
	 * @return the primary key of this lecture upload
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the recordedlecture ID of this lecture upload.
	 *
	 * @return the recordedlecture ID of this lecture upload
	 */
	@Override
	public long getRecordedlectureId() {
		return model.getRecordedlectureId();
	}

	/**
	 * Returns the status of this lecture upload.
	 *
	 * @return the status of this lecture upload
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this lecture upload.
	 *
	 * @return the status by user ID of this lecture upload
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this lecture upload.
	 *
	 * @return the status by user name of this lecture upload
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this lecture upload.
	 *
	 * @return the status by user uuid of this lecture upload
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this lecture upload.
	 *
	 * @return the status date of this lecture upload
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the title of this lecture upload.
	 *
	 * @return the title of this lecture upload
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the upload ID of this lecture upload.
	 *
	 * @return the upload ID of this lecture upload
	 */
	@Override
	public long getUploadId() {
		return model.getUploadId();
	}

	/**
	 * Returns the user ID of this lecture upload.
	 *
	 * @return the user ID of this lecture upload
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this lecture upload.
	 *
	 * @return the user name of this lecture upload
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this lecture upload.
	 *
	 * @return the user uuid of this lecture upload
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this lecture upload.
	 *
	 * @return the uuid of this lecture upload
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the video url of this lecture upload.
	 *
	 * @return the video url of this lecture upload
	 */
	@Override
	public String getVideoURL() {
		return model.getVideoURL();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is approved.
	 *
	 * @return <code>true</code> if this lecture upload is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is denied.
	 *
	 * @return <code>true</code> if this lecture upload is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is a draft.
	 *
	 * @return <code>true</code> if this lecture upload is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is expired.
	 *
	 * @return <code>true</code> if this lecture upload is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is inactive.
	 *
	 * @return <code>true</code> if this lecture upload is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is incomplete.
	 *
	 * @return <code>true</code> if this lecture upload is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is pending.
	 *
	 * @return <code>true</code> if this lecture upload is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this lecture upload is scheduled.
	 *
	 * @return <code>true</code> if this lecture upload is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this lecture upload.
	 *
	 * @param companyId the company ID of this lecture upload
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this lecture upload.
	 *
	 * @param createDate the create date of this lecture upload
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this lecture upload.
	 *
	 * @param groupId the group ID of this lecture upload
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this lecture upload.
	 *
	 * @param modifiedDate the modified date of this lecture upload
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this lecture upload.
	 *
	 * @param mvccVersion the mvcc version of this lecture upload
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the name of this lecture upload.
	 *
	 * @param name the name of this lecture upload
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this lecture upload.
	 *
	 * @param primaryKey the primary key of this lecture upload
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the recordedlecture ID of this lecture upload.
	 *
	 * @param recordedlectureId the recordedlecture ID of this lecture upload
	 */
	@Override
	public void setRecordedlectureId(long recordedlectureId) {
		model.setRecordedlectureId(recordedlectureId);
	}

	/**
	 * Sets the status of this lecture upload.
	 *
	 * @param status the status of this lecture upload
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this lecture upload.
	 *
	 * @param statusByUserId the status by user ID of this lecture upload
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this lecture upload.
	 *
	 * @param statusByUserName the status by user name of this lecture upload
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this lecture upload.
	 *
	 * @param statusByUserUuid the status by user uuid of this lecture upload
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this lecture upload.
	 *
	 * @param statusDate the status date of this lecture upload
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this lecture upload.
	 *
	 * @param Title the title of this lecture upload
	 */
	@Override
	public void setTitle(String Title) {
		model.setTitle(Title);
	}

	/**
	 * Sets the upload ID of this lecture upload.
	 *
	 * @param uploadId the upload ID of this lecture upload
	 */
	@Override
	public void setUploadId(long uploadId) {
		model.setUploadId(uploadId);
	}

	/**
	 * Sets the user ID of this lecture upload.
	 *
	 * @param userId the user ID of this lecture upload
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this lecture upload.
	 *
	 * @param userName the user name of this lecture upload
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this lecture upload.
	 *
	 * @param userUuid the user uuid of this lecture upload
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this lecture upload.
	 *
	 * @param uuid the uuid of this lecture upload
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the video url of this lecture upload.
	 *
	 * @param videoURL the video url of this lecture upload
	 */
	@Override
	public void setVideoURL(String videoURL) {
		model.setVideoURL(videoURL);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected lectureUploadWrapper wrap(lectureUpload lectureUpload) {
		return new lectureUploadWrapper(lectureUpload);
	}

}