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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the lectureUpload service. Represents a row in the &quot;RL_lectureUpload&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.docs.recordedlectures.model.impl.lectureUploadModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.docs.recordedlectures.model.impl.lectureUploadImpl</code>.
 * </p>
 *
 * @author liferay
 * @see lectureUpload
 * @generated
 */
@ProviderType
public interface lectureUploadModel
	extends BaseModel<lectureUpload>, GroupedModel, MVCCModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lecture upload model instance should use the {@link lectureUpload} interface instead.
	 */

	/**
	 * Returns the primary key of this lecture upload.
	 *
	 * @return the primary key of this lecture upload
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lecture upload.
	 *
	 * @param primaryKey the primary key of this lecture upload
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this lecture upload.
	 *
	 * @return the mvcc version of this lecture upload
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this lecture upload.
	 *
	 * @param mvccVersion the mvcc version of this lecture upload
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this lecture upload.
	 *
	 * @return the uuid of this lecture upload
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this lecture upload.
	 *
	 * @param uuid the uuid of this lecture upload
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the upload ID of this lecture upload.
	 *
	 * @return the upload ID of this lecture upload
	 */
	public long getUploadId();

	/**
	 * Sets the upload ID of this lecture upload.
	 *
	 * @param uploadId the upload ID of this lecture upload
	 */
	public void setUploadId(long uploadId);

	/**
	 * Returns the title of this lecture upload.
	 *
	 * @return the title of this lecture upload
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this lecture upload.
	 *
	 * @param Title the title of this lecture upload
	 */
	public void setTitle(String Title);

	/**
	 * Returns the video url of this lecture upload.
	 *
	 * @return the video url of this lecture upload
	 */
	@AutoEscape
	public String getVideoURL();

	/**
	 * Sets the video url of this lecture upload.
	 *
	 * @param videoURL the video url of this lecture upload
	 */
	public void setVideoURL(String videoURL);

	/**
	 * Returns the name of this lecture upload.
	 *
	 * @return the name of this lecture upload
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this lecture upload.
	 *
	 * @param name the name of this lecture upload
	 */
	public void setName(String name);

	/**
	 * Returns the recordedlecture ID of this lecture upload.
	 *
	 * @return the recordedlecture ID of this lecture upload
	 */
	public long getRecordedlectureId();

	/**
	 * Sets the recordedlecture ID of this lecture upload.
	 *
	 * @param recordedlectureId the recordedlecture ID of this lecture upload
	 */
	public void setRecordedlectureId(long recordedlectureId);

	/**
	 * Returns the group ID of this lecture upload.
	 *
	 * @return the group ID of this lecture upload
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this lecture upload.
	 *
	 * @param groupId the group ID of this lecture upload
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this lecture upload.
	 *
	 * @return the company ID of this lecture upload
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this lecture upload.
	 *
	 * @param companyId the company ID of this lecture upload
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this lecture upload.
	 *
	 * @return the user ID of this lecture upload
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this lecture upload.
	 *
	 * @param userId the user ID of this lecture upload
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this lecture upload.
	 *
	 * @return the user uuid of this lecture upload
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this lecture upload.
	 *
	 * @param userUuid the user uuid of this lecture upload
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this lecture upload.
	 *
	 * @return the user name of this lecture upload
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this lecture upload.
	 *
	 * @param userName the user name of this lecture upload
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this lecture upload.
	 *
	 * @return the create date of this lecture upload
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this lecture upload.
	 *
	 * @param createDate the create date of this lecture upload
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this lecture upload.
	 *
	 * @return the modified date of this lecture upload
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this lecture upload.
	 *
	 * @param modifiedDate the modified date of this lecture upload
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this lecture upload.
	 *
	 * @return the status of this lecture upload
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this lecture upload.
	 *
	 * @param status the status of this lecture upload
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this lecture upload.
	 *
	 * @return the status by user ID of this lecture upload
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this lecture upload.
	 *
	 * @param statusByUserId the status by user ID of this lecture upload
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this lecture upload.
	 *
	 * @return the status by user uuid of this lecture upload
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this lecture upload.
	 *
	 * @param statusByUserUuid the status by user uuid of this lecture upload
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this lecture upload.
	 *
	 * @return the status by user name of this lecture upload
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this lecture upload.
	 *
	 * @param statusByUserName the status by user name of this lecture upload
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this lecture upload.
	 *
	 * @return the status date of this lecture upload
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this lecture upload.
	 *
	 * @param statusDate the status date of this lecture upload
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this lecture upload is approved.
	 *
	 * @return <code>true</code> if this lecture upload is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this lecture upload is denied.
	 *
	 * @return <code>true</code> if this lecture upload is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this lecture upload is a draft.
	 *
	 * @return <code>true</code> if this lecture upload is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this lecture upload is expired.
	 *
	 * @return <code>true</code> if this lecture upload is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this lecture upload is inactive.
	 *
	 * @return <code>true</code> if this lecture upload is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this lecture upload is incomplete.
	 *
	 * @return <code>true</code> if this lecture upload is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this lecture upload is pending.
	 *
	 * @return <code>true</code> if this lecture upload is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this lecture upload is scheduled.
	 *
	 * @return <code>true</code> if this lecture upload is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public lectureUpload cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}