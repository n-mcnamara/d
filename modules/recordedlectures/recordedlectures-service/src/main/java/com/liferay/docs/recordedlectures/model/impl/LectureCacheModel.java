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

import com.liferay.docs.recordedlectures.model.Lecture;
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
 * The cache model class for representing Lecture in entity cache.
 *
 * @author liferay
 * @generated
 */
public class LectureCacheModel
	implements CacheModel<Lecture>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LectureCacheModel)) {
			return false;
		}

		LectureCacheModel lectureCacheModel = (LectureCacheModel)object;

		if ((recordedlectureId == lectureCacheModel.recordedlectureId) &&
			(mvccVersion == lectureCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, recordedlectureId);

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
		StringBundler sb = new StringBundler(31);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", recordedlectureId=");
		sb.append(recordedlectureId);
		sb.append(", Title=");
		sb.append(Title);
		sb.append(", videoURL=");
		sb.append(videoURL);
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
	public Lecture toEntityModel() {
		LectureImpl lectureImpl = new LectureImpl();

		lectureImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			lectureImpl.setUuid("");
		}
		else {
			lectureImpl.setUuid(uuid);
		}

		lectureImpl.setRecordedlectureId(recordedlectureId);

		if (Title == null) {
			lectureImpl.setTitle("");
		}
		else {
			lectureImpl.setTitle(Title);
		}

		if (videoURL == null) {
			lectureImpl.setVideoURL("");
		}
		else {
			lectureImpl.setVideoURL(videoURL);
		}

		lectureImpl.setGroupId(groupId);
		lectureImpl.setCompanyId(companyId);
		lectureImpl.setUserId(userId);

		if (userName == null) {
			lectureImpl.setUserName("");
		}
		else {
			lectureImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			lectureImpl.setCreateDate(null);
		}
		else {
			lectureImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			lectureImpl.setModifiedDate(null);
		}
		else {
			lectureImpl.setModifiedDate(new Date(modifiedDate));
		}

		lectureImpl.setStatus(status);
		lectureImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			lectureImpl.setStatusByUserName("");
		}
		else {
			lectureImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			lectureImpl.setStatusDate(null);
		}
		else {
			lectureImpl.setStatusDate(new Date(statusDate));
		}

		lectureImpl.resetOriginalValues();

		return lectureImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		recordedlectureId = objectInput.readLong();
		Title = objectInput.readUTF();
		videoURL = objectInput.readUTF();

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

		objectOutput.writeLong(recordedlectureId);

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
	public long recordedlectureId;
	public String Title;
	public String videoURL;
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