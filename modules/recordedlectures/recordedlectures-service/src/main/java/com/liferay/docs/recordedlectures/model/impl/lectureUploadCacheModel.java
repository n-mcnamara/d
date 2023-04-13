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
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing lectureUpload in entity cache.
 *
 * @author liferay
 * @generated
 */
public class lectureUploadCacheModel
	implements CacheModel<lectureUpload>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof lectureUploadCacheModel)) {
			return false;
		}

		lectureUploadCacheModel lectureUploadCacheModel =
			(lectureUploadCacheModel)object;

		if ((uploadId == lectureUploadCacheModel.uploadId) &&
			(mvccVersion == lectureUploadCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, uploadId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", uploadId=");
		sb.append(uploadId);
		sb.append(", Title=");
		sb.append(Title);
		sb.append(", videoURL=");
		sb.append(videoURL);
		sb.append(", name=");
		sb.append(name);
		sb.append(", recordedlectureId=");
		sb.append(recordedlectureId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public lectureUpload toEntityModel() {
		lectureUploadImpl lectureUploadImpl = new lectureUploadImpl();

		lectureUploadImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			lectureUploadImpl.setUuid("");
		}
		else {
			lectureUploadImpl.setUuid(uuid);
		}

		lectureUploadImpl.setUploadId(uploadId);

		if (Title == null) {
			lectureUploadImpl.setTitle("");
		}
		else {
			lectureUploadImpl.setTitle(Title);
		}

		if (videoURL == null) {
			lectureUploadImpl.setVideoURL("");
		}
		else {
			lectureUploadImpl.setVideoURL(videoURL);
		}

		if (name == null) {
			lectureUploadImpl.setName("");
		}
		else {
			lectureUploadImpl.setName(name);
		}

		lectureUploadImpl.setRecordedlectureId(recordedlectureId);
		lectureUploadImpl.setGroupId(groupId);
		lectureUploadImpl.setCompanyId(companyId);
		lectureUploadImpl.setUserId(userId);

		if (userName == null) {
			lectureUploadImpl.setUserName("");
		}
		else {
			lectureUploadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			lectureUploadImpl.setCreateDate(null);
		}
		else {
			lectureUploadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			lectureUploadImpl.setModifiedDate(null);
		}
		else {
			lectureUploadImpl.setModifiedDate(new Date(modifiedDate));
		}

		lectureUploadImpl.setStatus(status);
		lectureUploadImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			lectureUploadImpl.setStatusByUserName("");
		}
		else {
			lectureUploadImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			lectureUploadImpl.setStatusDate(null);
		}
		else {
			lectureUploadImpl.setStatusDate(new Date(statusDate));
		}

		lectureUploadImpl.resetOriginalValues();

		return lectureUploadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		uploadId = objectInput.readLong();
		Title = objectInput.readUTF();
		videoURL = objectInput.readUTF();
		name = objectInput.readUTF();

		recordedlectureId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(uploadId);

		if (Title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Title);
		}

		if (videoURL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(videoURL);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(recordedlectureId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public long mvccVersion;
	public String uuid;
	public long uploadId;
	public String Title;
	public String videoURL;
	public String name;
	public long recordedlectureId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}