class WorkspaceSettings {
  final bool? isPublic;
  final bool? allowInvite;
  final bool? allowCreateProject;
  final bool? allowFileUpload;

  WorkspaceSettings({
    this.isPublic,
    this.allowInvite,
    this.allowCreateProject,
    this.allowFileUpload
  });
}

class WorkspaceUpdateForm {
  final String? workspaceId;
  final String? workspaceName;
  final String? workspaceDescription;
  final String? workspaceIcon;
  final String? workspaceColor;
  final WorkspaceSettings? settings;

  WorkspaceUpdateForm({
    this.workspaceId,
    this.workspaceName,
    this.workspaceDescription,
    this.workspaceIcon,
    this.workspaceColor,
    this.settings
  });
}

class PlusApiResultWorkspaceVO {
  final WorkspaceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultWorkspaceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class WorkspaceVO {
  final String? createdAt;
  final String? updatedAt;
  final String? workspaceId;
  final String? workspaceName;
  final String? workspaceDescription;
  final String? workspaceIcon;
  final String? workspaceColor;
  final String? workspaceType;
  final String? creatorId;
  final String? creatorName;
  final String? createTime;
  final String? updateTime;
  final int? memberCount;
  final int? projectCount;
  final String? status;
  final bool? isPublic;
  final String? userRole;
  final List<String>? userPermissions;
  final WorkspaceSettings? settings;

  WorkspaceVO({
    this.createdAt,
    this.updatedAt,
    this.workspaceId,
    this.workspaceName,
    this.workspaceDescription,
    this.workspaceIcon,
    this.workspaceColor,
    this.workspaceType,
    this.creatorId,
    this.creatorName,
    this.createTime,
    this.updateTime,
    this.memberCount,
    this.projectCount,
    this.status,
    this.isPublic,
    this.userRole,
    this.userPermissions,
    this.settings
  });
}

class ProjectSettings {
  final bool? isPublic;
  final bool? allowComments;
  final bool? allowFileUpload;
  final bool? allowInviteMembers;

  ProjectSettings({
    this.isPublic,
    this.allowComments,
    this.allowFileUpload,
    this.allowInviteMembers
  });
}

class ProjectUpdateForm {
  final String? projectId;
  final String? projectName;
  final String? projectDescription;
  final String? projectIcon;
  final String? projectColor;
  final List<String>? projectTags;
  final ProjectSettings? settings;

  ProjectUpdateForm({
    this.projectId,
    this.projectName,
    this.projectDescription,
    this.projectIcon,
    this.projectColor,
    this.projectTags,
    this.settings
  });
}

class PlusApiResultProjectVO {
  final ProjectVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultProjectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectVO {
  final String? createdAt;
  final String? updatedAt;
  final String? projectId;
  final String? projectName;
  final String? projectDescription;
  final String? projectType;
  final String? projectIcon;
  final String? projectColor;
  final List<String>? projectTags;
  final String? workspaceId;
  final String? workspaceName;
  final String? creatorId;
  final String? creatorName;
  final String? createTime;
  final String? updateTime;
  final int? memberCount;
  final int? fileCount;
  final String? status;
  final bool? isPublic;
  final List<String>? userPermissions;

  ProjectVO({
    this.createdAt,
    this.updatedAt,
    this.projectId,
    this.projectName,
    this.projectDescription,
    this.projectType,
    this.projectIcon,
    this.projectColor,
    this.projectTags,
    this.workspaceId,
    this.workspaceName,
    this.creatorId,
    this.creatorName,
    this.createTime,
    this.updateTime,
    this.memberCount,
    this.fileCount,
    this.status,
    this.isPublic,
    this.userPermissions
  });
}

class PlusApiResultVoid {
  final dynamic? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoid({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectMoveForm {
  final String? projectId;
  final String? targetWorkspaceId;
  final String? moveReason;
  final bool? retainMembers;
  final bool? retainSettings;

  ProjectMoveForm({
    this.projectId,
    this.targetWorkspaceId,
    this.moveReason,
    this.retainMembers,
    this.retainSettings
  });
}

class MemberRoleUpdateForm {
  final String? workspaceId;
  final String? memberId;
  final String? userId;
  final String? newRoleId;
  final String? newRoleName;
  final List<String>? permissions;
  final String? updateReason;
  final bool? needNotify;

  MemberRoleUpdateForm({
    this.workspaceId,
    this.memberId,
    this.userId,
    this.newRoleId,
    this.newRoleName,
    this.permissions,
    this.updateReason,
    this.needNotify
  });
}

class VoiceSpeakerCreateForm {
  final String? name;
  final String? localName;
  final String? code;
  final String? faceImageUrl;
  final String? channel;
  final String? product;
  final String? gender;
  final String? ageType;
  final String? type;
  final List<String>? models;
  final String? channelSpeakerId;
  final String? version;
  final String? description;
  final List<String>? tags;

  VoiceSpeakerCreateForm({
    this.name,
    this.localName,
    this.code,
    this.faceImageUrl,
    this.channel,
    this.product,
    this.gender,
    this.ageType,
    this.type,
    this.models,
    this.channelSpeakerId,
    this.version,
    this.description,
    this.tags
  });
}

class PlusApiResultVoiceSpeakerVO {
  final VoiceSpeakerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceSpeakerVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? localName;
  final String? code;
  final String? faceImageUrl;
  final String? faceVideoUrl;
  final String? channel;
  final String? channelName;
  final String? product;
  final String? gender;
  final String? genderName;
  final String? ageType;
  final String? ageTypeName;
  final String? type;
  final String? typeName;
  final List<String>? models;
  final String? channelSpeakerId;
  final String? version;
  final bool? isDefault;
  final String? status;
  final String? statusName;
  final String? description;
  final List<String>? tags;

  VoiceSpeakerVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.localName,
    this.code,
    this.faceImageUrl,
    this.faceVideoUrl,
    this.channel,
    this.channelName,
    this.product,
    this.gender,
    this.genderName,
    this.ageType,
    this.ageTypeName,
    this.type,
    this.typeName,
    this.models,
    this.channelSpeakerId,
    this.version,
    this.isDefault,
    this.status,
    this.statusName,
    this.description,
    this.tags
  });
}

class VideoUpdateForm {
  final String? title;
  final String? description;

  VideoUpdateForm({
    this.title,
    this.description
  });
}

class PlusApiResultVideoVO {
  final VideoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVideoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? videoId;
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final String? thumbnailUrl;
  final int? width;
  final int? height;
  final String? aspectRatio;
  final int? categoryId;
  final String? status;
  final bool? isPublic;
  final bool? isFavorite;
  final int? playCount;
  final int? likeCount;

  VideoVO({
    this.createdAt,
    this.updatedAt,
    this.videoId,
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.thumbnailUrl,
    this.width,
    this.height,
    this.aspectRatio,
    this.categoryId,
    this.status,
    this.isPublic,
    this.isFavorite,
    this.playCount,
    this.likeCount
  });
}

class DownloadSettings {
  final String? downloadPath;
  final bool? wifiOnly;
  final bool? autoDownload;
  final int? maxConcurrent;

  DownloadSettings({
    this.downloadPath,
    this.wifiOnly,
    this.autoDownload,
    this.maxConcurrent
  });
}

class NotificationSettings {
  final bool? system;
  final bool? message;
  final bool? activity;
  final bool? promotion;
  final bool? sound;
  final bool? vibration;

  NotificationSettings({
    this.system,
    this.message,
    this.activity,
    this.promotion,
    this.sound,
    this.vibration
  });
}

class PrivacySettings {
  final bool? publicProfile;
  final bool? allowSearch;
  final bool? allowFriendRequest;
  final bool? allowStrangerMessage;
  final bool? locationShare;

  PrivacySettings({
    this.publicProfile,
    this.allowSearch,
    this.allowFriendRequest,
    this.allowStrangerMessage,
    this.locationShare
  });
}

class UserSettingsUpdateForm {
  final NotificationSettings? notificationSettings;
  final PrivacySettings? privacySettings;
  final String? language;
  final String? theme;
  final bool? autoPlay;
  final bool? highQuality;
  final bool? dataSaver;
  final DownloadSettings? downloadSettings;

  UserSettingsUpdateForm({
    this.notificationSettings,
    this.privacySettings,
    this.language,
    this.theme,
    this.autoPlay,
    this.highQuality,
    this.dataSaver,
    this.downloadSettings
  });
}

class NotificationSettingsVO {
  final bool? system;
  final bool? message;
  final bool? activity;
  final bool? promotion;
  final bool? sound;
  final bool? vibration;

  NotificationSettingsVO({
    this.system,
    this.message,
    this.activity,
    this.promotion,
    this.sound,
    this.vibration
  });
}

class PlusApiResultUserSettingsVO {
  final UserSettingsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserSettingsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PrivacySettingsVO {
  final bool? publicProfile;
  final bool? allowSearch;
  final bool? allowFriendRequest;

  PrivacySettingsVO({
    this.publicProfile,
    this.allowSearch,
    this.allowFriendRequest
  });
}

class UserSettingsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? theme;
  final String? language;
  final NotificationSettingsVO? notificationSettings;
  final PrivacySettingsVO? privacySettings;

  UserSettingsVO({
    this.createdAt,
    this.updatedAt,
    this.theme,
    this.language,
    this.notificationSettings,
    this.privacySettings
  });
}

class UserProfileUpdateForm {
  final String? nickname;
  final String? avatar;
  final String? gender;
  final String? birthday;
  final String? region;
  final String? bio;
  final String? occupation;
  final String? interests;
  final String? phone;
  final String? email;
  final String? verifyCode;

  UserProfileUpdateForm({
    this.nickname,
    this.avatar,
    this.gender,
    this.birthday,
    this.region,
    this.bio,
    this.occupation,
    this.interests,
    this.phone,
    this.email,
    this.verifyCode
  });
}

class PlusApiResultUserProfileVO {
  final UserProfileVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserProfileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserProfileVO {
  final String? createdAt;
  final String? updatedAt;
  final String? nickname;
  final String? avatar;
  final String? gender;
  final int? birthday;
  final String? region;
  final String? bio;
  final String? occupation;
  final String? interests;
  final String? phone;
  final String? email;

  UserProfileVO({
    this.createdAt,
    this.updatedAt,
    this.nickname,
    this.avatar,
    this.gender,
    this.birthday,
    this.region,
    this.bio,
    this.occupation,
    this.interests,
    this.phone,
    this.email
  });
}

class PasswordChangeForm {
  final String? oldPassword;
  final String? newPassword;
  final String? confirmPassword;
  final String? verifyCode;

  PasswordChangeForm({
    this.oldPassword,
    this.newPassword,
    this.confirmPassword,
    this.verifyCode
  });
}

class UserAddressUpdateForm {
  final String? name;
  final String? phone;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? addressDetail;
  final String? postalCode;
  final bool? isDefault;

  UserAddressUpdateForm({
    this.name,
    this.phone,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.addressDetail,
    this.postalCode,
    this.isDefault
  });
}

class PlusApiResultUserAddressVO {
  final UserAddressVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserAddressVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserAddressVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? phone;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? addressDetail;
  final String? postalCode;
  final bool? isDefault;
  final String? fullAddress;

  UserAddressVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.phone,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.addressDetail,
    this.postalCode,
    this.isDefault,
    this.fullAddress
  });
}

class TenantUpdateForm {
  final String? name;
  final String? description;
  final String? contactPerson;
  final String? contactPhone;
  final String? expireTime;

  TenantUpdateForm({
    this.name,
    this.description,
    this.contactPerson,
    this.contactPhone,
    this.expireTime
  });
}

class PlusApiResultTenantVO {
  final TenantVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTenantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TenantVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? type;
  final String? bizType;
  final String? status;
  final String? description;
  final String? contactPerson;
  final String? contactPhone;
  final String? expireTime;

  TenantVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.type,
    this.bizType,
    this.status,
    this.description,
    this.contactPerson,
    this.contactPhone,
    this.expireTime
  });
}

class ShopUpdateForm {
  final String? name;
  final String? description;
  final String? logoUrl;
  final String? coverUrl;
  final String? contactPhone;
  final String? contactEmail;
  final String? address;
  final double? latitude;
  final double? longitude;
  final String? licenseNumber;
  final List<String>? tags;
  final String? businessHours;

  ShopUpdateForm({
    this.name,
    this.description,
    this.logoUrl,
    this.coverUrl,
    this.contactPhone,
    this.contactEmail,
    this.address,
    this.latitude,
    this.longitude,
    this.licenseNumber,
    this.tags,
    this.businessHours
  });
}

class PlusApiResultShopVO {
  final ShopVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShopVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShopVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? description;
  final String? logoUrl;
  final String? coverUrl;
  final String? contactPhone;
  final String? contactEmail;
  final String? address;
  final double? latitude;
  final double? longitude;
  final String? licenseNumber;
  final List<String>? tags;
  final String? businessHours;
  final String? status;
  final String? statusName;
  final String? ownerId;
  final String? ownerName;

  ShopVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.description,
    this.logoUrl,
    this.coverUrl,
    this.contactPhone,
    this.contactEmail,
    this.address,
    this.latitude,
    this.longitude,
    this.licenseNumber,
    this.tags,
    this.businessHours,
    this.status,
    this.statusName,
    this.ownerId,
    this.ownerName
  });
}

class ShareUpdateForm {
  final String? shareId;
  final String? title;
  final String? description;
  final String? imageUrl;
  final int? expireSeconds;
  final bool? passwordRequired;
  final String? password;
  final String? status;

  ShareUpdateForm({
    this.shareId,
    this.title,
    this.description,
    this.imageUrl,
    this.expireSeconds,
    this.passwordRequired,
    this.password,
    this.status
  });
}

class PlusApiResultShareRecordVO {
  final ShareRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShareRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShareRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? shareId;
  final String? shareType;
  final String? title;
  final String? createTime;
  final String? expireTime;
  final String? status;
  final int? visitCount;

  ShareRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.shareId,
    this.shareType,
    this.title,
    this.createTime,
    this.expireTime,
    this.status,
    this.visitCount
  });
}

class SettingsUpdateForm {
  final Map<String, dynamic>? settings;
  final String? module;
  final bool? overwrite;

  SettingsUpdateForm({
    this.settings,
    this.module,
    this.overwrite
  });
}

class UISettingsUpdateForm {
  final String? theme;
  final String? language;
  final String? fontSize;
  final int? zoomLevel;
  final bool? notificationsEnabled;
  final bool? shortcutsEnabled;
  final String? sidebarState;
  final bool? autoSaveEnabled;

  UISettingsUpdateForm({
    this.theme,
    this.language,
    this.fontSize,
    this.zoomLevel,
    this.notificationsEnabled,
    this.shortcutsEnabled,
    this.sidebarState,
    this.autoSaveEnabled
  });
}

class ThemeSwitchForm {
  final String? theme;

  ThemeSwitchForm({
    this.theme
  });
}

class LanguageSwitchForm {
  final String? language;

  LanguageSwitchForm({
    this.language
  });
}

class SecuritySettingsUpdateForm {
  final bool? twoFactorEnabled;
  final bool? biometricEnabled;
  final bool? autoLockEnabled;
  final int? autoLockMinutes;
  final bool? loginNotificationsEnabled;
  final bool? ipRestrictionEnabled;
  final List<String>? allowedIps;
  final bool? passwordStrengthCheckEnabled;
  final int? passwordExpiryDays;

  SecuritySettingsUpdateForm({
    this.twoFactorEnabled,
    this.biometricEnabled,
    this.autoLockEnabled,
    this.autoLockMinutes,
    this.loginNotificationsEnabled,
    this.ipRestrictionEnabled,
    this.allowedIps,
    this.passwordStrengthCheckEnabled,
    this.passwordExpiryDays
  });
}

class TwoFactorToggleForm {
  final bool? enable;
  final String? method;
  final String? verificationCode;

  TwoFactorToggleForm({
    this.enable,
    this.method,
    this.verificationCode
  });
}

class PlusApiResultTwoFactorSetupVO {
  final TwoFactorSetupVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTwoFactorSetupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TwoFactorSetupVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? enabled;
  final String? method;
  final String? qrCodeData;
  final String? secretKey;
  final String? verificationCode;
  final List<String>? recoveryCodes;

  TwoFactorSetupVO({
    this.createdAt,
    this.updatedAt,
    this.enabled,
    this.method,
    this.qrCodeData,
    this.secretKey,
    this.verificationCode,
    this.recoveryCodes
  });
}

class PrivacySettingsUpdateForm {
  final bool? dataCollectionEnabled;
  final bool? personalizedRecommendationsEnabled;
  final bool? thirdPartyAnalyticsEnabled;
  final bool? notificationsEnabled;
  final bool? usageDataSharingEnabled;
  final bool? autoSaveEnabled;
  final int? dataRetentionDays;
  final bool? aiLearningEnabled;

  PrivacySettingsUpdateForm({
    this.dataCollectionEnabled,
    this.personalizedRecommendationsEnabled,
    this.thirdPartyAnalyticsEnabled,
    this.notificationsEnabled,
    this.usageDataSharingEnabled,
    this.autoSaveEnabled,
    this.dataRetentionDays,
    this.aiLearningEnabled
  });
}

class PromptUpdateForm {
  final String? title;
  final String? content;
  final String? description;
  final int? cateId;
  final bool? enabled;
  final int? sort;
  final Map<String, dynamic>? parameters;
  final String? model;
  final bool? isPublic;

  PromptUpdateForm({
    this.title,
    this.content,
    this.description,
    this.cateId,
    this.enabled,
    this.sort,
    this.parameters,
    this.model,
    this.isPublic
  });
}

class PlusApiResultPromptVO {
  final PromptVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPromptVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PromptVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? title;
  final String? content;
  final String? type;
  final String? bizType;
  final String? description;
  final int? cateId;
  final bool? enabled;
  final int? sort;
  final Map<String, dynamic>? parameters;
  final String? creator;
  final String? model;
  final TagsContent? tags;
  final int? usageCount;
  final int? avgResponseTime;
  final String? version;
  final bool? isPublic;
  final bool? isFavorite;
  final int? favoriteCount;
  final String? lastUsedAt;

  PromptVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.content,
    this.type,
    this.bizType,
    this.description,
    this.cateId,
    this.enabled,
    this.sort,
    this.parameters,
    this.creator,
    this.model,
    this.tags,
    this.usageCount,
    this.avgResponseTime,
    this.version,
    this.isPublic,
    this.isFavorite,
    this.favoriteCount,
    this.lastUsedAt
  });
}

class TagsContent {
  final List<String>? tags;
  final List<TagsContent>? children;

  TagsContent({
    this.tags,
    this.children
  });
}

class ProjectUpdateRequest {
  final String? name;
  final String? description;
  final String? type;
  final List<String>? tags;
  final bool? isPublic;

  ProjectUpdateRequest({
    this.name,
    this.description,
    this.type,
    this.tags,
    this.isPublic
  });
}

class ProjectMoveRequest {
  final String? targetWorkspaceId;

  ProjectMoveRequest({
    this.targetWorkspaceId
  });
}

class PartnerUpdateForm {
  final String? name;
  final String? contactName;
  final String? contactPhone;
  final String? contactEmail;

  PartnerUpdateForm({
    this.name,
    this.contactName,
    this.contactPhone,
    this.contactEmail
  });
}

class PartnerVO {
  final String? createdAt;
  final String? updatedAt;
  final String? partnerId;
  final String? name;
  final String? level;
  final String? status;
  final String? promotionCode;
  final String? contactName;
  final String? contactPhone;
  final double? totalCommission;
  final double? withdrawableCommission;

  PartnerVO({
    this.createdAt,
    this.updatedAt,
    this.partnerId,
    this.name,
    this.level,
    this.status,
    this.promotionCode,
    this.contactName,
    this.contactPhone,
    this.totalCommission,
    this.withdrawableCommission
  });
}

class PlusApiResultPartnerVO {
  final PartnerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPartnerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NotificationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? notificationId;
  final String? title;
  final String? content;
  final String? type;
  final String? status;
  final String? source;
  final String? link;
  final bool? isRead;
  final String? readAt;

  NotificationVO({
    this.createdAt,
    this.updatedAt,
    this.notificationId,
    this.title,
    this.content,
    this.type,
    this.status,
    this.source,
    this.link,
    this.isRead,
    this.readAt
  });
}

class PlusApiResultNotificationVO {
  final NotificationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNotificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NotificationSettingsUpdateForm {
  final bool? enablePush;
  final bool? enableEmail;
  final bool? enableSms;
  final bool? enableInApp;
  final String? quietHoursStart;
  final String? quietHoursEnd;
  final String? notificationSound;
  final bool? vibrationEnabled;

  NotificationSettingsUpdateForm({
    this.enablePush,
    this.enableEmail,
    this.enableSms,
    this.enableInApp,
    this.quietHoursStart,
    this.quietHoursEnd,
    this.notificationSound,
    this.vibrationEnabled
  });
}

class PlusApiResultNotificationSettingsVO {
  final NotificationSettingsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNotificationSettingsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NotificationTypeSettingsForm {
  final String? type;
  final bool? enabled;
  final String? pushMethod;
  final bool? needReminder;

  NotificationTypeSettingsForm({
    this.type,
    this.enabled,
    this.pushMethod,
    this.needReminder
  });
}

class NotificationBatchReadForm {
  final List<String>? notificationIds;

  NotificationBatchReadForm({
    this.notificationIds
  });
}

class NoteUpdateRequest {
  final String? title;
  final String? content;
  final List<String>? tags;

  NoteUpdateRequest({
    this.title,
    this.content,
    this.tags
  });
}

class NoteOperationVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final int? noteId;
  final String? uuid;
  final String? title;
  final String? operationType;
  final String? operationTime;
  final String? message;

  NoteOperationVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.noteId,
    this.uuid,
    this.title,
    this.operationType,
    this.operationTime,
    this.message
  });
}

class PlusApiResultNoteOperationVO {
  final NoteOperationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNoteOperationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NoteMoveRequest {
  final String? folderId;

  NoteMoveRequest({
    this.folderId
  });
}

class NoteFolderUpdateRequest {
  final String? name;

  NoteFolderUpdateRequest({
    this.name
  });
}

class NoteFolderVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? name;
  final int? parentId;
  final String? parentName;
  final String? path;
  final int? subFolderCount;
  final int? noteCount;
  final List<NoteFolderVO>? children;

  NoteFolderVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.name,
    this.parentId,
    this.parentName,
    this.path,
    this.subFolderCount,
    this.noteCount,
    this.children
  });
}

class PlusApiResultNoteFolderVO {
  final NoteFolderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNoteFolderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NewsUpdateForm {
  final String? title;
  final String? summary;
  final String? url;
  final String? source;

  NewsUpdateForm({
    this.title,
    this.summary,
    this.url,
    this.source
  });
}

class NewsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? newsId;
  final String? title;
  final String? summary;
  final String? url;
  final String? source;
  final int? categoryId;
  final String? publishTime;

  NewsVO({
    this.createdAt,
    this.updatedAt,
    this.newsId,
    this.title,
    this.summary,
    this.url,
    this.source,
    this.categoryId,
    this.publishTime
  });
}

class PlusApiResultNewsVO {
  final NewsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNewsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MusicUpdateForm {
  final String? title;
  final String? description;

  MusicUpdateForm({
    this.title,
    this.description
  });
}

class MusicVO {
  final String? createdAt;
  final String? updatedAt;
  final String? musicId;
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final String? artist;
  final String? genre;
  final String? thumbnailUrl;
  final String? status;
  final bool? isPublic;
  final bool? isFavorite;
  final int? playCount;
  final int? likeCount;

  MusicVO({
    this.createdAt,
    this.updatedAt,
    this.musicId,
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.artist,
    this.genre,
    this.thumbnailUrl,
    this.status,
    this.isPublic,
    this.isFavorite,
    this.playCount,
    this.likeCount
  });
}

class PlusApiResultMusicVO {
  final MusicVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMusicVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InvoiceUpdateForm {
  final String? title;
  final String? taxNo;
  final String? bankName;
  final String? bankAccount;
  final String? registerAddress;
  final String? registerPhone;

  InvoiceUpdateForm({
    this.title,
    this.taxNo,
    this.bankName,
    this.bankAccount,
    this.registerAddress,
    this.registerPhone
  });
}

class InvoiceVO {
  final String? createdAt;
  final String? updatedAt;
  final String? invoiceId;
  final String? title;
  final String? titleType;
  final String? taxNo;
  final String? type;
  final String? status;
  final String? invoiceCode;
  final String? invoiceNo;
  final double? totalAmount;
  final String? currency;

  InvoiceVO({
    this.createdAt,
    this.updatedAt,
    this.invoiceId,
    this.title,
    this.titleType,
    this.taxNo,
    this.type,
    this.status,
    this.invoiceCode,
    this.invoiceNo,
    this.totalAmount,
    this.currency
  });
}

class PlusApiResultInvoiceVO {
  final InvoiceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInvoiceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ImageUpdateForm {
  final String? title;
  final String? description;

  ImageUpdateForm({
    this.title,
    this.description
  });
}

class ImageVO {
  final String? createdAt;
  final String? updatedAt;
  final String? imageId;
  final String? title;
  final String? description;
  final String? url;
  final String? format;
  final int? width;
  final int? height;
  final String? aspectRatio;
  final String? status;
  final bool? isPublic;
  final bool? isFavorite;
  final int? viewCount;
  final int? likeCount;

  ImageVO({
    this.createdAt,
    this.updatedAt,
    this.imageId,
    this.title,
    this.description,
    this.url,
    this.format,
    this.width,
    this.height,
    this.aspectRatio,
    this.status,
    this.isPublic,
    this.isFavorite,
    this.viewCount,
    this.likeCount
  });
}

class PlusApiResultImageVO {
  final ImageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultImageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerationStyleUpdateForm {
  final String? name;
  final String? description;
  final Map<String, dynamic>? configParams;

  GenerationStyleUpdateForm({
    this.name,
    this.description,
    this.configParams
  });
}

class GenerationStyleVO {
  final String? createdAt;
  final String? updatedAt;
  final String? styleId;
  final String? name;
  final String? description;
  final String? type;
  final bool? isPublic;
  final String? status;
  final int? usageCount;
  final String? coverImageUrl;

  GenerationStyleVO({
    this.createdAt,
    this.updatedAt,
    this.styleId,
    this.name,
    this.description,
    this.type,
    this.isPublic,
    this.status,
    this.usageCount,
    this.coverImageUrl
  });
}

class PlusApiResultGenerationStyleVO {
  final GenerationStyleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerationStyleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FileSystemRenameForm {
  final String? name;

  FileSystemRenameForm({
    this.name
  });
}

class FileSystemNodeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? nodeId;
  final String? nodeUuid;
  final String? name;
  final String? type;
  final bool? directory;
  final String? diskId;
  final String? parentId;
  final String? path;
  final String? relativePath;
  final String? objectKey;
  final int? size;
  final String? mimeType;
  final String? extension;
  final String? assetType;
  final String? status;
  final String? description;
  final List<String>? tags;
  final String? versionId;
  final String? uploadStatus;

  FileSystemNodeVO({
    this.createdAt,
    this.updatedAt,
    this.nodeId,
    this.nodeUuid,
    this.name,
    this.type,
    this.directory,
    this.diskId,
    this.parentId,
    this.path,
    this.relativePath,
    this.objectKey,
    this.size,
    this.mimeType,
    this.extension,
    this.assetType,
    this.status,
    this.description,
    this.tags,
    this.versionId,
    this.uploadStatus
  });
}

class PlusApiResultFileSystemNodeVO {
  final FileSystemNodeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFileSystemNodeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FileSystemMoveForm {
  final String? targetParentId;
  final String? targetDiskId;

  FileSystemMoveForm({
    this.targetParentId,
    this.targetDiskId
  });
}

class FileSystemContentUpdateForm {
  final String? text;
  final Map<String, String>? contents;
  final String? prompt;
  final String? thinkingContent;
  final String? encoding;
  final bool? bumpVersion;

  FileSystemContentUpdateForm({
    this.text,
    this.contents,
    this.prompt,
    this.thinkingContent,
    this.encoding,
    this.bumpVersion
  });
}

class FileSystemContentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? nodeId;
  final String? nodeUuid;
  final String? contentId;
  final String? fileVersion;
  final String? encoding;
  final String? prompt;
  final String? thinkingContent;
  final String? text;
  final Map<String, String>? contents;
  final int? charCount;
  final int? wordCount;

  FileSystemContentVO({
    this.createdAt,
    this.updatedAt,
    this.nodeId,
    this.nodeUuid,
    this.contentId,
    this.fileVersion,
    this.encoding,
    this.prompt,
    this.thinkingContent,
    this.text,
    this.contents,
    this.charCount,
    this.wordCount
  });
}

class PlusApiResultFileSystemContentVO {
  final FileSystemContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFileSystemContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FeedbackDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? content;
  final String? contact;
  final String? attachmentUrl;
  final String? screenshotUrl;
  final String? status;
  final String? submitTime;
  final String? processTime;
  final List<FeedbackFollowUpVO>? followUps;

  FeedbackDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.content,
    this.contact,
    this.attachmentUrl,
    this.screenshotUrl,
    this.status,
    this.submitTime,
    this.processTime,
    this.followUps
  });
}

class FeedbackFollowUpVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? feedbackId;
  final String? content;
  final String? attachmentUrl;
  final String? followUpTime;
  final String? follower;

  FeedbackFollowUpVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.feedbackId,
    this.content,
    this.attachmentUrl,
    this.followUpTime,
    this.follower
  });
}

class PlusApiResultFeedbackDetailVO {
  final FeedbackDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFeedbackDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteMoveForm {
  final String? favoriteId;
  final String? targetFolderId;
  final String? folderId;

  FavoriteMoveForm({
    this.favoriteId,
    this.targetFolderId,
    this.folderId
  });
}

class FavoriteVO {
  final String? favoriteId;
  final String? favoriteType;
  final String? targetId;
  final String? favoriteName;
  final String? folderId;
  final String? favoriteTime;
  final String? updateTime;

  FavoriteVO({
    this.favoriteId,
    this.favoriteType,
    this.targetId,
    this.favoriteName,
    this.folderId,
    this.favoriteTime,
    this.updateTime
  });
}

class PlusApiResultFavoriteVO {
  final FavoriteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFavoriteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteFolderUpdateForm {
  final String? folderId;
  final String? folderName;
  final String? parentFolderId;
  final String? folderDescription;

  FavoriteFolderUpdateForm({
    this.folderId,
    this.folderName,
    this.parentFolderId,
    this.folderDescription
  });
}

class FavoriteFolderVO {
  final String? createdAt;
  final String? updatedAt;
  final String? folderId;
  final String? folderName;
  final String? parentFolderId;
  final String? folderDescription;
  final List<FavoriteFolderVO>? subFolders;
  final List<FavoriteItemVO>? favoriteItems;
  final String? createTime;
  final String? updateTime;
  final int? favoriteCount;

  FavoriteFolderVO({
    this.createdAt,
    this.updatedAt,
    this.folderId,
    this.folderName,
    this.parentFolderId,
    this.folderDescription,
    this.subFolders,
    this.favoriteItems,
    this.createTime,
    this.updateTime,
    this.favoriteCount
  });
}

class FavoriteItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? favoriteId;
  final String? favoriteType;
  final String? targetId;
  final String? favoriteName;
  final String? folderId;
  final String? favoriteTime;
  final String? updateTime;

  FavoriteItemVO({
    this.createdAt,
    this.updatedAt,
    this.favoriteId,
    this.favoriteType,
    this.targetId,
    this.favoriteName,
    this.folderId,
    this.favoriteTime,
    this.updateTime
  });
}

class PlusApiResultFavoriteFolderVO {
  final FavoriteFolderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFavoriteFolderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteBatchMoveForm {
  final List<String>? favoriteIds;
  final String? targetFolderId;
  final String? folderId;

  FavoriteBatchMoveForm({
    this.favoriteIds,
    this.targetFolderId,
    this.folderId
  });
}

class DriveRenameForm {
  final String? name;

  DriveRenameForm({
    this.name
  });
}

class DriveItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? itemId;
  final String? itemUuid;
  final String? itemName;
  final String? fileType;
  final bool? directory;
  final String? assetType;
  final String? mimeType;
  final String? extension;
  final int? size;
  final String? parentId;
  final String? path;
  final String? objectKey;
  final String? status;
  final FileMediaResource? resource;
  final ImageMediaResource? coverImage;

  DriveItemVO({
    this.createdAt,
    this.updatedAt,
    this.itemId,
    this.itemUuid,
    this.itemName,
    this.fileType,
    this.directory,
    this.assetType,
    this.mimeType,
    this.extension,
    this.size,
    this.parentId,
    this.path,
    this.objectKey,
    this.status,
    this.resource,
    this.coverImage
  });
}

class FileMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final int? width;
  final int? height;
  final int? duration;
  final String? mimeType;

  FileMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.width,
    this.height,
    this.duration,
    this.mimeType
  });
}

class ImageMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final int? width;
  final int? height;
  final ImageMediaResource? splitImages;
  final String? aspectRatio;

  ImageMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.width,
    this.height,
    this.splitImages,
    this.aspectRatio
  });
}

class PlusApiResultDriveItemVO {
  final DriveItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDriveItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DriveMoveForm {
  final String? targetFolderId;

  DriveMoveForm({
    this.targetFolderId
  });
}

class DriveContentUpdateForm {
  final String? text;
  final Map<String, String>? contents;
  final String? prompt;
  final String? thinkingContent;
  final String? encoding;

  DriveContentUpdateForm({
    this.text,
    this.contents,
    this.prompt,
    this.thinkingContent,
    this.encoding
  });
}

class DriveContentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? fileId;
  final String? fileUuid;
  final String? fileVersion;
  final String? contentId;
  final String? encoding;
  final String? prompt;
  final String? thinkingContent;
  final String? text;
  final Map<String, String>? contents;

  DriveContentVO({
    this.createdAt,
    this.updatedAt,
    this.fileId,
    this.fileUuid,
    this.fileVersion,
    this.contentId,
    this.encoding,
    this.prompt,
    this.thinkingContent,
    this.text,
    this.contents
  });
}

class PlusApiResultDriveContentVO {
  final DriveContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDriveContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DocumentUpdateRequest {
  final String? title;
  final String? folderId;
  final String? description;
  final List<String>? tags;

  DocumentUpdateRequest({
    this.title,
    this.folderId,
    this.description,
    this.tags
  });
}

class DocumentOperationVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? operationType;
  final String? message;
  final String? documentId;
  final String? documentUuid;
  final String? title;
  final String? operationTime;

  DocumentOperationVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.operationType,
    this.message,
    this.documentId,
    this.documentUuid,
    this.title,
    this.operationTime
  });
}

class PlusApiResultDocumentOperationVO {
  final DocumentOperationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDocumentOperationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DocumentContentUpdateRequest {
  final String? text;
  final Map<String, String>? contents;
  final String? prompt;
  final String? thinkingContent;
  final String? encoding;

  DocumentContentUpdateRequest({
    this.text,
    this.contents,
    this.prompt,
    this.thinkingContent,
    this.encoding
  });
}

class DocumentContentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? documentId;
  final String? documentUuid;
  final String? contentId;
  final String? versionId;
  final String? encoding;
  final String? prompt;
  final String? thinkingContent;
  final String? text;
  final Map<String, String>? contents;
  final int? charCount;
  final int? wordCount;

  DocumentContentVO({
    this.createdAt,
    this.updatedAt,
    this.documentId,
    this.documentUuid,
    this.contentId,
    this.versionId,
    this.encoding,
    this.prompt,
    this.thinkingContent,
    this.text,
    this.contents,
    this.charCount,
    this.wordCount
  });
}

class PlusApiResultDocumentContentVO {
  final DocumentContentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDocumentContentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShortcutItemForm {
  final String? id;
  final String? name;
  final String? icon;
  final String? url;
  final int? sort;
  final String? type;

  ShortcutItemForm({
    this.id,
    this.name,
    this.icon,
    this.url,
    this.sort,
    this.type
  });
}

class ShortcutsUpdateForm {
  final List<ShortcutItemForm>? shortcuts;

  ShortcutsUpdateForm({
    this.shortcuts
  });
}

class CollectionUpdateForm {
  final String? name;
  final String? description;
  final String? coverImage;

  CollectionUpdateForm({
    this.name,
    this.description,
    this.coverImage
  });
}

class CollectionVO {
  final String? createdAt;
  final String? updatedAt;
  final String? collectionId;
  final String? name;
  final String? description;
  final String? type;
  final String? coverImage;
  final bool? isPublic;
  final bool? isPinned;
  final int? itemCount;
  final int? viewCount;
  final int? favoriteCount;
  final int? parentId;

  CollectionVO({
    this.createdAt,
    this.updatedAt,
    this.collectionId,
    this.name,
    this.description,
    this.type,
    this.coverImage,
    this.isPublic,
    this.isPinned,
    this.itemCount,
    this.viewCount,
    this.favoriteCount,
    this.parentId
  });
}

class PlusApiResultCollectionVO {
  final CollectionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCollectionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CollectionItemPositionForm {
  final List<int>? itemIds;

  CollectionItemPositionForm({
    this.itemIds
  });
}

class ChatSessionUpdateForm {
  final int? sessionId;
  final String? name;
  final String? description;
  final String? modelId;
  final String? systemPrompt;
  final double? temperature;
  final int? maxTokens;
  final double? topP;
  final String? status;

  ChatSessionUpdateForm({
    this.sessionId,
    this.name,
    this.description,
    this.modelId,
    this.systemPrompt,
    this.temperature,
    this.maxTokens,
    this.topP,
    this.status
  });
}

class CharacterUpdateForm {
  final String? name;
  final String? description;
  final String? personality;
  final String? background;

  CharacterUpdateForm({
    this.name,
    this.description,
    this.personality,
    this.background
  });
}

class CharacterVO {
  final String? createdAt;
  final String? updatedAt;
  final String? characterId;
  final String? name;
  final String? type;
  final String? description;
  final ImageMediaResource? avatar;
  final String? status;
  final int? agentId;
  final bool? isPublic;
  final int? usageCount;
  final int? likeCount;

  CharacterVO({
    this.createdAt,
    this.updatedAt,
    this.characterId,
    this.name,
    this.type,
    this.description,
    this.avatar,
    this.status,
    this.agentId,
    this.isPublic,
    this.usageCount,
    this.likeCount
  });
}

class PlusApiResultCharacterVO {
  final CharacterVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCharacterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CategoryUpdateForm {
  final String? name;
  final String? icon;
  final String? description;
  final int? sort;
  final int? status;

  CategoryUpdateForm({
    this.name,
    this.icon,
    this.description,
    this.sort,
    this.status
  });
}

class CategoryVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? code;
  final String? icon;
  final String? description;
  final int? parentId;
  final int? sort;
  final int? status;

  CategoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.code,
    this.icon,
    this.description,
    this.parentId,
    this.sort,
    this.status
  });
}

class PlusApiResultCategoryVO {
  final CategoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CategoryMoveForm {
  final int? targetParentId;

  CategoryMoveForm({
    this.targetParentId
  });
}

class CategorySortForm {
  final String? categoryId;

  CategorySortForm({
    this.categoryId
  });
}

class UpdateCartItemForm {
  final int? quantity;

  UpdateCartItemForm({
    this.quantity
  });
}

class CartItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? itemId;
  final String? uuid;
  final String? cartId;
  final String? cartGroupUuid;
  final String? productId;
  final String? skuId;
  final String? skuName;
  final String? skuCode;
  final String? skuImage;
  final double? skuPrice;
  final int? quantity;
  final double? price;
  final double? totalPrice;
  final bool? selected;

  CartItemVO({
    this.createdAt,
    this.updatedAt,
    this.itemId,
    this.uuid,
    this.cartId,
    this.cartGroupUuid,
    this.productId,
    this.skuId,
    this.skuName,
    this.skuCode,
    this.skuImage,
    this.skuPrice,
    this.quantity,
    this.price,
    this.totalPrice,
    this.selected
  });
}

class PlusApiResultCartItemVO {
  final CartItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCartItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BatchSelectForm {
  final List<int>? itemIds;
  final bool? selected;

  BatchSelectForm({
    this.itemIds,
    this.selected
  });
}

class AssetRenameForm {
  final String? name;

  AssetRenameForm({
    this.name
  });
}

class AssetMoveForm {
  final String? folderId;

  AssetMoveForm({
    this.folderId
  });
}

class AppUpdateForm {
  final String? name;
  final String? description;
  final String? accessUrl;

  AppUpdateForm({
    this.name,
    this.description,
    this.accessUrl
  });
}

class AppVO {
  final String? createdAt;
  final String? updatedAt;
  final String? appId;
  final String? name;
  final String? description;
  final ImageMediaResource? icon;
  final String? iconUrl;
  final String? accessUrl;
  final String? version;
  final String? appType;
  final String? status;
  final int? projectId;

  AppVO({
    this.createdAt,
    this.updatedAt,
    this.appId,
    this.name,
    this.description,
    this.icon,
    this.iconUrl,
    this.accessUrl,
    this.version,
    this.appType,
    this.status,
    this.projectId
  });
}

class PlusApiResultAppVO {
  final AppVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AdvertSettingsUpdateForm {
  final bool? enabled;
  final bool? personalized;
  final int? maxDailyAds;
  final String? adBlockLevel;
  final bool? rewardVideoEnabled;
  final bool? interstitialEnabled;
  final bool? bannerEnabled;

  AdvertSettingsUpdateForm({
    this.enabled,
    this.personalized,
    this.maxDailyAds,
    this.adBlockLevel,
    this.rewardVideoEnabled,
    this.interstitialEnabled,
    this.bannerEnabled
  });
}

class WorkspaceCreateForm {
  final String? workspaceName;
  final String? workspaceDescription;
  final String? workspaceIcon;
  final String? workspaceColor;
  final String? workspaceType;
  final List<WorkspaceMember>? members;
  final WorkspaceSettings? settings;

  WorkspaceCreateForm({
    this.workspaceName,
    this.workspaceDescription,
    this.workspaceIcon,
    this.workspaceColor,
    this.workspaceType,
    this.members,
    this.settings
  });
}

class WorkspaceMember {
  final String? userId;
  final String? roleId;
  final String? roleName;
  final List<String>? permissions;

  WorkspaceMember({
    this.userId,
    this.roleId,
    this.roleName,
    this.permissions
  });
}

class ProjectCreateForm {
  final String? workspaceId;
  final String? projectName;
  final String? projectDescription;
  final String? projectType;
  final String? projectIcon;
  final String? projectColor;
  final List<String>? projectTags;
  final List<ProjectMember>? members;
  final ProjectSettings? settings;

  ProjectCreateForm({
    this.workspaceId,
    this.projectName,
    this.projectDescription,
    this.projectType,
    this.projectIcon,
    this.projectColor,
    this.projectTags,
    this.members,
    this.settings
  });
}

class ProjectMember {
  final String? userId;
  final String? roleId;
  final String? roleName;
  final List<String>? permissions;

  ProjectMember({
    this.userId,
    this.roleId,
    this.roleName,
    this.permissions
  });
}

class ProjectCopyForm {
  final String? sourceProjectId;
  final String? targetWorkspaceId;
  final String? newName;
  final String? newProjectDescription;
  final bool? copyMembers;
  final bool? copyFiles;
  final bool? copySettings;
  final String? copyReason;

  ProjectCopyForm({
    this.sourceProjectId,
    this.targetWorkspaceId,
    this.newName,
    this.newProjectDescription,
    this.copyMembers,
    this.copyFiles,
    this.copySettings,
    this.copyReason
  });
}

class MemberInviteForm {
  final String? workspaceId;
  final List<String>? emails;
  final String? roleId;
  final String? roleName;
  final List<String>? permissions;
  final String? inviteMessage;
  final int? expireHours;
  final bool? needApproval;

  MemberInviteForm({
    this.workspaceId,
    this.emails,
    this.roleId,
    this.roleName,
    this.permissions,
    this.inviteMessage,
    this.expireHours,
    this.needApproval
  });
}

class VoteForm {
  final String? contentType;
  final int? contentId;
  final String? rating;
  final String? source;
  final String? deviceInfo;

  VoteForm({
    this.contentType,
    this.contentId,
    this.rating,
    this.source,
    this.deviceInfo
  });
}

class PlusApiResultVoteVO {
  final VoteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoteVO {
  final String? createdAt;
  final String? updatedAt;
  final String? voteId;
  final String? contentType;
  final int? contentId;
  final String? rating;

  VoteVO({
    this.createdAt,
    this.updatedAt,
    this.voteId,
    this.contentType,
    this.contentId,
    this.rating
  });
}

class VipPurchaseForm {
  final int? packId;
  final String? couponId;
  final String? paymentMethod;

  VipPurchaseForm({
    this.packId,
    this.couponId,
    this.paymentMethod
  });
}

class PlusApiResultVipPurchaseVO {
  final VipPurchaseVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipPurchaseVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipPurchaseVO {
  final String? createdAt;
  final String? updatedAt;
  final String? orderId;
  final int? packId;
  final String? packName;
  final double? amount;
  final int? durationDays;
  final int? targetLevelId;
  final String? targetLevelName;
  final String? status;

  VipPurchaseVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.packId,
    this.packName,
    this.amount,
    this.durationDays,
    this.targetLevelId,
    this.targetLevelName,
    this.status
  });
}

class VipUpgradeForm {
  final int? targetLevelId;
  final String? couponId;
  final String? paymentMethod;

  VipUpgradeForm({
    this.targetLevelId,
    this.couponId,
    this.paymentMethod
  });
}

class VipRenewForm {
  final int? duration;
  final int? packId;
  final String? couponId;
  final String? paymentMethod;

  VipRenewForm({
    this.duration,
    this.packId,
    this.couponId,
    this.paymentMethod
  });
}

class SpeedUpForm {
  final String? taskId;

  SpeedUpForm({
    this.taskId
  });
}

class PlusApiResultVipDailyRewardVO {
  final VipDailyRewardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipDailyRewardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipDailyRewardVO {
  final String? createdAt;
  final String? updatedAt;
  final int? rewardPoints;
  final String? claimedAt;
  final String? message;
  final int? consecutiveDays;

  VipDailyRewardVO({
    this.createdAt,
    this.updatedAt,
    this.rewardPoints,
    this.claimedAt,
    this.message,
    this.consecutiveDays
  });
}

class VipInviteForm {
  final String? email;
  final String? phone;
  final String? channel;

  VipInviteForm({
    this.email,
    this.phone,
    this.channel
  });
}

class PlusApiResultVipInviteVO {
  final VipInviteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipInviteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipInviteVO {
  final String? createdAt;
  final String? updatedAt;
  final String? inviteId;
  final String? email;
  final String? phone;
  final String? status;

  VipInviteVO({
    this.createdAt,
    this.updatedAt,
    this.inviteId,
    this.email,
    this.phone,
    this.status
  });
}

class VideoCreateForm {
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final int? width;
  final int? height;
  final int? categoryId;

  VideoCreateForm({
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.width,
    this.height,
    this.categoryId
  });
}

class AccountDeactivateForm {
  final String? reason;
  final String? verifyCode;
  final String? password;
  final bool? confirm;
  final String? remark;

  AccountDeactivateForm({
    this.reason,
    this.verifyCode,
    this.password,
    this.confirm,
    this.remark
  });
}

class ThirdPartyBindForm {
  final String? platform;
  final String? code;
  final String? thirdPartyUserId;
  final String? thirdPartyUserName;
  final String? thirdPartyAvatar;
  final String? accessToken;
  final String? refreshToken;
  final String? expireTime;

  ThirdPartyBindForm({
    this.platform,
    this.code,
    this.thirdPartyUserId,
    this.thirdPartyUserName,
    this.thirdPartyAvatar,
    this.accessToken,
    this.refreshToken,
    this.expireTime
  });
}

class PlusApiResultMapStringString {
  final Map<String, String>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMapStringString({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserAddressCreateForm {
  final String? name;
  final String? phone;
  final String? countryCode;
  final String? provinceCode;
  final String? cityCode;
  final String? districtCode;
  final String? addressDetail;
  final String? postalCode;
  final bool? isDefault;

  UserAddressCreateForm({
    this.name,
    this.phone,
    this.countryCode,
    this.provinceCode,
    this.cityCode,
    this.districtCode,
    this.addressDetail,
    this.postalCode,
    this.isDefault
  });
}

class PlusApiResultUploadPolicyVO {
  final UploadPolicyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUploadPolicyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UploadPolicyVO {
  final String? createdAt;
  final String? updatedAt;
  final String? bucketName;
  final String? objectKeyPrefix;
  final String? expirationTime;
  final int? maxFileSize;
  final int? minFileSize;
  final List<String>? allowedContentTypes;
  final bool? allowOverwrite;
  final String? callbackUrl;

  UploadPolicyVO({
    this.createdAt,
    this.updatedAt,
    this.bucketName,
    this.objectKeyPrefix,
    this.expirationTime,
    this.maxFileSize,
    this.minFileSize,
    this.allowedContentTypes,
    this.allowOverwrite,
    this.callbackUrl
  });
}

class PlusApiResultUploadCredentialsVO {
  final UploadCredentialsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUploadCredentialsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UploadCredentialsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? accessKeyId;
  final String? secretAccessKey;
  final String? sessionToken;
  final String? expirationTime;
  final String? bucket;
  final String? region;

  UploadCredentialsVO({
    this.createdAt,
    this.updatedAt,
    this.accessKeyId,
    this.secretAccessKey,
    this.sessionToken,
    this.expirationTime,
    this.bucket,
    this.region
  });
}

class PresignedUrlForm {
  final String? objectKey;
  final String? bucket;
  final String? method;
  final int? expirationSeconds;

  PresignedUrlForm({
    this.objectKey,
    this.bucket,
    this.method,
    this.expirationSeconds
  });
}

class PlusApiResultPresignedUrlVO {
  final PresignedUrlVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPresignedUrlVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PresignedUrlVO {
  final String? createdAt;
  final String? updatedAt;
  final String? url;
  final String? previewUrl;
  final String? objectKey;

  PresignedUrlVO({
    this.createdAt,
    this.updatedAt,
    this.url,
    this.previewUrl,
    this.objectKey
  });
}

class FileVO {
  final String? createdAt;
  final String? updatedAt;
  final String? fileId;
  final String? fileName;
  final int? fileSize;
  final String? fileType;
  final String? extension;
  final String? objectKey;
  final String? path;
  final String? diskId;
  final String? status;
  final String? uploadStatus;
  final String? contentType;
  final String? fileCategory;
  final String? assetType;
  final String? accessUrl;
  final String? uploadTime;

  FileVO({
    this.createdAt,
    this.updatedAt,
    this.fileId,
    this.fileName,
    this.fileSize,
    this.fileType,
    this.extension,
    this.objectKey,
    this.path,
    this.diskId,
    this.status,
    this.uploadStatus,
    this.contentType,
    this.fileCategory,
    this.assetType,
    this.accessUrl,
    this.uploadTime
  });
}

class PlusApiResultFileVO {
  final FileVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListFileVO {
  final List<FileVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUploadChunkVO {
  final UploadChunkVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUploadChunkVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UploadChunkVO {
  final String? createdAt;
  final String? updatedAt;
  final String? uploadId;
  final int? chunkIndex;
  final int? chunkSize;
  final String? status;
  final bool? success;
  final String? errorMsg;
  final String? chunkMd5;
  final int? uploadedSize;
  final int? remainingChunks;
  final int? progress;

  UploadChunkVO({
    this.createdAt,
    this.updatedAt,
    this.uploadId,
    this.chunkIndex,
    this.chunkSize,
    this.status,
    this.success,
    this.errorMsg,
    this.chunkMd5,
    this.uploadedSize,
    this.remainingChunks,
    this.progress
  });
}

class UploadInitForm {
  final String? fileName;
  final int? fileSize;
  final String? fileMd5;
  final String? fileType;
  final String? uploadType;
  final int? chunkSize;
  final int? totalChunks;
  final String? storagePath;
  final String? businessType;
  final String? businessId;

  UploadInitForm({
    this.fileName,
    this.fileSize,
    this.fileMd5,
    this.fileType,
    this.uploadType,
    this.chunkSize,
    this.totalChunks,
    this.storagePath,
    this.businessType,
    this.businessId
  });
}

class PlusApiResultUploadInitVO {
  final UploadInitVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUploadInitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UploadInitVO {
  final String? createdAt;
  final String? updatedAt;
  final String? uploadId;
  final String? fileName;
  final int? fileSize;
  final int? chunkSize;
  final int? totalChunks;
  final String? storagePath;
  final String? uploadUrl;
  final dynamic? uploadParams;
  final List<int>? uploadedChunks;
  final int? expireTime;
  final bool? supportResume;
  final String? uploadType;

  UploadInitVO({
    this.createdAt,
    this.updatedAt,
    this.uploadId,
    this.fileName,
    this.fileSize,
    this.chunkSize,
    this.totalChunks,
    this.storagePath,
    this.uploadUrl,
    this.uploadParams,
    this.uploadedChunks,
    this.expireTime,
    this.supportResume,
    this.uploadType
  });
}

class TenantCreateForm {
  final String? name;
  final String? code;
  final String? type;
  final String? bizType;
  final int? bizId;
  final String? description;
  final int? adminUserId;
  final String? contactPerson;
  final String? contactPhone;
  final String? expireTime;

  TenantCreateForm({
    this.name,
    this.code,
    this.type,
    this.bizType,
    this.bizId,
    this.description,
    this.adminUserId,
    this.contactPerson,
    this.contactPhone,
    this.expireTime
  });
}

class SendMessageForm {
  final String? recipientId;
  final String? content;
  final String? messageType;
  final String? conversationId;
  final String? attachmentUrl;

  SendMessageForm({
    this.recipientId,
    this.content,
    this.messageType,
    this.conversationId,
    this.attachmentUrl
  });
}

class PlusApiResultPrivateMessageVO {
  final PrivateMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPrivateMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PrivateMessageVO {
  final String? createdAt;
  final String? updatedAt;
  final String? messageId;
  final String? senderId;
  final String? recipientId;
  final String? content;
  final String? messageType;
  final String? sendTime;
  final bool? isRead;
  final String? attachmentUrl;

  PrivateMessageVO({
    this.createdAt,
    this.updatedAt,
    this.messageId,
    this.senderId,
    this.recipientId,
    this.content,
    this.messageType,
    this.sendTime,
    this.isRead,
    this.attachmentUrl
  });
}

class FollowVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final bool? isFollowing;
  final String? userId;

  FollowVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.isFollowing,
    this.userId
  });
}

class PlusApiResultFollowVO {
  final FollowVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFollowVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BatchFollowCheckForm {
  final List<String>? userIds;
  final String? checkType;

  BatchFollowCheckForm({
    this.userIds,
    this.checkType
  });
}

class FollowCheckVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? isFollowing;
  final String? followTime;
  final bool? isFollowedBy;

  FollowCheckVO({
    this.createdAt,
    this.updatedAt,
    this.isFollowing,
    this.followTime,
    this.isFollowedBy
  });
}

class PlusApiResultListFollowCheckVO {
  final List<FollowCheckVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFollowCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShopCreateForm {
  final String? name;
  final String? description;
  final String? logoUrl;
  final String? coverUrl;
  final String? contactPhone;
  final String? contactEmail;
  final String? address;
  final double? latitude;
  final double? longitude;
  final String? licenseNumber;
  final List<String>? tags;
  final String? businessHours;

  ShopCreateForm({
    this.name,
    this.description,
    this.logoUrl,
    this.coverUrl,
    this.contactPhone,
    this.contactEmail,
    this.address,
    this.latitude,
    this.longitude,
    this.licenseNumber,
    this.tags,
    this.businessHours
  });
}

class ShareCreateForm {
  final String? shareType;
  final String? contentId;
  final String? title;
  final String? description;
  final String? imageUrl;
  final int? expireSeconds;
  final bool? passwordRequired;
  final String? password;
  final String? channel;

  ShareCreateForm({
    this.shareType,
    this.contentId,
    this.title,
    this.description,
    this.imageUrl,
    this.expireSeconds,
    this.passwordRequired,
    this.password,
    this.channel
  });
}

class PlusApiResultShareCreateVO {
  final ShareCreateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShareCreateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShareCreateVO {
  final String? createdAt;
  final String? updatedAt;
  final String? shareId;
  final String? shareUrl;
  final String? qrCode;
  final String? expireTime;
  final String? password;

  ShareCreateVO({
    this.createdAt,
    this.updatedAt,
    this.shareId,
    this.shareUrl,
    this.qrCode,
    this.expireTime,
    this.password
  });
}

class ShareVisitForm {
  final String? shareId;
  final String? visitType;
  final String? userAgent;
  final String? ipAddress;
  final String? deviceInfo;

  ShareVisitForm({
    this.shareId,
    this.visitType,
    this.userAgent,
    this.ipAddress,
    this.deviceInfo
  });
}

class ShareVerifyForm {
  final String? shareId;
  final String? password;
  final String? verificationCode;

  ShareVerifyForm({
    this.shareId,
    this.password,
    this.verificationCode
  });
}

class PlusApiResultShareVerifyVO {
  final ShareVerifyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShareVerifyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShareInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? shareId;
  final String? shareType;
  final String? title;
  final String? description;
  final String? imageUrl;
  final String? shareUrl;
  final String? createTime;
  final String? expireTime;
  final String? status;
  final int? visitCount;

  ShareInfoVO({
    this.createdAt,
    this.updatedAt,
    this.shareId,
    this.shareType,
    this.title,
    this.description,
    this.imageUrl,
    this.shareUrl,
    this.createTime,
    this.expireTime,
    this.status,
    this.visitCount
  });
}

class ShareVerifyVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? valid;
  final String? errorMessage;
  final ShareInfoVO? shareInfo;

  ShareVerifyVO({
    this.createdAt,
    this.updatedAt,
    this.valid,
    this.errorMessage,
    this.shareInfo
  });
}

class ShareTrackForm {
  final String? shareId;
  final String? trackType;
  final String? userAgent;
  final String? ipAddress;
  final String? deviceInfo;

  ShareTrackForm({
    this.shareId,
    this.trackType,
    this.userAgent,
    this.ipAddress,
    this.deviceInfo
  });
}

class SharePosterForm {
  final String? shareType;
  final String? shareId;
  final String? template;
  final String? backgroundColor;
  final String? textColor;
  final bool? includeQrCode;
  final String? customText;

  SharePosterForm({
    this.shareType,
    this.shareId,
    this.template,
    this.backgroundColor,
    this.textColor,
    this.includeQrCode,
    this.customText
  });
}

class PlusApiResultSharePosterVO {
  final SharePosterVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSharePosterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SharePosterVO {
  final String? createdAt;
  final String? updatedAt;
  final String? posterUrl;
  final int? width;
  final int? height;
  final String? fileSize;

  SharePosterVO({
    this.createdAt,
    this.updatedAt,
    this.posterUrl,
    this.width,
    this.height,
    this.fileSize
  });
}

class InviteRewardClaimVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? amount;
  final String? balance;
  final String? transactionId;

  InviteRewardClaimVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.amount,
    this.balance,
    this.transactionId
  });
}

class PlusApiResultInviteRewardClaimVO {
  final InviteRewardClaimVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInviteRewardClaimVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InviteLinkForm {
  final String? inviteType;
  final int? expireSeconds;
  final String? inviteCode;
  final String? channel;

  InviteLinkForm({
    this.inviteType,
    this.expireSeconds,
    this.inviteCode,
    this.channel
  });
}

class InviteLinkVO {
  final String? createdAt;
  final String? updatedAt;
  final String? inviteLink;
  final String? inviteCode;
  final String? expireTime;
  final String? qrCode;

  InviteLinkVO({
    this.createdAt,
    this.updatedAt,
    this.inviteLink,
    this.inviteCode,
    this.expireTime,
    this.qrCode
  });
}

class PlusApiResultInviteLinkVO {
  final InviteLinkVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInviteLinkVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DataExportForm {
  final String? format;
  final String? dataType;
  final bool? includeMedia;
  final String? startTime;
  final String? endTime;
  final String? email;

  DataExportForm({
    this.format,
    this.dataType,
    this.includeMedia,
    this.startTime,
    this.endTime,
    this.email
  });
}

class DataExportVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? status;
  final String? downloadUrl;
  final String? fileSize;
  final String? estimatedCompletionTime;
  final int? progress;
  final String? errorMessage;

  DataExportVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.status,
    this.downloadUrl,
    this.fileSize,
    this.estimatedCompletionTime,
    this.progress,
    this.errorMessage
  });
}

class PlusApiResultDataExportVO {
  final DataExportVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDataExportVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SearchHistoryAddRequest {
  final String? keyword;

  SearchHistoryAddRequest({
    this.keyword
  });
}

class AdvancedSearchRequest {
  final String? keyword;
  final String? type;
  final Map<String, dynamic>? filters;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  AdvancedSearchRequest({
    this.keyword,
    this.type,
    this.filters,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageSearchResult {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<SearchResult>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageSearchResult({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PageableObject {
  final int? offset;
  final SortObject? sort;
  final bool? paged;
  final int? pageNumber;
  final int? pageSize;
  final bool? unpaged;

  PageableObject({
    this.offset,
    this.sort,
    this.paged,
    this.pageNumber,
    this.pageSize,
    this.unpaged
  });
}

class PlusApiResultPageSearchResult {
  final PageSearchResult? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageSearchResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SearchResult {
  final String? id;
  final String? title;
  final String? content;
  final String? type;
  final String? path;

  SearchResult({
    this.id,
    this.title,
    this.content,
    this.type,
    this.path
  });
}

class SortObject {
  final bool? empty;
  final bool? sorted;
  final bool? unsorted;

  SortObject({
    this.empty,
    this.sorted,
    this.unsorted
  });
}

class PromptCreateForm {
  final String? title;
  final String? content;
  final String? type;
  final String? bizType;
  final String? description;
  final int? cateId;
  final int? sort;
  final Map<String, dynamic>? parameters;
  final String? model;
  final bool? isPublic;

  PromptCreateForm({
    this.title,
    this.content,
    this.type,
    this.bizType,
    this.description,
    this.cateId,
    this.sort,
    this.parameters,
    this.model,
    this.isPublic
  });
}

class ProjectCreateRequest {
  final String? name;
  final String? description;
  final String? workspaceId;
  final String? type;
  final List<String>? tags;
  final bool? isPublic;

  ProjectCreateRequest({
    this.name,
    this.description,
    this.workspaceId,
    this.type,
    this.tags,
    this.isPublic
  });
}

class ProjectCopyRequest {
  final String? targetWorkspaceId;
  final String? newName;

  ProjectCopyRequest({
    this.targetWorkspaceId,
    this.newName
  });
}

class PaymentCreateForm {
  final String? orderId;
  final String? businessType;
  final String? businessOrderId;
  final String? amount;
  final String? paymentMethod;
  final String? paymentScene;
  final String? clientIp;
  final String? paymentProvider;
  final String? productType;

  PaymentCreateForm({
    this.orderId,
    this.businessType,
    this.businessOrderId,
    this.amount,
    this.paymentMethod,
    this.paymentScene,
    this.clientIp,
    this.paymentProvider,
    this.productType
  });
}

class PaymentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? paymentOrderId;
  final String? merchantOrderId;
  final String? status;
  final String? amount;
  final String? paymentMethod;
  final String? paymentUrl;
  final String? qrCode;
  final int? paymentId;
  final String? paymentSn;
  final int? orderId;
  final String? subject;
  final String? paymentProvider;
  final String? paymentProviderName;
  final String? productType;
  final String? productTypeName;
  final String? statusName;
  final String? expireTime;
  final bool? needQuery;
  final int? queryInterval;
  final String? remark;
  final Map<String, dynamic>? paymentParams;
  final String? transactionId;
  final String? outTradeNo;
  final String? successTime;

  PaymentVO({
    this.createdAt,
    this.updatedAt,
    this.paymentOrderId,
    this.merchantOrderId,
    this.status,
    this.amount,
    this.paymentMethod,
    this.paymentUrl,
    this.qrCode,
    this.paymentId,
    this.paymentSn,
    this.orderId,
    this.subject,
    this.paymentProvider,
    this.paymentProviderName,
    this.productType,
    this.productTypeName,
    this.statusName,
    this.expireTime,
    this.needQuery,
    this.queryInterval,
    this.remark,
    this.paymentParams,
    this.transactionId,
    this.outTradeNo,
    this.successTime
  });
}

class PlusApiResultPaymentVO {
  final PaymentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPaymentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PartnerCreateForm {
  final String? name;
  final String? contactName;
  final String? contactPhone;
  final String? contactEmail;
  final String? level;
  final int? parentId;

  PartnerCreateForm({
    this.name,
    this.contactName,
    this.contactPhone,
    this.contactEmail,
    this.level,
    this.parentId
  });
}

class CommissionForm {
  final double? amount;

  CommissionForm({
    this.amount
  });
}

class OrganizationCreateForm {
  final String? name;
  final String? code;
  final String? description;
  final int? parentId;
  final String? contactPerson;
  final String? contactPhone;
  final String? contactEmail;
  final String? address;
  final String? website;
  final String? logoUrl;

  OrganizationCreateForm({
    this.name,
    this.code,
    this.description,
    this.parentId,
    this.contactPerson,
    this.contactPhone,
    this.contactEmail,
    this.address,
    this.website,
    this.logoUrl
  });
}

class OrganizationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? status;
  final String? description;
  final String? contactPerson;
  final String? contactPhone;
  final String? contactEmail;
  final String? logoUrl;

  OrganizationVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.status,
    this.description,
    this.contactPerson,
    this.contactPhone,
    this.contactEmail,
    this.logoUrl
  });
}

class PlusApiResultOrganizationVO {
  final OrganizationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrganizationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PositionCreateForm {
  final String? name;
  final String? code;
  final String? description;
  final int? ownerId;
  final int? parentId;
  final int? level;
  final int? sortOrder;
  final String? category;
  final int? requiredExperienceYears;
  final String? requiredEducation;
  final int? maxMemberCount;

  PositionCreateForm({
    this.name,
    this.code,
    this.description,
    this.ownerId,
    this.parentId,
    this.level,
    this.sortOrder,
    this.category,
    this.requiredExperienceYears,
    this.requiredEducation,
    this.maxMemberCount
  });
}

class PlusApiResultPositionVO {
  final PositionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPositionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PositionVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? description;
  final int? ownerId;
  final int? parentId;
  final int? level;
  final bool? isActive;
  final int? sortOrder;
  final String? category;
  final String? levelName;

  PositionVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.description,
    this.ownerId,
    this.parentId,
    this.level,
    this.isActive,
    this.sortOrder,
    this.category,
    this.levelName
  });
}

class DepartmentCreateForm {
  final String? name;
  final String? code;
  final String? description;
  final int? ownerId;
  final int? parentId;
  final int? sortOrder;
  final int? managerId;
  final String? phone;
  final String? email;

  DepartmentCreateForm({
    this.name,
    this.code,
    this.description,
    this.ownerId,
    this.parentId,
    this.sortOrder,
    this.managerId,
    this.phone,
    this.email
  });
}

class DepartmentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? description;
  final int? ownerId;
  final int? parentId;
  final int? level;
  final bool? isActive;
  final int? sortOrder;
  final String? fullPathName;

  DepartmentVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.description,
    this.ownerId,
    this.parentId,
    this.level,
    this.isActive,
    this.sortOrder,
    this.fullPathName
  });
}

class PlusApiResultDepartmentVO {
  final DepartmentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDepartmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderCreateForm {
  final String? orderType;
  final String? productId;
  final int? quantity;
  final List<OrderItemForm>? items;
  final String? addressId;
  final String? paymentMethod;
  final String? couponId;
  final String? remark;
  final String? sourceChannel;
  final int? rechargePoints;

  OrderCreateForm({
    this.orderType,
    this.productId,
    this.quantity,
    this.items,
    this.addressId,
    this.paymentMethod,
    this.couponId,
    this.remark,
    this.sourceChannel,
    this.rechargePoints
  });
}

class OrderItemForm {
  final String? productId;
  final int? quantity;
  final String? price;
  final String? productName;

  OrderItemForm({
    this.productId,
    this.quantity,
    this.price,
    this.productName
  });
}

class OrderVO {
  final String? createdAt;
  final String? updatedAt;
  final String? orderId;
  final String? orderSn;
  final String? orderType;
  final String? subject;
  final String? productImage;
  final int? quantity;
  final String? totalAmount;
  final String? paidAmount;
  final String? paidPointsAmount;
  final String? discountAmount;
  final String? shippingAmount;
  final String? status;
  final String? statusName;
  final String? refundStatus;
  final String? paymentMethod;
  final String? paymentProvider;
  final String? payTime;
  final String? expireTime;
  final String? remark;

  OrderVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.orderType,
    this.subject,
    this.productImage,
    this.quantity,
    this.totalAmount,
    this.paidAmount,
    this.paidPointsAmount,
    this.discountAmount,
    this.shippingAmount,
    this.status,
    this.statusName,
    this.refundStatus,
    this.paymentMethod,
    this.paymentProvider,
    this.payTime,
    this.expireTime,
    this.remark
  });
}

class PlusApiResultOrderVO {
  final OrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RefundApplyForm {
  final String? orderId;
  final String? refundAmount;
  final String? refundReason;
  final String? reason;
  final String? refundType;
  final String? proofImage;

  RefundApplyForm({
    this.orderId,
    this.refundAmount,
    this.refundReason,
    this.reason,
    this.refundType,
    this.proofImage
  });
}

class OrderPayForm {
  final String? orderId;
  final String? paymentMethod;
  final String? amount;
  final String? paymentPassword;
  final String? clientIp;

  OrderPayForm({
    this.orderId,
    this.paymentMethod,
    this.amount,
    this.paymentPassword,
    this.clientIp
  });
}

class PaymentParamsVO {
  final String? orderId;
  final String? amount;
  final String? paymentMethod;

  PaymentParamsVO({
    this.orderId,
    this.amount,
    this.paymentMethod
  });
}

class PlusApiResultPaymentParamsVO {
  final PaymentParamsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPaymentParamsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderCancelForm {
  final String? orderId;
  final String? cancelReason;
  final String? reason;
  final String? cancelType;

  OrderCancelForm({
    this.orderId,
    this.cancelReason,
    this.reason,
    this.cancelType
  });
}

class TestNotificationForm {
  final String? title;
  final String? content;
  final String? type;
  final String? deviceId;

  TestNotificationForm({
    this.title,
    this.content,
    this.type,
    this.deviceId
  });
}

class TopicSubscribeForm {
  final String? topic;
  final bool? subscribe;
  final String? deviceId;

  TopicSubscribeForm({
    this.topic,
    this.subscribe,
    this.deviceId
  });
}

class DeviceRegisterForm {
  final String? deviceType;
  final String? deviceId;
  final String? pushToken;
  final String? osVersion;
  final String? appVersion;

  DeviceRegisterForm({
    this.deviceType,
    this.deviceId,
    this.pushToken,
    this.osVersion,
    this.appVersion
  });
}

class NoteCreateRequest {
  final String? title;
  final String? content;
  final String? folderId;
  final List<String>? tags;

  NoteCreateRequest({
    this.title,
    this.content,
    this.folderId,
    this.tags
  });
}

class NoteCopyRequest {
  final String? folderId;
  final String? title;

  NoteCopyRequest({
    this.folderId,
    this.title
  });
}

class NoteFolderCreateRequest {
  final String? name;
  final String? parentId;

  NoteFolderCreateRequest({
    this.name,
    this.parentId
  });
}

class NewsCreateForm {
  final String? title;
  final String? summary;
  final String? url;
  final String? source;
  final int? categoryId;

  NewsCreateForm({
    this.title,
    this.summary,
    this.url,
    this.source,
    this.categoryId
  });
}

class MusicCreateForm {
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final String? artist;
  final String? genre;

  MusicCreateForm({
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.artist,
    this.genre
  });
}

class ModelPriceVO {
  final String? createdAt;
  final String? updatedAt;
  final String? model;
  final String? unit;
  final String? currency;
  final double? price;
  final double? inputPrice;
  final double? outputPrice;
  final double? batchInputPrice;
  final double? batchOutputPrice;
  final double? cachedInputPrice;
  final double? batchCachedInputPrice;

  ModelPriceVO({
    this.createdAt,
    this.updatedAt,
    this.model,
    this.unit,
    this.currency,
    this.price,
    this.inputPrice,
    this.outputPrice,
    this.batchInputPrice,
    this.batchOutputPrice,
    this.cachedInputPrice,
    this.batchCachedInputPrice
  });
}

class PlusApiResultListModelPriceVO {
  final List<ModelPriceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListModelPriceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InvoiceCreateForm {
  final String? title;
  final String? titleType;
  final String? taxNo;
  final String? type;
  final double? totalAmount;

  InvoiceCreateForm({
    this.title,
    this.titleType,
    this.taxNo,
    this.type,
    this.totalAmount
  });
}

class InvoiceCancelForm {
  final String? cancelReason;

  InvoiceCancelForm({
    this.cancelReason
  });
}

class ImageCreateForm {
  final String? title;
  final String? description;
  final String? url;
  final String? format;
  final int? width;
  final int? height;

  ImageCreateForm({
    this.title,
    this.description,
    this.url,
    this.format,
    this.width,
    this.height
  });
}

class BrowseHistoryAddForm {
  final String? type;
  final String? targetId;
  final String? targetName;
  final String? targetDescription;
  final String? targetIcon;
  final int? duration;
  final String? source;

  BrowseHistoryAddForm({
    this.type,
    this.targetId,
    this.targetName,
    this.targetDescription,
    this.targetIcon,
    this.duration,
    this.source
  });
}

class AssetMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final ImageMediaResource? image;
  final VideoMediaResource? video;
  final AudioMediaResource? audio;
  final MusicMediaResource? music;
  final CharacterMediaResource? character;
  final FileMediaResource? file;
  final Map<String, dynamic>? extraProps;

  AssetMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.image,
    this.video,
    this.audio,
    this.music,
    this.character,
    this.file,
    this.extraProps
  });
}

class AudioMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final String? format;
  final int? bitRate;
  final int? sampleRate;
  final int? channels;
  final int? duration;

  AudioMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.format,
    this.bitRate,
    this.sampleRate,
    this.channels,
    this.duration
  });
}

class CharacterMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final String? characterType;
  final String? gender;
  final String? ageGroup;
  final String? avatarUrl;
  final String? avatarVideoUrl;
  final int? speakerId;
  final Map<String, dynamic>? appearanceParams;
  final Map<String, dynamic>? animationParams;

  CharacterMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.characterType,
    this.gender,
    this.ageGroup,
    this.avatarUrl,
    this.avatarVideoUrl,
    this.speakerId,
    this.appearanceParams,
    this.animationParams
  });
}

class MusicMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final String? format;
  final int? duration;

  MusicMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.format,
    this.duration
  });
}

class VideoMediaResource {
  final int? id;
  final String? uuid;
  final String? url;
  final String? bytes;
  final dynamic? localFile;
  final String? base64;
  final String? type;
  final String? mimeType;
  final int? size;
  final String? name;
  final String? extension;
  final TagsContent? tags;
  final Map<String, dynamic>? metadata;
  final String? prompt;
  final int? duration;
  final int? width;
  final int? height;

  VideoMediaResource({
    this.id,
    this.uuid,
    this.url,
    this.bytes,
    this.localFile,
    this.base64,
    this.type,
    this.mimeType,
    this.size,
    this.name,
    this.extension,
    this.tags,
    this.metadata,
    this.prompt,
    this.duration,
    this.width,
    this.height
  });
}

class VoiceSpeakerGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final String? speakerName;
  final String? text;
  final String? speakerId;
  final String? language;
  final double? speed;
  final double? pitch;
  final int? volume;
  final String? format;
  final String? emotion;
  final String? type;
  final int? referenceAssetCount;

  VoiceSpeakerGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.speakerName,
    this.text,
    this.speakerId,
    this.language,
    this.speed,
    this.pitch,
    this.volume,
    this.format,
    this.emotion,
    this.type,
    this.referenceAssetCount
  });
}

class AssetMediaResourceList {
  final List<ImageMediaResource>? images;
  final List<VideoMediaResource>? videos;
  final List<AudioMediaResource>? audios;
  final List<FileMediaResource>? files;
  final List<MusicMediaResource>? musics;
  final List<AssetMediaResource>? resources;

  AssetMediaResourceList({
    this.images,
    this.videos,
    this.audios,
    this.files,
    this.musics,
    this.resources
  });
}

class AudioEffectGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? description;
  final String? category;
  final int? duration;
  final int? sampleRate;
  final int? bitRate;
  final int? channels;
  final bool? loop;
  final double? fadeIn;
  final double? fadeOut;
  final int? referenceAssetCount;

  AudioEffectGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.description,
    this.category,
    this.duration,
    this.sampleRate,
    this.bitRate,
    this.channels,
    this.loop,
    this.fadeIn,
    this.fadeOut,
    this.referenceAssetCount
  });
}

class AudioGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? text;
  final String? voice;
  final int? voiceSpeakerId;
  final String? language;
  final double? speed;
  final double? pitch;
  final int? volume;
  final int? sampleRate;
  final int? bitRate;
  final int? channels;
  final String? emotion;
  final int? referenceAssetCount;

  AudioGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.text,
    this.voice,
    this.voiceSpeakerId,
    this.language,
    this.speed,
    this.pitch,
    this.volume,
    this.sampleRate,
    this.bitRate,
    this.channels,
    this.emotion,
    this.referenceAssetCount
  });
}

class BaseGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final int? referenceAssetCount;

  BaseGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.referenceAssetCount
  });
}

class CharacterGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? name;
  final String? description;
  final String? appearance;
  final String? personality;
  final String? background;
  final String? type;
  final String? style;
  final String? pose;
  final String? expression;
  final String? gender;
  final String? age;
  final String? clothing;
  final int? width;
  final int? height;
  final bool? hd;
  final bool? multiView;
  final int? referenceAssetCount;

  CharacterGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.name,
    this.description,
    this.appearance,
    this.personality,
    this.background,
    this.type,
    this.style,
    this.pose,
    this.expression,
    this.gender,
    this.age,
    this.clothing,
    this.width,
    this.height,
    this.hd,
    this.multiView,
    this.referenceAssetCount
  });
}

class GenerationInput {
  final String? type;
  final ImageGenerationInput? image;
  final VideoGenerationInput? video;
  final AudioGenerationInput? audio;
  final MusicGenerationInput? music;
  final CharacterGenerationInput? character;
  final VoiceSpeakerGenerationInput? voiceSpeaker;
  final AudioEffectGenerationInput? audioEffect;
  final BaseGenerationInput? input;
  final String? prompt;

  GenerationInput({
    this.type,
    this.image,
    this.video,
    this.audio,
    this.music,
    this.character,
    this.voiceSpeaker,
    this.audioEffect,
    this.input,
    this.prompt
  });
}

class GenerationOutput {
  final List<AssetMediaResource>? resources;
  final String? primaryUrl;
  final List<String>? urls;
  final int? durationMs;
  final int? tokenUsage;
  final double? cost;
  final String? modelVersion;
  final int? seed;
  final Map<String, dynamic>? metadata;
  final String? createdAt;
  final int? resourceCount;
  final AssetMediaResource? primaryResource;

  GenerationOutput({
    this.resources,
    this.primaryUrl,
    this.urls,
    this.durationMs,
    this.tokenUsage,
    this.cost,
    this.modelVersion,
    this.seed,
    this.metadata,
    this.createdAt,
    this.resourceCount,
    this.primaryResource
  });
}

class GenerationTaskVO {
  final String? createdAt;
  final String? updatedAt;
  final int? taskId;
  final String? requestId;
  final String? type;
  final String? model;
  final String? channel;
  final String? status;
  final int? progress;
  final GenerationInput? inputParams;
  final GenerationOutput? outputResult;
  final double? cost;
  final String? errorCode;
  final String? errorMessage;
  final int? retryCount;
  final int? maxRetry;
  final String? startedAt;
  final String? completedAt;
  final int? conversationId;
  final int? messageId;
  final int? parentId;
  final String? batchId;
  final String? bizScene;
  final int? bizId;
  final bool? done;

  GenerationTaskVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.requestId,
    this.type,
    this.model,
    this.channel,
    this.status,
    this.progress,
    this.inputParams,
    this.outputResult,
    this.cost,
    this.errorCode,
    this.errorMessage,
    this.retryCount,
    this.maxRetry,
    this.startedAt,
    this.completedAt,
    this.conversationId,
    this.messageId,
    this.parentId,
    this.batchId,
    this.bizScene,
    this.bizId,
    this.done
  });
}

class ImageGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final int? width;
  final int? height;
  final String? size;
  final String? quality;
  final String? style;
  final double? cfgScale;
  final int? steps;
  final String? sampler;
  final double? strength;
  final bool? safetyChecker;
  final String? aspectRatio;
  final int? referenceAssetCount;

  ImageGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.width,
    this.height,
    this.size,
    this.quality,
    this.style,
    this.cfgScale,
    this.steps,
    this.sampler,
    this.strength,
    this.safetyChecker,
    this.aspectRatio,
    this.referenceAssetCount
  });
}

class MusicGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? lyrics;
  final int? duration;
  final String? genre;
  final String? style;
  final int? tempo;
  final String? key;
  final String? timeSignature;
  final String? mood;
  final String? instruments;
  final bool? instrumental;
  final bool? hd;
  final int? referenceAssetCount;

  MusicGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.lyrics,
    this.duration,
    this.genre,
    this.style,
    this.tempo,
    this.key,
    this.timeSignature,
    this.mood,
    this.instruments,
    this.instrumental,
    this.hd,
    this.referenceAssetCount
  });
}

class PlusApiResultGenerationTaskVO {
  final GenerationTaskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerationTaskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final int? width;
  final int? height;
  final int? duration;
  final int? fps;
  final String? style;
  final String? aspectRatio;
  final int? motionStrength;
  final String? cameraMotion;
  final bool? loop;
  final bool? hd;
  final bool? subtitle;
  final bool? textToVideo;
  final int? referenceAssetCount;

  VideoGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.width,
    this.height,
    this.duration,
    this.fps,
    this.style,
    this.aspectRatio,
    this.motionStrength,
    this.cameraMotion,
    this.loop,
    this.hd,
    this.subtitle,
    this.textToVideo,
    this.referenceAssetCount
  });
}

class VideoShotItem {
  final String? id;
  final String? uuid;
  final String? shotPrompt;
  final String? dialogue;
  final double? duration;
  final ImageMediaResource? startFrame;
  final ImageMediaResource? endFrame;
  final ImageMediaResource? image;
  final AssetMediaResourceList? resourceList;
  final String? emotion;
  final String? videoDescription;
  final VideoMediaResource? video;

  VideoShotItem({
    this.id,
    this.uuid,
    this.shotPrompt,
    this.dialogue,
    this.duration,
    this.startFrame,
    this.endFrame,
    this.image,
    this.resourceList,
    this.emotion,
    this.videoDescription,
    this.video
  });
}

class VideoStoryboard {
  final List<VideoShotItem>? shots;
  final VideoMediaResource? finalVideo;
  final AudioMediaResource? finalAudio;
  final String? title;
  final String? description;
  final String? style;
  final String? aspectRatio;
  final String? prompt;
  final double? duration;
  final VoiceSpeakerInfo? speaker;

  VideoStoryboard({
    this.shots,
    this.finalVideo,
    this.finalAudio,
    this.title,
    this.description,
    this.style,
    this.aspectRatio,
    this.prompt,
    this.duration,
    this.speaker
  });
}

class VoiceMotion {


  VoiceMotion({

  });
}

class VoiceSpeakerGenerationInput {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final List<AssetMediaResource>? referenceAssets;
  final VideoStoryboard? storyboard;
  final Map<String, dynamic>? parameters;
  final int? n;
  final int? seed;
  final String? format;
  final String? text;
  final String? speakerName;
  final String? speakerId;
  final String? language;
  final double? speed;
  final double? pitch;
  final int? volume;
  final String? emotion;
  final bool? saveSpeaker;
  final bool? usingExistingSpeaker;
  final bool? voiceClone;
  final int? referenceAssetCount;

  VoiceSpeakerGenerationInput({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.referenceAssets,
    this.storyboard,
    this.parameters,
    this.n,
    this.seed,
    this.format,
    this.text,
    this.speakerName,
    this.speakerId,
    this.language,
    this.speed,
    this.pitch,
    this.volume,
    this.emotion,
    this.saveSpeaker,
    this.usingExistingSpeaker,
    this.voiceClone,
    this.referenceAssetCount
  });
}

class VoiceSpeakerInfo {
  final String? channel;
  final String? provider;
  final String? product;
  final String? id;
  final List<String>? models;
  final String? speakerId;
  final String? displayName;
  final TagsContent? tags;
  final VoiceMotion? motion;
  final VoiceStyle? style;
  final String? description;

  VoiceSpeakerInfo({
    this.channel,
    this.provider,
    this.product,
    this.id,
    this.models,
    this.speakerId,
    this.displayName,
    this.tags,
    this.motion,
    this.style,
    this.description
  });
}

class VoiceStyle {


  VoiceStyle({

  });
}

class VoiceSpeakerCloneForm {
  final String? sampleAudioUrl;
  final String? speakerName;
  final String? language;
  final String? model;

  VoiceSpeakerCloneForm({
    this.sampleAudioUrl,
    this.speakerName,
    this.language,
    this.model
  });
}

class VideoGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final int? width;
  final int? height;
  final int? duration;
  final int? fps;
  final String? format;
  final String? style;
  final String? aspectRatio;
  final int? motionStrength;
  final String? cameraMotion;
  final bool? loop;
  final bool? hd;
  final List<String>? audioUrls;
  final String? type;
  final int? referenceAssetCount;

  VideoGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.width,
    this.height,
    this.duration,
    this.fps,
    this.format,
    this.style,
    this.aspectRatio,
    this.motionStrength,
    this.cameraMotion,
    this.loop,
    this.hd,
    this.audioUrls,
    this.type,
    this.referenceAssetCount
  });
}

class VideoStyleTransferForm {
  final String? videoUrl;
  final String? style;
  final String? model;

  VideoStyleTransferForm({
    this.videoUrl,
    this.style,
    this.model
  });
}

class ImageToVideoForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final int? duration;
  final int? width;
  final int? height;
  final String? format;
  final int? motionStrength;
  final String? cameraMotion;
  final List<String>? audioUrls;
  final String? type;
  final int? referenceAssetCount;

  ImageToVideoForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.duration,
    this.width,
    this.height,
    this.format,
    this.motionStrength,
    this.cameraMotion,
    this.audioUrls,
    this.type,
    this.referenceAssetCount
  });
}

class VideoExtendForm {
  final String? videoUrl;
  final int? extendDuration;
  final String? model;
  final String? style;

  VideoExtendForm({
    this.videoUrl,
    this.extendDuration,
    this.model,
    this.style
  });
}

class GenerationStyleCreateForm {
  final String? name;
  final String? description;
  final String? type;
  final Map<String, dynamic>? configParams;
  final bool? isPublic;

  GenerationStyleCreateForm({
    this.name,
    this.description,
    this.type,
    this.configParams,
    this.isPublic
  });
}

class SoundEffectGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final String? description;
  final String? category;
  final int? duration;
  final String? format;
  final bool? loop;
  final String? type;
  final int? referenceAssetCount;

  SoundEffectGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.description,
    this.category,
    this.duration,
    this.format,
    this.loop,
    this.type,
    this.referenceAssetCount
  });
}

class MusicGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final String? lyrics;
  final int? duration;
  final String? genre;
  final String? style;
  final int? tempo;
  final String? key;
  final String? mood;
  final String? instruments;
  final String? format;
  final String? type;
  final int? referenceAssetCount;

  MusicGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.lyrics,
    this.duration,
    this.genre,
    this.style,
    this.tempo,
    this.key,
    this.mood,
    this.instruments,
    this.format,
    this.type,
    this.referenceAssetCount
  });
}

class MusicSimilarForm {
  final String? referenceUrl;
  final int? duration;
  final String? model;

  MusicSimilarForm({
    this.referenceUrl,
    this.duration,
    this.model
  });
}

class MusicRemixForm {
  final String? musicUrl;
  final String? style;
  final String? model;

  MusicRemixForm({
    this.musicUrl,
    this.style,
    this.model
  });
}

class MusicExtendForm {
  final String? musicUrl;
  final int? extendDuration;
  final String? model;
  final String? style;

  MusicExtendForm({
    this.musicUrl,
    this.extendDuration,
    this.model,
    this.style
  });
}

class ImageGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final int? width;
  final int? height;
  final String? size;
  final String? quality;
  final String? style;
  final String? format;
  final double? cfgScale;
  final int? steps;
  final String? sampler;
  final double? strength;
  final List<AssetMediaResource>? maskAssets;
  final bool? safetyChecker;
  final String? aspectRatio;
  final String? type;
  final int? referenceAssetCount;

  ImageGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.width,
    this.height,
    this.size,
    this.quality,
    this.style,
    this.format,
    this.cfgScale,
    this.steps,
    this.sampler,
    this.strength,
    this.maskAssets,
    this.safetyChecker,
    this.aspectRatio,
    this.type,
    this.referenceAssetCount
  });
}

class ImageVariationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final int? width;
  final int? height;
  final String? format;
  final String? type;
  final int? referenceAssetCount;

  ImageVariationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.width,
    this.height,
    this.format,
    this.type,
    this.referenceAssetCount
  });
}

class ImageUpscaleForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final int? scale;
  final int? targetWidth;
  final int? targetHeight;
  final String? format;
  final String? type;
  final int? referenceAssetCount;

  ImageUpscaleForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.scale,
    this.targetWidth,
    this.targetHeight,
    this.format,
    this.type,
    this.referenceAssetCount
  });
}

class ImageEditForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final List<AssetMediaResource>? maskAssets;
  final double? strength;
  final String? format;
  final String? type;
  final int? referenceAssetCount;

  ImageEditForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.maskAssets,
    this.strength,
    this.format,
    this.type,
    this.referenceAssetCount
  });
}

class CharacterGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final String? description;
  final String? style;
  final String? pose;
  final String? expression;
  final String? gender;
  final String? age;
  final String? clothing;
  final int? width;
  final int? height;
  final String? format;
  final bool? hd;
  final String? type;
  final int? referenceAssetCount;

  CharacterGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.description,
    this.style,
    this.pose,
    this.expression,
    this.gender,
    this.age,
    this.clothing,
    this.width,
    this.height,
    this.format,
    this.hd,
    this.type,
    this.referenceAssetCount
  });
}

class CharacterBatchGenerationForm {
  final List<CharacterItem>? characters;
  final String? model;

  CharacterBatchGenerationForm({
    this.characters,
    this.model
  });
}

class CharacterItem {
  final String? description;
  final String? style;
  final String? pose;

  CharacterItem({
    this.description,
    this.style,
    this.pose
  });
}

class PlusApiResultListGenerationTaskVO {
  final List<GenerationTaskVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListGenerationTaskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceCloneForm {
  final String? sampleAudioUrl;
  final String? text;
  final String? model;
  final String? format;

  VoiceCloneForm({
    this.sampleAudioUrl,
    this.text,
    this.model,
    this.format
  });
}

class AudioGenerationForm {
  final String? title;
  final String? prompt;
  final String? negativePrompt;
  final String? model;
  final String? channel;
  final List<AssetMediaResource>? referenceAssets;
  final int? n;
  final int? seed;
  final bool? async;
  final String? callbackUrl;
  final Map<String, dynamic>? extraParams;
  final String? bizScene;
  final int? bizId;
  final int? conversationId;
  final int? messageId;
  final String? text;
  final String? voice;
  final String? language;
  final double? speed;
  final double? pitch;
  final int? volume;
  final String? format;
  final String? emotion;
  final String? type;
  final int? referenceAssetCount;

  AudioGenerationForm({
    this.title,
    this.prompt,
    this.negativePrompt,
    this.model,
    this.channel,
    this.referenceAssets,
    this.n,
    this.seed,
    this.async,
    this.callbackUrl,
    this.extraParams,
    this.bizScene,
    this.bizId,
    this.conversationId,
    this.messageId,
    this.text,
    this.voice,
    this.language,
    this.speed,
    this.pitch,
    this.volume,
    this.format,
    this.emotion,
    this.type,
    this.referenceAssetCount
  });
}

class AudioTranslationForm {
  final String? audioUrl;
  final String? targetLanguage;
  final String? model;
  final String? sourceLanguage;
  final String? format;

  AudioTranslationForm({
    this.audioUrl,
    this.targetLanguage,
    this.model,
    this.sourceLanguage,
    this.format
  });
}

class AudioTranscriptionForm {
  final String? audioUrl;
  final String? model;
  final String? language;
  final String? format;

  AudioTranscriptionForm({
    this.audioUrl,
    this.model,
    this.language,
    this.format
  });
}

class FileSystemCopyForm {
  final String? targetParentId;
  final String? targetDiskId;
  final String? name;
  final bool? copyContent;

  FileSystemCopyForm({
    this.targetParentId,
    this.targetDiskId,
    this.name,
    this.copyContent
  });
}

class FileSystemFolderCreateForm {
  final String? name;
  final String? parentId;
  final String? diskId;
  final String? description;
  final List<String>? tags;

  FileSystemFolderCreateForm({
    this.name,
    this.parentId,
    this.diskId,
    this.description,
    this.tags
  });
}

class FileSystemFileCreateForm {
  final String? name;
  final String? parentId;
  final String? diskId;
  final String? mimeType;
  final String? assetType;
  final String? description;
  final List<String>? tags;
  final String? text;
  final Map<String, String>? contents;
  final String? prompt;
  final String? thinkingContent;
  final String? encoding;

  FileSystemFileCreateForm({
    this.name,
    this.parentId,
    this.diskId,
    this.mimeType,
    this.assetType,
    this.description,
    this.tags,
    this.text,
    this.contents,
    this.prompt,
    this.thinkingContent,
    this.encoding
  });
}

class AuthorInfo {
  final int? id;
  final String? name;
  final String? avatar;
  final String? bio;
  final bool? isFollowing;

  AuthorInfo({
    this.id,
    this.name,
    this.avatar,
    this.bio,
    this.isFollowing
  });
}

class FeedItemVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? title;
  final String? content;
  final String? summary;
  final String? coverImage;
  final String? contentType;
  final List<String>? tags;
  final AuthorInfo? author;
  final int? viewCount;
  final int? likeCount;
  final int? commentCount;
  final int? shareCount;
  final bool? isLiked;
  final bool? isCollected;

  FeedItemVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.content,
    this.summary,
    this.coverImage,
    this.contentType,
    this.tags,
    this.author,
    this.viewCount,
    this.likeCount,
    this.commentCount,
    this.shareCount,
    this.isLiked,
    this.isCollected
  });
}

class PlusApiResultFeedItemVO {
  final FeedItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFeedItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FeedbackSubmitForm {
  final String? type;
  final String? content;
  final String? contact;
  final String? attachmentUrl;
  final String? screenshotUrl;

  FeedbackSubmitForm({
    this.type,
    this.content,
    this.contact,
    this.attachmentUrl,
    this.screenshotUrl
  });
}

class FeedbackVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? content;
  final String? status;
  final String? submitTime;
  final String? processTime;

  FeedbackVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.content,
    this.status,
    this.submitTime,
    this.processTime
  });
}

class PlusApiResultFeedbackVO {
  final FeedbackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFeedbackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FeedbackFollowUpForm {
  final String? feedbackId;
  final String? content;
  final String? attachmentUrl;

  FeedbackFollowUpForm({
    this.feedbackId,
    this.content,
    this.attachmentUrl
  });
}

class SupportMessageRequest {
  final String? sessionId;
  final String? content;
  final String? attachmentUrl;

  SupportMessageRequest({
    this.sessionId,
    this.content,
    this.attachmentUrl
  });
}

class PlusApiResultSupportMessageVO {
  final SupportMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSupportMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SupportMessageVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? sessionId;
  final String? content;
  final String? attachmentUrl;
  final String? senderType;
  final String? sendTime;
  final bool? read;

  SupportMessageVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.sessionId,
    this.content,
    this.attachmentUrl,
    this.senderType,
    this.sendTime,
    this.read
  });
}

class ReportSubmitForm {
  final String? type;
  final String? targetId;
  final String? content;
  final String? attachmentUrl;
  final String? screenshotUrl;

  ReportSubmitForm({
    this.type,
    this.targetId,
    this.content,
    this.attachmentUrl,
    this.screenshotUrl
  });
}

class PlusApiResultReportVO {
  final ReportVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultReportVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ReportVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? targetId;
  final String? status;
  final String? submitTime;
  final String? processTime;

  ReportVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.targetId,
    this.status,
    this.submitTime,
    this.processTime
  });
}

class FavoriteAddForm {
  final String? favoriteType;
  final String? type;
  final String? targetId;
  final String? favoriteName;
  final String? favoriteDescription;
  final String? folderId;
  final String? tags;

  FavoriteAddForm({
    this.favoriteType,
    this.type,
    this.targetId,
    this.favoriteName,
    this.favoriteDescription,
    this.folderId,
    this.tags
  });
}

class FavoriteFolderCreateForm {
  final String? folderName;
  final String? name;
  final String? parentFolderId;
  final String? folderDescription;

  FavoriteFolderCreateForm({
    this.folderName,
    this.name,
    this.parentFolderId,
    this.folderDescription
  });
}

class CheckItem {
  final String? type;
  final String? targetId;

  CheckItem({
    this.type,
    this.targetId
  });
}

class FavoriteBatchCheckForm {
  final String? favoriteType;
  final List<String>? targetIds;
  final List<CheckItem>? items;

  FavoriteBatchCheckForm({
    this.favoriteType,
    this.targetIds,
    this.items
  });
}

class FavoriteCheckVO {
  final String? createdAt;
  final String? updatedAt;
  final String? targetId;
  final bool? isFavorite;
  final String? favoriteId;
  final String? favoriteTime;

  FavoriteCheckVO({
    this.createdAt,
    this.updatedAt,
    this.targetId,
    this.isFavorite,
    this.favoriteId,
    this.favoriteTime
  });
}

class PlusApiResultListFavoriteCheckVO {
  final List<FavoriteCheckVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFavoriteCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DriveCopyForm {
  final String? targetFolderId;
  final String? newName;

  DriveCopyForm({
    this.targetFolderId,
    this.newName
  });
}

class DriveBatchDeleteForm {
  final List<String>? itemIds;

  DriveBatchDeleteForm({
    this.itemIds
  });
}

class DriveFolderCreateForm {
  final String? name;
  final String? parentId;
  final String? diskId;

  DriveFolderCreateForm({
    this.name,
    this.parentId,
    this.diskId
  });
}

class DocumentCreateRequest {
  final String? title;
  final String? content;
  final String? folderId;
  final String? diskId;
  final String? description;
  final String? mimeType;
  final List<String>? tags;

  DocumentCreateRequest({
    this.title,
    this.content,
    this.folderId,
    this.diskId,
    this.description,
    this.mimeType,
    this.tags
  });
}

class DocumentCopyRequest {
  final String? folderId;
  final String? title;

  DocumentCopyRequest({
    this.folderId,
    this.title
  });
}

class DocumentBatchOperationRequest {
  final String? type;
  final int? index;
  final int? startIndex;
  final int? endIndex;
  final String? text;
  final String? searchText;
  final String? replaceText;

  DocumentBatchOperationRequest({
    this.type,
    this.index,
    this.startIndex,
    this.endIndex,
    this.text,
    this.searchText,
    this.replaceText
  });
}

class DocumentBatchUpdateRequest {
  final List<DocumentBatchOperationRequest>? requests;
  final bool? strict;

  DocumentBatchUpdateRequest({
    this.requests,
    this.strict
  });
}

class DocumentBatchUpdateResultVO {
  final String? createdAt;
  final String? updatedAt;
  final String? documentId;
  final String? documentUuid;
  final String? versionId;
  final int? appliedCount;
  final int? skippedCount;
  final int? charCount;
  final int? wordCount;

  DocumentBatchUpdateResultVO({
    this.createdAt,
    this.updatedAt,
    this.documentId,
    this.documentUuid,
    this.versionId,
    this.appliedCount,
    this.skippedCount,
    this.charCount,
    this.wordCount
  });
}

class PlusApiResultDocumentBatchUpdateResultVO {
  final DocumentBatchUpdateResultVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDocumentBatchUpdateResultVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AchievementRewardVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? type;
  final int? amount;
  final String? description;
  final String? icon;
  final String? status;
  final String? claimedAt;

  AchievementRewardVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.type,
    this.amount,
    this.description,
    this.icon,
    this.status,
    this.claimedAt
  });
}

class PlusApiResultAchievementRewardVO {
  final AchievementRewardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAchievementRewardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CurrencyCreateForm {
  final String? code;
  final String? name;
  final String? symbol;
  final String? currencyType;
  final int? precisionDigits;
  final bool? isActive;
  final String? description;

  CurrencyCreateForm({
    this.code,
    this.name,
    this.symbol,
    this.currencyType,
    this.precisionDigits,
    this.isActive,
    this.description
  });
}

class CurrencyVO {
  final String? createdAt;
  final String? updatedAt;
  final String? code;
  final String? name;
  final String? symbol;
  final String? currencyType;
  final int? precisionDigits;
  final bool? isActive;
  final String? description;

  CurrencyVO({
    this.createdAt,
    this.updatedAt,
    this.code,
    this.name,
    this.symbol,
    this.currencyType,
    this.precisionDigits,
    this.isActive,
    this.description
  });
}

class PlusApiResultCurrencyVO {
  final CurrencyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCurrencyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExchangeRateCreateForm {
  final String? baseCurrencyCode;
  final String? targetCurrencyCode;
  final double? rate;
  final String? effectiveDate;

  ExchangeRateCreateForm({
    this.baseCurrencyCode,
    this.targetCurrencyCode,
    this.rate,
    this.effectiveDate
  });
}

class ExchangeRateVO {
  final String? createdAt;
  final String? updatedAt;
  final String? baseCurrencyCode;
  final String? baseCurrencyName;
  final String? targetCurrencyCode;
  final String? targetCurrencyName;
  final double? rate;
  final String? effectiveDate;

  ExchangeRateVO({
    this.createdAt,
    this.updatedAt,
    this.baseCurrencyCode,
    this.baseCurrencyName,
    this.targetCurrencyCode,
    this.targetCurrencyName,
    this.rate,
    this.effectiveDate
  });
}

class PlusApiResultExchangeRateVO {
  final ExchangeRateVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExchangeRateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CurrencyConvertForm {
  final String? baseCurrencyCode;
  final String? targetCurrencyCode;
  final double? amount;

  CurrencyConvertForm({
    this.baseCurrencyCode,
    this.targetCurrencyCode,
    this.amount
  });
}

class CurrencyConvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? baseCurrencyCode;
  final String? targetCurrencyCode;
  final double? originalAmount;
  final double? rate;
  final double? convertedAmount;

  CurrencyConvertVO({
    this.createdAt,
    this.updatedAt,
    this.baseCurrencyCode,
    this.targetCurrencyCode,
    this.originalAmount,
    this.rate,
    this.convertedAmount
  });
}

class PlusApiResultCurrencyConvertVO {
  final CurrencyConvertVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCurrencyConvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUserCouponVO {
  final UserCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserCouponVO {
  final String? createdAt;
  final String? updatedAt;
  final String? userCouponId;
  final String? couponId;
  final String? couponName;
  final String? couponCode;
  final String? type;
  final String? typeName;
  final int? amount;
  final double? discount;
  final int? minConsume;
  final String? acquireAt;
  final String? useAt;
  final String? expireAt;
  final String? status;
  final String? statusName;
  final String? orderId;
  final bool? canShared;
  final bool? available;
  final int? remainingDays;

  UserCouponVO({
    this.createdAt,
    this.updatedAt,
    this.userCouponId,
    this.couponId,
    this.couponName,
    this.couponCode,
    this.type,
    this.typeName,
    this.amount,
    this.discount,
    this.minConsume,
    this.acquireAt,
    this.useAt,
    this.expireAt,
    this.status,
    this.statusName,
    this.orderId,
    this.canShared,
    this.available,
    this.remainingDays
  });
}

class CommentCreateForm {
  final String? contentType;
  final int? contentId;
  final String? content;
  final String? deviceInfo;

  CommentCreateForm({
    this.contentType,
    this.contentId,
    this.content,
    this.deviceInfo
  });
}

class CommentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? commentId;
  final String? content;
  final String? contentType;
  final int? contentId;
  final int? userId;
  final String? status;
  final int? likes;
  final int? replyCount;
  final bool? isTop;
  final int? parentId;

  CommentVO({
    this.createdAt,
    this.updatedAt,
    this.commentId,
    this.content,
    this.contentType,
    this.contentId,
    this.userId,
    this.status,
    this.likes,
    this.replyCount,
    this.isTop,
    this.parentId
  });
}

class PlusApiResultCommentVO {
  final CommentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCommentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CommentReplyForm {
  final String? content;
  final String? deviceInfo;

  CommentReplyForm({
    this.content,
    this.deviceInfo
  });
}

class CollectionCreateForm {
  final String? name;
  final String? description;
  final String? type;
  final int? parentId;

  CollectionCreateForm({
    this.name,
    this.description,
    this.type,
    this.parentId
  });
}

class CollectionItemAddForm {
  final String? contentType;
  final int? contentId;
  final String? title;
  final String? description;
  final int? position;

  CollectionItemAddForm({
    this.contentType,
    this.contentId,
    this.title,
    this.description,
    this.position
  });
}

class CollectionItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? itemId;
  final String? collectionId;
  final String? contentType;
  final int? contentId;
  final String? title;
  final String? description;
  final String? coverImage;
  final int? position;
  final bool? isPinned;
  final String? tags;
  final String? addedAt;

  CollectionItemVO({
    this.createdAt,
    this.updatedAt,
    this.itemId,
    this.collectionId,
    this.contentType,
    this.contentId,
    this.title,
    this.description,
    this.coverImage,
    this.position,
    this.isPinned,
    this.tags,
    this.addedAt
  });
}

class PlusApiResultCollectionItemVO {
  final CollectionItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCollectionItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatSessionCreateForm {
  final String? name;
  final String? description;
  final String? modelId;
  final String? systemPrompt;
  final double? temperature;
  final int? maxTokens;
  final double? topP;
  final String? type;
  final String? resourceId;

  ChatSessionCreateForm({
    this.name,
    this.description,
    this.modelId,
    this.systemPrompt,
    this.temperature,
    this.maxTokens,
    this.topP,
    this.type,
    this.resourceId
  });
}

class ChatSessionVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final String? type;
  final String? status;
  final String? modelId;
  final int? messageCount;
  final int? unreadCount;
  final String? lastMessageTime;
  final String? lastMessageContent;
  final String? createTime;
  final String? updateTime;

  ChatSessionVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.type,
    this.status,
    this.modelId,
    this.messageCount,
    this.unreadCount,
    this.lastMessageTime,
    this.lastMessageContent,
    this.createTime,
    this.updateTime
  });
}

class PlusApiResultChatSessionVO {
  final ChatSessionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultChatSessionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatMessageSendForm {
  final int? sessionId;
  final String? content;
  final String? type;
  final String? format;
  final int? quoteMessageId;
  final bool? needThinking;
  final bool? streaming;
  final String? modelId;
  final String? systemPrompt;
  final double? temperature;
  final int? maxTokens;
  final double? topP;

  ChatMessageSendForm({
    this.sessionId,
    this.content,
    this.type,
    this.format,
    this.quoteMessageId,
    this.needThinking,
    this.streaming,
    this.modelId,
    this.systemPrompt,
    this.temperature,
    this.maxTokens,
    this.topP
  });
}

class AttachmentVO {
  final String? id;
  final String? name;
  final String? type;
  final int? size;
  final String? url;
  final String? thumbnailUrl;

  AttachmentVO({
    this.id,
    this.name,
    this.type,
    this.size,
    this.url,
    this.thumbnailUrl
  });
}

class ChatMessageVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final int? sessionId;
  final String? content;
  final String? type;
  final String? format;
  final String? status;
  final String? senderType;
  final String? senderId;
  final String? receiverId;
  final int? quoteMessageId;
  final String? thinking;
  final String? modelId;
  final int? responseTime;
  final int? tokenCount;
  final List<AttachmentVO>? attachments;
  final String? createTime;
  final String? updateTime;

  ChatMessageVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.sessionId,
    this.content,
    this.type,
    this.format,
    this.status,
    this.senderType,
    this.senderId,
    this.receiverId,
    this.quoteMessageId,
    this.thinking,
    this.modelId,
    this.responseTime,
    this.tokenCount,
    this.attachments,
    this.createTime,
    this.updateTime
  });
}

class PlusApiResultChatMessageVO {
  final ChatMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultChatMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatExportForm {
  final String? format;
  final String? scope;
  final int? count;
  final bool? includeThinking;
  final bool? includeSystemMessages;
  final bool? includeAttachments;
  final String? fileName;

  ChatExportForm({
    this.format,
    this.scope,
    this.count,
    this.includeThinking,
    this.includeSystemMessages,
    this.includeAttachments,
    this.fileName
  });
}

class ExportVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? fileUrl;
  final String? fileName;
  final int? fileSize;
  final String? status;
  final String? format;
  final int? exportCount;
  final String? expireTime;

  ExportVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.fileUrl,
    this.fileName,
    this.fileSize,
    this.status,
    this.format,
    this.exportCount,
    this.expireTime
  });
}

class PlusApiResultExportVO {
  final ExportVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExportVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CharacterCreateForm {
  final String? name;
  final String? type;
  final String? description;
  final int? agentId;

  CharacterCreateForm({
    this.name,
    this.type,
    this.description,
    this.agentId
  });
}

class CategoryCreateForm {
  final String? name;
  final String? type;
  final String? code;
  final String? icon;
  final String? description;
  final int? parentId;
  final int? sort;
  final int? status;

  CategoryCreateForm({
    this.name,
    this.type,
    this.code,
    this.icon,
    this.description,
    this.parentId,
    this.sort,
    this.status
  });
}

class TagCreateForm {
  final String? name;
  final String? code;
  final String? color;
  final String? description;
  final int? status;

  TagCreateForm({
    this.name,
    this.code,
    this.color,
    this.description,
    this.status
  });
}

class PlusApiResultTagVO {
  final TagVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTagVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TagVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? code;
  final String? color;
  final String? description;
  final int? count;
  final int? status;

  TagVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.code,
    this.color,
    this.description,
    this.count,
    this.status
  });
}

class AddCartItemForm {
  final int? skuId;
  final int? productId;
  final int? quantity;
  final String? cartGroupUuid;

  AddCartItemForm({
    this.skuId,
    this.productId,
    this.quantity,
    this.cartGroupUuid
  });
}

class VerifyCodeCheckForm {
  final String? target;
  final String? type;
  final String? verifyType;
  final String? code;

  VerifyCodeCheckForm({
    this.target,
    this.type,
    this.verifyType,
    this.code
  });
}

class PlusApiResultVerifyResultVO {
  final VerifyResultVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVerifyResultVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VerifyResultVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? valid;

  VerifyResultVO({
    this.createdAt,
    this.updatedAt,
    this.valid
  });
}

class VerifyCodeSendForm {
  final String? target;
  final String? type;
  final String? verifyType;
  final String? deviceId;

  VerifyCodeSendForm({
    this.target,
    this.type,
    this.verifyType,
    this.deviceId
  });
}

class RegisterForm {
  final String? username;
  final String? password;
  final String? confirmPassword;
  final String? email;
  final String? phone;

  RegisterForm({
    this.username,
    this.password,
    this.confirmPassword,
    this.email,
    this.phone
  });
}

class PlusApiResultUserInfoVO {
  final UserInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? username;
  final String? email;
  final String? phone;
  final String? nickname;
  final String? avatar;
  final String? role;
  final String? status;

  UserInfoVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.username,
    this.email,
    this.phone,
    this.nickname,
    this.avatar,
    this.role,
    this.status
  });
}

class TokenRefreshForm {
  final String? refreshToken;

  TokenRefreshForm({
    this.refreshToken
  });
}

class LoginVO {
  final String? createdAt;
  final String? updatedAt;
  final String? accessToken;
  final String? refreshToken;
  final String? tokenType;
  final int? expiresIn;
  final UserInfoVO? userInfo;

  LoginVO({
    this.createdAt,
    this.updatedAt,
    this.accessToken,
    this.refreshToken,
    this.tokenType,
    this.expiresIn,
    this.userInfo
  });
}

class PlusApiResultLoginVO {
  final LoginVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultLoginVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultQrCodeVO {
  final QrCodeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultQrCodeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class QrCodeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? qrKey;
  final String? qrUrl;
  final String? qrContent;
  final int? expireTime;

  QrCodeVO({
    this.createdAt,
    this.updatedAt,
    this.qrKey,
    this.qrUrl,
    this.qrContent,
    this.expireTime
  });
}

class QrCodeConfirmForm {
  final String? qrKey;
  final String? token;

  QrCodeConfirmForm({
    this.qrKey,
    this.token
  });
}

class PhoneLoginForm {
  final String? phone;
  final String? code;
  final String? deviceId;
  final String? deviceType;
  final String? deviceName;
  final String? appVersion;

  PhoneLoginForm({
    this.phone,
    this.code,
    this.deviceId,
    this.deviceType,
    this.deviceName,
    this.appVersion
  });
}

class PasswordResetForm {
  final String? account;
  final String? code;
  final String? newPassword;
  final String? confirmPassword;

  PasswordResetForm({
    this.account,
    this.code,
    this.newPassword,
    this.confirmPassword
  });
}

class OAuthAuthUrlForm {
  final String? provider;
  final String? redirectUri;
  final String? scope;
  final String? state;

  OAuthAuthUrlForm({
    this.provider,
    this.redirectUri,
    this.scope,
    this.state
  });
}

class OAuthUrlVO {
  final String? createdAt;
  final String? updatedAt;
  final String? authUrl;

  OAuthUrlVO({
    this.createdAt,
    this.updatedAt,
    this.authUrl
  });
}

class PlusApiResultOAuthUrlVO {
  final OAuthUrlVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOAuthUrlVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OAuthLoginForm {
  final String? provider;
  final String? code;
  final String? state;
  final String? deviceId;
  final String? deviceType;

  OAuthLoginForm({
    this.provider,
    this.code,
    this.state,
    this.deviceId,
    this.deviceType
  });
}

class LoginForm {
  final String? username;
  final String? password;
  final String? captcha;

  LoginForm({
    this.username,
    this.password,
    this.captcha
  });
}

class AuditAppealForm {
  final String? reason;
  final String? description;
  final String? evidenceUrl;
  final String? contactEmail;
  final String? expectedAction;

  AuditAppealForm({
    this.reason,
    this.description,
    this.evidenceUrl,
    this.contactEmail,
    this.expectedAction
  });
}

class AuditAppealVO {
  final String? createdAt;
  final String? updatedAt;
  final String? appealId;
  final String? recordId;
  final String? reason;
  final String? description;
  final String? evidenceUrl;
  final String? status;
  final String? result;
  final String? comment;
  final String? submitTime;
  final String? processTime;

  AuditAppealVO({
    this.createdAt,
    this.updatedAt,
    this.appealId,
    this.recordId,
    this.reason,
    this.description,
    this.evidenceUrl,
    this.status,
    this.result,
    this.comment,
    this.submitTime,
    this.processTime
  });
}

class PlusApiResultAuditAppealVO {
  final AuditAppealVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAuditAppealVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoAuditForm {
  final String? videoUrl;
  final String? contentId;
  final String? title;
  final String? description;
  final String? contentType;
  final List<String>? checkTypes;
  final String? callbackUrl;
  final int? duration;

  VideoAuditForm({
    this.videoUrl,
    this.contentId,
    this.title,
    this.description,
    this.contentType,
    this.checkTypes,
    this.callbackUrl,
    this.duration
  });
}

class AudioAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? result;
  final String? riskLevel;
  final int? duration;
  final String? transcript;
  final List<ViolationSegment>? violationSegments;
  final String? suggestion;

  AudioAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.result,
    this.riskLevel,
    this.duration,
    this.transcript,
    this.violationSegments,
    this.suggestion
  });
}

class ImageAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? result;
  final String? riskLevel;
  final double? confidence;
  final List<ImageDetectionDetail>? details;
  final List<Region>? violationRegions;
  final String? suggestion;

  ImageAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.result,
    this.riskLevel,
    this.confidence,
    this.details,
    this.violationRegions,
    this.suggestion
  });
}

class ImageDetectionDetail {
  final String? type;
  final bool? hit;
  final double? confidence;
  final String? subType;

  ImageDetectionDetail({
    this.type,
    this.hit,
    this.confidence,
    this.subType
  });
}

class KeyFrameResult {
  final int? timestamp;
  final String? frameUrl;
  final ImageAuditVO? detectionResult;

  KeyFrameResult({
    this.timestamp,
    this.frameUrl,
    this.detectionResult
  });
}

class PlusApiResultVideoAuditVO {
  final VideoAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVideoAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class Region {
  final int? x;
  final int? y;
  final int? width;
  final int? height;

  Region({
    this.x,
    this.y,
    this.width,
    this.height
  });
}

class VideoAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? status;
  final String? videoUrl;
  final int? duration;
  final String? result;
  final String? riskLevel;
  final List<KeyFrameResult>? keyFrameResults;
  final AudioAuditVO? audioResult;
  final String? suggestion;

  VideoAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.status,
    this.videoUrl,
    this.duration,
    this.result,
    this.riskLevel,
    this.keyFrameResults,
    this.audioResult,
    this.suggestion
  });
}

class ViolationSegment {
  final int? startTime;
  final int? endTime;
  final String? violationType;
  final String? text;
  final double? confidence;

  ViolationSegment({
    this.startTime,
    this.endTime,
    this.violationType,
    this.text,
    this.confidence
  });
}

class TextAuditForm {
  final String? content;
  final String? contentId;
  final String? contentType;
  final String? scene;
  final String? userId;
  final List<String>? checkTypes;
  final bool? async;

  TextAuditForm({
    this.content,
    this.contentId,
    this.contentType,
    this.scene,
    this.userId,
    this.checkTypes,
    this.async
  });
}

class DetectionDetail {
  final String? type;
  final bool? hit;
  final double? confidence;
  final List<String>? keywords;

  DetectionDetail({
    this.type,
    this.hit,
    this.confidence,
    this.keywords
  });
}

class PlusApiResultTextAuditVO {
  final TextAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTextAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TextAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? result;
  final String? riskLevel;
  final double? confidence;
  final List<DetectionDetail>? details;
  final List<String>? sensitiveWords;
  final String? suggestion;
  final String? processedText;

  TextAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.result,
    this.riskLevel,
    this.confidence,
    this.details,
    this.sensitiveWords,
    this.suggestion,
    this.processedText
  });
}

class TextSuggestForm {
  final String? text;
  final String? suggestType;
  final String? scene;

  TextSuggestForm({
    this.text,
    this.suggestType,
    this.scene
  });
}

class PlusApiResultTextSuggestVO {
  final TextSuggestVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTextSuggestVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ReplacementPosition {
  final int? start;
  final int? end;
  final String? original;
  final String? replacement;

  ReplacementPosition({
    this.start,
    this.end,
    this.original,
    this.replacement
  });
}

class TextSuggestVO {
  final String? createdAt;
  final String? updatedAt;
  final String? originalText;
  final String? suggestedText;
  final int? replacementCount;
  final List<ReplacementPosition>? positions;
  final List<String>? alternativeSuggestions;

  TextSuggestVO({
    this.createdAt,
    this.updatedAt,
    this.originalText,
    this.suggestedText,
    this.replacementCount,
    this.positions,
    this.alternativeSuggestions
  });
}

class BatchTextAuditForm {
  final List<TextItem>? items;
  final List<String>? checkTypes;
  final String? scene;

  BatchTextAuditForm({
    this.items,
    this.checkTypes,
    this.scene
  });
}

class TextItem {
  final String? id;
  final String? content;
  final String? contentType;

  TextItem({
    this.id,
    this.content,
    this.contentType
  });
}

class BatchTextAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? batchId;
  final List<TextAuditItem>? results;
  final String? overallStatus;
  final int? totalCount;
  final int? passCount;
  final int? rejectCount;

  BatchTextAuditVO({
    this.createdAt,
    this.updatedAt,
    this.batchId,
    this.results,
    this.overallStatus,
    this.totalCount,
    this.passCount,
    this.rejectCount
  });
}

class PlusApiResultBatchTextAuditVO {
  final BatchTextAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBatchTextAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TextAuditItem {
  final String? id;
  final TextAuditVO? auditResult;

  TextAuditItem({
    this.id,
    this.auditResult
  });
}

class SensitiveWordsForm {
  final String? text;
  final String? wordListType;
  final String? mode;
  final String? replacement;
  final List<String>? categories;

  SensitiveWordsForm({
    this.text,
    this.wordListType,
    this.mode,
    this.replacement,
    this.categories
  });
}

class PlusApiResultSensitiveWordsVO {
  final SensitiveWordsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSensitiveWordsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SensitiveWordsVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? hasSensitiveWords;
  final int? count;
  final List<WordHit>? words;
  final String? processedText;
  final String? riskLevel;

  SensitiveWordsVO({
    this.createdAt,
    this.updatedAt,
    this.hasSensitiveWords,
    this.count,
    this.words,
    this.processedText,
    this.riskLevel
  });
}

class WordHit {
  final String? word;
  final int? startIndex;
  final int? endIndex;
  final String? category;
  final String? severity;

  WordHit({
    this.word,
    this.startIndex,
    this.endIndex,
    this.category,
    this.severity
  });
}

class BehaviorRiskCheckForm {
  final String? userId;
  final String? behaviorType;
  final int? frequency;
  final Map<String, dynamic>? context;
  final int? timeWindow;

  BehaviorRiskCheckForm({
    this.userId,
    this.behaviorType,
    this.frequency,
    this.context,
    this.timeWindow
  });
}

class AnomalyPattern {
  final String? type;
  final String? description;
  final String? severity;
  final String? detectedAt;

  AnomalyPattern({
    this.type,
    this.description,
    this.severity,
    this.detectedAt
  });
}

class BehaviorRiskVO {
  final String? createdAt;
  final String? updatedAt;
  final String? userId;
  final String? behaviorType;
  final String? riskLevel;
  final int? riskScore;
  final List<AnomalyPattern>? anomalies;
  final FrequencyStats? frequencyStats;
  final String? suggestion;
  final List<String>? restrictions;

  BehaviorRiskVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.behaviorType,
    this.riskLevel,
    this.riskScore,
    this.anomalies,
    this.frequencyStats,
    this.suggestion,
    this.restrictions
  });
}

class FrequencyStats {
  final int? currentFrequency;
  final int? avgFrequency;
  final int? limit;
  final double? excessRatio;

  FrequencyStats({
    this.currentFrequency,
    this.avgFrequency,
    this.limit,
    this.excessRatio
  });
}

class PlusApiResultBehaviorRiskVO {
  final BehaviorRiskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBehaviorRiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AccountRiskCheckForm {
  final String? userId;
  final String? deviceId;
  final String? ipAddress;
  final String? scene;
  final String? location;

  AccountRiskCheckForm({
    this.userId,
    this.deviceId,
    this.ipAddress,
    this.scene,
    this.location
  });
}

class AccountRiskVO {
  final String? createdAt;
  final String? updatedAt;
  final String? userId;
  final String? deviceId;
  final String? riskLevel;
  final int? riskScore;
  final List<RiskItem>? risks;
  final String? suggestion;
  final bool? needVerification;

  AccountRiskVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.deviceId,
    this.riskLevel,
    this.riskScore,
    this.risks,
    this.suggestion,
    this.needVerification
  });
}

class PlusApiResultAccountRiskVO {
  final AccountRiskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAccountRiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RiskItem {
  final String? type;
  final String? name;
  final String? description;
  final String? level;
  final double? confidence;

  RiskItem({
    this.type,
    this.name,
    this.description,
    this.level,
    this.confidence
  });
}

class RealtimeAuditForm {
  final String? streamId;
  final String? streamUrl;
  final String? streamType;
  final String? roomId;
  final String? publisherId;
  final List<String>? checkTypes;
  final String? callbackUrl;
  final bool? checkAudio;
  final bool? checkVideo;

  RealtimeAuditForm({
    this.streamId,
    this.streamUrl,
    this.streamType,
    this.roomId,
    this.publisherId,
    this.checkTypes,
    this.callbackUrl,
    this.checkAudio,
    this.checkVideo
  });
}

class PlusApiResultRealtimeAuditVO {
  final RealtimeAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRealtimeAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RealtimeAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? streamId;
  final String? taskId;
  final String? status;
  final bool? videoEnabled;
  final bool? audioEnabled;
  final String? pushUrl;
  final String? startTime;
  final String? estimatedEndTime;

  RealtimeAuditVO({
    this.createdAt,
    this.updatedAt,
    this.streamId,
    this.taskId,
    this.status,
    this.videoEnabled,
    this.audioEnabled,
    this.pushUrl,
    this.startTime,
    this.estimatedEndTime
  });
}

class ImageAuditForm {
  final String? imageUrl;
  final String? imageBase64;
  final String? contentId;
  final String? contentType;
  final List<String>? checkTypes;
  final String? scene;
  final bool? async;

  ImageAuditForm({
    this.imageUrl,
    this.imageBase64,
    this.contentId,
    this.contentType,
    this.checkTypes,
    this.scene,
    this.async
  });
}

class PlusApiResultImageAuditVO {
  final ImageAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultImageAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ImageOcrAuditForm {
  final String? imageUrl;
  final String? contentId;
  final List<String>? checkTypes;
  final String? language;
  final bool? returnFullText;

  ImageOcrAuditForm({
    this.imageUrl,
    this.contentId,
    this.checkTypes,
    this.language,
    this.returnFullText
  });
}

class ImageOcrAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? ocrText;
  final List<TextBlock>? textBlocks;
  final TextAuditVO? textAuditResult;
  final String? overallResult;

  ImageOcrAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.ocrText,
    this.textBlocks,
    this.textAuditResult,
    this.overallResult
  });
}

class PlusApiResultImageOcrAuditVO {
  final ImageOcrAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultImageOcrAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TextBlock {
  final String? text;
  final Region? region;
  final double? confidence;

  TextBlock({
    this.text,
    this.region,
    this.confidence
  });
}

class BatchImageAuditForm {
  final List<ImageItem>? images;
  final List<String>? checkTypes;
  final String? scene;

  BatchImageAuditForm({
    this.images,
    this.checkTypes,
    this.scene
  });
}

class ImageItem {
  final String? id;
  final String? url;
  final String? contentType;

  ImageItem({
    this.id,
    this.url,
    this.contentType
  });
}

class BatchImageAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? batchId;
  final List<ImageAuditItem>? results;
  final String? overallStatus;
  final int? totalCount;
  final int? passCount;
  final int? rejectCount;

  BatchImageAuditVO({
    this.createdAt,
    this.updatedAt,
    this.batchId,
    this.results,
    this.overallStatus,
    this.totalCount,
    this.passCount,
    this.rejectCount
  });
}

class ImageAuditItem {
  final String? id;
  final ImageAuditVO? auditResult;

  ImageAuditItem({
    this.id,
    this.auditResult
  });
}

class PlusApiResultBatchImageAuditVO {
  final BatchImageAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBatchImageAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ContentAuditForm {
  final String? contentId;
  final String? textContent;
  final List<String>? imageUrls;
  final String? videoUrl;
  final String? audioUrl;
  final String? contentType;
  final String? scene;
  final List<String>? checkTypes;
  final Map<String, dynamic>? metadata;
  final String? userId;

  ContentAuditForm({
    this.contentId,
    this.textContent,
    this.imageUrls,
    this.videoUrl,
    this.audioUrl,
    this.contentType,
    this.scene,
    this.checkTypes,
    this.metadata,
    this.userId
  });
}

class AuditResultItem {
  final String? type;
  final String? result;
  final String? riskLevel;
  final double? confidence;

  AuditResultItem({
    this.type,
    this.result,
    this.riskLevel,
    this.confidence
  });
}

class ContentAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? contentId;
  final String? overallResult;
  final String? riskLevel;
  final Map<String, AuditResultItem>? results;
  final TextAuditVO? textResult;
  final List<ImageAuditVO>? imageResults;
  final VideoAuditVO? videoResult;
  final AudioAuditVO? audioResult;
  final String? suggestion;

  ContentAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.contentId,
    this.overallResult,
    this.riskLevel,
    this.results,
    this.textResult,
    this.imageResults,
    this.videoResult,
    this.audioResult,
    this.suggestion
  });
}

class PlusApiResultContentAuditVO {
  final ContentAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultContentAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AudioAuditForm {
  final String? audioUrl;
  final String? format;
  final String? contentId;
  final int? duration;
  final List<String>? checkTypes;
  final int? sampleRate;

  AudioAuditForm({
    this.audioUrl,
    this.format,
    this.contentId,
    this.duration,
    this.checkTypes,
    this.sampleRate
  });
}

class PlusApiResultAudioAuditVO {
  final AudioAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAudioAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AudioAsrAuditForm {
  final String? audioUrl;
  final String? contentId;
  final String? language;
  final List<String>? checkTypes;
  final bool? withTimestamp;

  AudioAsrAuditForm({
    this.audioUrl,
    this.contentId,
    this.language,
    this.checkTypes,
    this.withTimestamp
  });
}

class AudioAsrAuditVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? fullText;
  final List<TimestampedSegment>? segments;
  final TextAuditVO? textAuditResult;
  final String? overallResult;
  final String? language;

  AudioAsrAuditVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.fullText,
    this.segments,
    this.textAuditResult,
    this.overallResult,
    this.language
  });
}

class PlusApiResultAudioAsrAuditVO {
  final AudioAsrAuditVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAudioAsrAuditVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TimestampedSegment {
  final int? startTime;
  final int? endTime;
  final String? text;
  final int? speakerId;
  final double? confidence;

  TimestampedSegment({
    this.startTime,
    this.endTime,
    this.text,
    this.speakerId,
    this.confidence
  });
}

class FolderCreateForm {
  final String? name;
  final String? parentId;

  FolderCreateForm({
    this.name,
    this.parentId
  });
}

class FolderVO {
  final String? createdAt;
  final String? updatedAt;
  final String? folderId;
  final String? folderName;
  final String? parentId;
  final int? childCount;
  final int? fileCount;

  FolderVO({
    this.createdAt,
    this.updatedAt,
    this.folderId,
    this.folderName,
    this.parentId,
    this.childCount,
    this.fileCount
  });
}

class PlusApiResultFolderVO {
  final FolderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFolderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AppCreateForm {
  final String? name;
  final String? description;
  final String? appType;
  final int? projectId;

  AppCreateForm({
    this.name,
    this.description,
    this.appType,
    this.projectId
  });
}

class PageViewTrackForm {
  final String? pageUrl;
  final String? pageTitle;
  final String? referrer;
  final String? timestamp;
  final String? deviceId;
  final String? userId;
  final Map<String, dynamic>? properties;
  final String? sessionId;
  final int? duration;

  PageViewTrackForm({
    this.pageUrl,
    this.pageTitle,
    this.referrer,
    this.timestamp,
    this.deviceId,
    this.userId,
    this.properties,
    this.sessionId,
    this.duration
  });
}

class StatsExportForm {
  final String? reportType;
  final String? startDate;
  final String? endDate;
  final String? format;
  final String? email;
  final String? deviceType;
  final String? osType;

  StatsExportForm({
    this.reportType,
    this.startDate,
    this.endDate,
    this.format,
    this.email,
    this.deviceType,
    this.osType
  });
}

class ExportResultVO {
  final String? createdAt;
  final String? updatedAt;
  final String? exportId;
  final String? reportType;
  final String? status;
  final String? downloadUrl;
  final int? fileSize;
  final String? completedAt;
  final String? errorMessage;

  ExportResultVO({
    this.createdAt,
    this.updatedAt,
    this.exportId,
    this.reportType,
    this.status,
    this.downloadUrl,
    this.fileSize,
    this.completedAt,
    this.errorMessage
  });
}

class PlusApiResultExportResultVO {
  final ExportResultVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExportResultVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class EventTrackForm {
  final String? eventName;
  final String? eventType;
  final String? timestamp;
  final String? deviceId;
  final String? userId;
  final Map<String, dynamic>? properties;
  final String? sessionId;
  final String? pageUrl;
  final String? referrer;

  EventTrackForm({
    this.eventName,
    this.eventType,
    this.timestamp,
    this.deviceId,
    this.userId,
    this.properties,
    this.sessionId,
    this.pageUrl,
    this.referrer
  });
}

class BatchEventTrackForm {
  final List<EventTrackForm>? events;
  final String? deviceId;
  final String? userId;
  final String? submitTime;

  BatchEventTrackForm({
    this.events,
    this.deviceId,
    this.userId,
    this.submitTime
  });
}

class ErrorTrackForm {
  final String? errorType;
  final String? errorMessage;
  final String? stackTrace;
  final String? deviceId;
  final String? userId;
  final String? appVersion;
  final String? deviceModel;
  final String? osVersion;
  final String? context;
  final String? errorTime;

  ErrorTrackForm({
    this.errorType,
    this.errorMessage,
    this.stackTrace,
    this.deviceId,
    this.userId,
    this.appVersion,
    this.deviceModel,
    this.osVersion,
    this.context,
    this.errorTime
  });
}

class AdvertReportForm {
  final String? advertId;
  final String? reportType;
  final String? reason;
  final String? screenshotUrl;
  final String? deviceId;
  final String? ipAddress;

  AdvertReportForm({
    this.advertId,
    this.reportType,
    this.reason,
    this.screenshotUrl,
    this.deviceId,
    this.ipAddress
  });
}

class VideoProgressForm {
  final String? advertId;
  final String? videoId;
  final int? progress;
  final String? timestamp;
  final String? deviceId;
  final String? ipAddress;

  VideoProgressForm({
    this.advertId,
    this.videoId,
    this.progress,
    this.timestamp,
    this.deviceId,
    this.ipAddress
  });
}

class AdvertImpressionForm {
  final String? advertId;
  final String? positionId;
  final String? impressionTime;
  final String? deviceId;
  final String? ipAddress;
  final String? userAgent;
  final String? screenSize;

  AdvertImpressionForm({
    this.advertId,
    this.positionId,
    this.impressionTime,
    this.deviceId,
    this.ipAddress,
    this.userAgent,
    this.screenSize
  });
}

class VideoCompleteForm {
  final String? advertId;
  final String? videoId;
  final String? completeTime;
  final String? duration;
  final String? deviceId;
  final String? ipAddress;

  VideoCompleteForm({
    this.advertId,
    this.videoId,
    this.completeTime,
    this.duration,
    this.deviceId,
    this.ipAddress
  });
}

class AdvertCloseForm {
  final String? advertId;
  final String? positionId;
  final String? closeTime;
  final String? duration;
  final String? deviceId;
  final String? ipAddress;

  AdvertCloseForm({
    this.advertId,
    this.positionId,
    this.closeTime,
    this.duration,
    this.deviceId,
    this.ipAddress
  });
}

class AdvertClickForm {
  final String? advertId;
  final String? positionId;
  final String? clickTime;
  final String? deviceId;
  final String? ipAddress;
  final String? userAgent;

  AdvertClickForm({
    this.advertId,
    this.positionId,
    this.clickTime,
    this.deviceId,
    this.ipAddress,
    this.userAgent
  });
}

class RewardVerifyForm {
  final String? advertId;
  final String? rewardId;
  final String? verificationToken;
  final String? deviceId;
  final String? ipAddress;

  RewardVerifyForm({
    this.advertId,
    this.rewardId,
    this.verificationToken,
    this.deviceId,
    this.ipAddress
  });
}

class PlusApiResultRewardVerifyVO {
  final RewardVerifyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRewardVerifyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RewardVerifyVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? verified;
  final String? rewardId;
  final String? rewardType;
  final int? rewardAmount;
  final String? message;
  final String? verificationToken;

  RewardVerifyVO({
    this.createdAt,
    this.updatedAt,
    this.verified,
    this.rewardId,
    this.rewardType,
    this.rewardAmount,
    this.message,
    this.verificationToken
  });
}

class ActivityJoinForm {
  final Map<String, dynamic>? extraParams;
  final String? inviteCode;

  ActivityJoinForm({
    this.extraParams,
    this.inviteCode
  });
}

class ActivityJoinVO {
  final String? createdAt;
  final String? updatedAt;
  final String? recordId;
  final bool? success;
  final String? result;
  final Map<String, dynamic>? rewards;
  final int? remainingCount;
  final String? message;

  ActivityJoinVO({
    this.createdAt,
    this.updatedAt,
    this.recordId,
    this.success,
    this.result,
    this.rewards,
    this.remainingCount,
    this.message
  });
}

class PlusApiResultActivityJoinVO {
  final ActivityJoinVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultActivityJoinVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultTaskRewardVO {
  final TaskRewardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTaskRewardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TaskRewardVO {
  final String? createdAt;
  final String? updatedAt;
  final String? rewardId;
  final String? taskId;
  final String? rewardType;
  final int? rewardAmount;
  final String? status;
  final String? message;
  final String? claimedAt;

  TaskRewardVO({
    this.createdAt,
    this.updatedAt,
    this.rewardId,
    this.taskId,
    this.rewardType,
    this.rewardAmount,
    this.status,
    this.message,
    this.claimedAt
  });
}

class PointsExchangeForm {
  final int? quantity;
  final String? addressId;
  final String? remark;

  PointsExchangeForm({
    this.quantity,
    this.addressId,
    this.remark
  });
}

class PlusApiResultPointsExchangeVO {
  final PointsExchangeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPointsExchangeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsExchangeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? recordId;
  final bool? success;
  final String? goodsName;
  final int? pointsCost;
  final int? remainingPoints;
  final int? quantity;
  final String? exchangeTime;
  final String? status;
  final String? rewardContent;
  final String? message;

  PointsExchangeVO({
    this.createdAt,
    this.updatedAt,
    this.recordId,
    this.success,
    this.goodsName,
    this.pointsCost,
    this.remainingPoints,
    this.quantity,
    this.exchangeTime,
    this.status,
    this.rewardContent,
    this.message
  });
}

class LotteryDrawVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? isWin;
  final String? prizeId;
  final String? prizeName;
  final String? prizeImage;
  final String? prizeType;
  final bool? isGrandPrize;
  final String? winTime;
  final String? recordId;
  final int? remainingFreeCount;
  final int? pointsCost;
  final String? message;

  LotteryDrawVO({
    this.createdAt,
    this.updatedAt,
    this.isWin,
    this.prizeId,
    this.prizeName,
    this.prizeImage,
    this.prizeType,
    this.isGrandPrize,
    this.winTime,
    this.recordId,
    this.remainingFreeCount,
    this.pointsCost,
    this.message
  });
}

class PlusApiResultLotteryDrawVO {
  final LotteryDrawVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultLotteryDrawVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultPrizeClaimVO {
  final PrizeClaimVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPrizeClaimVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PrizeClaimVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? prizeName;
  final String? prizeType;
  final String? claimTime;
  final Map<String, dynamic>? rewardDetails;
  final String? message;

  PrizeClaimVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.prizeName,
    this.prizeType,
    this.claimTime,
    this.rewardDetails,
    this.message
  });
}

class CheckInVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? checkInDate;
  final int? consecutiveDays;
  final int? points;
  final Map<String, dynamic>? extraRewards;
  final bool? checkedInToday;
  final String? message;

  CheckInVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.checkInDate,
    this.consecutiveDays,
    this.points,
    this.extraRewards,
    this.checkedInToday,
    this.message
  });
}

class PlusApiResultCheckInVO {
  final CheckInVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCheckInVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CheckInMakeUpForm {
  final String? date;

  CheckInMakeUpForm({
    this.date
  });
}

class CheckInMakeUpVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? success;
  final String? date;
  final int? costPoints;
  final int? remainingPoints;
  final int? consecutiveDays;
  final String? message;

  CheckInMakeUpVO({
    this.createdAt,
    this.updatedAt,
    this.success,
    this.date,
    this.costPoints,
    this.remainingPoints,
    this.consecutiveDays,
    this.message
  });
}

class PlusApiResultCheckInMakeUpVO {
  final CheckInMakeUpVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCheckInMakeUpVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsTransferForm {
  final String? toUserId;
  final int? points;
  final String? remarks;

  PointsTransferForm({
    this.toUserId,
    this.points,
    this.remarks
  });
}

class PlusApiResultPointsTransferVO {
  final PointsTransferVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPointsTransferVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsTransferVO {
  final String? createdAt;
  final String? updatedAt;
  final String? transactionId;
  final String? fromAccountId;
  final String? toAccountId;
  final int? points;
  final String? status;
  final int? fromPointsAfter;
  final int? toPointsAfter;

  PointsTransferVO({
    this.createdAt,
    this.updatedAt,
    this.transactionId,
    this.fromAccountId,
    this.toAccountId,
    this.points,
    this.status,
    this.fromPointsAfter,
    this.toPointsAfter
  });
}

class PlusApiResultPointsAccountInfoVO {
  final PointsAccountInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPointsAccountInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsAccountInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? accountId;
  final String? accountType;
  final String? accountTypeName;
  final String? ownerId;
  final String? userId;
  final int? availablePoints;
  final int? frozenPoints;
  final int? totalPoints;
  final int? tokenBalance;
  final String? status;
  final String? statusName;
  final int? pendingPoints;
  final int? totalEarned;
  final int? totalSpent;
  final int? level;
  final String? levelName;
  final int? experience;

  PointsAccountInfoVO({
    this.createdAt,
    this.updatedAt,
    this.accountId,
    this.accountType,
    this.accountTypeName,
    this.ownerId,
    this.userId,
    this.availablePoints,
    this.frozenPoints,
    this.totalPoints,
    this.tokenBalance,
    this.status,
    this.statusName,
    this.pendingPoints,
    this.totalEarned,
    this.totalSpent,
    this.level,
    this.levelName,
    this.experience
  });
}

class CashWithdrawForm {
  final double? amount;
  final String? withdrawMethod;
  final String? accountNo;
  final String? accountName;
  final String? bankName;
  final String? remarks;

  CashWithdrawForm({
    this.amount,
    this.withdrawMethod,
    this.accountNo,
    this.accountName,
    this.bankName,
    this.remarks
  });
}

class CashWithdrawVO {
  final String? createdAt;
  final String? updatedAt;
  final String? transactionId;
  final String? accountId;
  final double? amount;
  final double? balanceAfter;
  final double? frozenBalance;
  final String? status;
  final String? estimatedArrivalTime;
  final String? withdrawMethod;

  CashWithdrawVO({
    this.createdAt,
    this.updatedAt,
    this.transactionId,
    this.accountId,
    this.amount,
    this.balanceAfter,
    this.frozenBalance,
    this.status,
    this.estimatedArrivalTime,
    this.withdrawMethod
  });
}

class PlusApiResultCashWithdrawVO {
  final CashWithdrawVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCashWithdrawVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CashTransferForm {
  final String? toUserId;
  final double? amount;
  final String? remarks;
  final String? payPassword;

  CashTransferForm({
    this.toUserId,
    this.amount,
    this.remarks,
    this.payPassword
  });
}

class CashTransferVO {
  final String? createdAt;
  final String? updatedAt;
  final String? transactionId;
  final String? fromAccountId;
  final String? toAccountId;
  final double? amount;
  final String? status;
  final double? fromBalanceAfter;
  final double? toBalanceAfter;

  CashTransferVO({
    this.createdAt,
    this.updatedAt,
    this.transactionId,
    this.fromAccountId,
    this.toAccountId,
    this.amount,
    this.status,
    this.fromBalanceAfter,
    this.toBalanceAfter
  });
}

class PlusApiResultCashTransferVO {
  final CashTransferVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCashTransferVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CashRechargeForm {
  final double? amount;
  final String? paymentMethod;
  final String? remarks;
  final String? couponId;

  CashRechargeForm({
    this.amount,
    this.paymentMethod,
    this.remarks,
    this.couponId
  });
}

class CashRechargeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? transactionId;
  final String? accountId;
  final double? amount;
  final double? balanceAfter;
  final String? status;
  final String? paymentMethod;
  final String? payUrl;

  CashRechargeVO({
    this.createdAt,
    this.updatedAt,
    this.transactionId,
    this.accountId,
    this.amount,
    this.balanceAfter,
    this.status,
    this.paymentMethod,
    this.payUrl
  });
}

class PlusApiResultCashRechargeVO {
  final CashRechargeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCashRechargeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExperimentFeedbackForm {
  final String? experimentKey;
  final String? feedbackType;
  final String? feedbackContent;
  final int? rating;

  ExperimentFeedbackForm({
    this.experimentKey,
    this.feedbackType,
    this.feedbackContent,
    this.rating
  });
}

class BatchFeatureCheckForm {
  final List<String>? featureKeys;
  final dynamic? userAttributes;

  BatchFeatureCheckForm({
    this.featureKeys,
    this.userAttributes
  });
}

class FeatureFlagVO {
  final String? createdAt;
  final String? updatedAt;
  final String? featureKey;
  final String? featureName;
  final bool? enabled;
  final dynamic? value;
  final String? description;

  FeatureFlagVO({
    this.createdAt,
    this.updatedAt,
    this.featureKey,
    this.featureName,
    this.enabled,
    this.value,
    this.description
  });
}

class PlusApiResultMapStringFeatureFlagVO {
  final Map<String, FeatureFlagVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMapStringFeatureFlagVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExperimentExposureForm {
  final String? experimentKey;
  final String? variantKey;
  final dynamic? exposureContext;

  ExperimentExposureForm({
    this.experimentKey,
    this.variantKey,
    this.exposureContext
  });
}

class ExperimentEventForm {
  final String? experimentKey;
  final String? eventType;
  final dynamic? eventData;

  ExperimentEventForm({
    this.experimentKey,
    this.eventType,
    this.eventData
  });
}

class ExperimentConversionForm {
  final String? experimentKey;
  final String? conversionGoal;
  final double? conversionValue;

  ExperimentConversionForm({
    this.experimentKey,
    this.conversionGoal,
    this.conversionValue
  });
}

class BatchAssignmentForm {
  final List<String>? experimentKeys;
  final Map<String, dynamic>? userAttributes;

  BatchAssignmentForm({
    this.experimentKeys,
    this.userAttributes
  });
}

class ExperimentAssignmentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? experimentKey;
  final String? variantKey;
  final String? variantName;
  final String? assignmentReason;
  final Map<String, dynamic>? assignmentParams;

  ExperimentAssignmentVO({
    this.createdAt,
    this.updatedAt,
    this.experimentKey,
    this.variantKey,
    this.variantName,
    this.assignmentReason,
    this.assignmentParams
  });
}

class PlusApiResultMapStringExperimentAssignmentVO {
  final Map<String, ExperimentAssignmentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMapStringExperimentAssignmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListWorkspaceVO {
  final List<WorkspaceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListWorkspaceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectQueryForm {
  final String? workspaceId;
  final String? keyword;
  final String? projectName;
  final String? type;
  final List<String>? projectTags;
  final String? status;
  final String? creatorId;
  final String? startTime;
  final String? endTime;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  ProjectQueryForm({
    this.workspaceId,
    this.keyword,
    this.projectName,
    this.type,
    this.projectTags,
    this.status,
    this.creatorId,
    this.startTime,
    this.endTime,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageProjectVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ProjectVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageProjectVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageProjectVO {
  final PageProjectVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageProjectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MemberVO {
  final String? createdAt;
  final String? updatedAt;
  final String? memberId;
  final String? userId;
  final String? username;
  final String? nickname;
  final String? avatar;
  final String? email;
  final String? roleId;
  final String? roleName;
  final List<String>? permissions;
  final String? joinTime;
  final String? lastActiveTime;
  final String? status;
  final bool? isCreator;
  final bool? isAdmin;

  MemberVO({
    this.createdAt,
    this.updatedAt,
    this.memberId,
    this.userId,
    this.username,
    this.nickname,
    this.avatar,
    this.email,
    this.roleId,
    this.roleName,
    this.permissions,
    this.joinTime,
    this.lastActiveTime,
    this.status,
    this.isCreator,
    this.isAdmin
  });
}

class PlusApiResultProjectDetailVO {
  final ProjectDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultProjectDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? projectId;
  final String? projectName;
  final String? projectTitle;
  final String? projectDescription;
  final String? projectType;
  final String? projectTypeName;
  final String? projectCode;
  final String? projectIcon;
  final String? coverImageUrl;
  final List<String>? projectTags;
  final String? workspaceId;
  final String? workspaceName;
  final String? creatorId;
  final String? creatorName;
  final String? author;
  final String? sitePath;
  final String? domainPrefix;
  final String? startTime;
  final String? endTime;
  final bool? isTemplate;
  final String? createTime;
  final String? updateTime;
  final List<MemberVO>? members;
  final String? status;
  final String? statusName;
  final ProjectSettings? settings;

  ProjectDetailVO({
    this.createdAt,
    this.updatedAt,
    this.projectId,
    this.projectName,
    this.projectTitle,
    this.projectDescription,
    this.projectType,
    this.projectTypeName,
    this.projectCode,
    this.projectIcon,
    this.coverImageUrl,
    this.projectTags,
    this.workspaceId,
    this.workspaceName,
    this.creatorId,
    this.creatorName,
    this.author,
    this.sitePath,
    this.domainPrefix,
    this.startTime,
    this.endTime,
    this.isTemplate,
    this.createTime,
    this.updateTime,
    this.members,
    this.status,
    this.statusName,
    this.settings
  });
}

class PlusApiResultListMemberVO {
  final List<MemberVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVoteDetailVO {
  final VoteDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoteDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoteDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? voteId;
  final int? userId;
  final String? contentType;
  final int? contentId;
  final String? rating;
  final String? source;
  final String? clientIp;
  final String? deviceInfo;

  VoteDetailVO({
    this.createdAt,
    this.updatedAt,
    this.voteId,
    this.userId,
    this.contentType,
    this.contentId,
    this.rating,
    this.source,
    this.clientIp,
    this.deviceInfo
  });
}

class PlusApiResultListLong {
  final List<int>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListLong({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVoteStatusVO {
  final VoteStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoteStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoteStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? hasVoted;
  final String? userRating;

  VoteStatusVO({
    this.createdAt,
    this.updatedAt,
    this.hasVoted,
    this.userRating
  });
}

class PlusApiResultVoteStatisticsVO {
  final VoteStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoteStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoteStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalVotes;
  final int? likes;
  final int? dislikes;
  final int? neutrals;
  final String? likeRatio;

  VoteStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalVotes,
    this.likes,
    this.dislikes,
    this.neutrals,
    this.likeRatio
  });
}

class PageVoteDetailVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<VoteDetailVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageVoteDetailVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageVoteDetailVO {
  final PageVoteDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageVoteDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceSpeakerQueryForm {
  final int? page;
  final int? size;
  final String? keyword;
  final String? gender;
  final String? ageType;
  final String? type;
  final String? channel;
  final String? status;

  VoiceSpeakerQueryForm({
    this.page,
    this.size,
    this.keyword,
    this.gender,
    this.ageType,
    this.type,
    this.channel,
    this.status
  });
}

class PageVoiceSpeakerVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<VoiceSpeakerVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageVoiceSpeakerVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageVoiceSpeakerVO {
  final PageVoiceSpeakerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVoiceSpeakerDetailVO {
  final VoiceSpeakerDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoiceSpeakerDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceSourceVO {
  final String? id;
  final String? name;
  final String? type;
  final String? language;
  final int? sampleRate;

  VoiceSourceVO({
    this.id,
    this.name,
    this.type,
    this.language,
    this.sampleRate
  });
}

class VoiceSpeakerDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? localName;
  final String? code;
  final String? faceImageUrl;
  final String? faceVideoUrl;
  final List<String>? resourceUrls;
  final String? channel;
  final String? channelName;
  final String? product;
  final String? gender;
  final String? genderName;
  final String? ageType;
  final String? ageTypeName;
  final String? type;
  final String? typeName;
  final List<String>? models;
  final String? channelSpeakerId;
  final String? version;
  final bool? isDefault;
  final String? status;
  final String? statusName;
  final String? description;
  final List<String>? tags;
  final List<VoiceSourceVO>? voiceSources;
  final List<String>? sampleAudios;
  final Map<String, dynamic>? attributes;

  VoiceSpeakerDetailVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.localName,
    this.code,
    this.faceImageUrl,
    this.faceVideoUrl,
    this.resourceUrls,
    this.channel,
    this.channelName,
    this.product,
    this.gender,
    this.genderName,
    this.ageType,
    this.ageTypeName,
    this.type,
    this.typeName,
    this.models,
    this.channelSpeakerId,
    this.version,
    this.isDefault,
    this.status,
    this.statusName,
    this.description,
    this.tags,
    this.voiceSources,
    this.sampleAudios,
    this.attributes
  });
}

class PlusApiResultSpeakerStatisticsVO {
  final SpeakerStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSpeakerStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SpeakerStatisticsVO {
  final int? totalSpeakers;
  final int? activeSpeakers;
  final int? inactiveSpeakers;

  SpeakerStatisticsVO({
    this.totalSpeakers,
    this.activeSpeakers,
    this.inactiveSpeakers
  });
}

class PlusApiResultListVoiceSpeakerVO {
  final List<VoiceSpeakerVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVoiceSpeakerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVipStatusVO {
  final VipStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipStatusVO {
  final bool? isVip;
  final int? vipLevel;
  final String? expireTime;
  final int? pointBalance;

  VipStatusVO({
    this.isVip,
    this.vipLevel,
    this.expireTime,
    this.pointBalance
  });
}

class PlusApiResultVipPrivilegeUsageVO {
  final VipPrivilegeUsageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipPrivilegeUsageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipPrivilegeUsageVO {
  final String? createdAt;
  final String? updatedAt;
  final int? speedUpUsed;
  final int? speedUpLimit;
  final int? priorityQueueUsed;
  final int? priorityQueueLimit;
  final int? exclusiveModelUsed;
  final int? exclusiveModelLimit;

  VipPrivilegeUsageVO({
    this.createdAt,
    this.updatedAt,
    this.speedUpUsed,
    this.speedUpLimit,
    this.priorityQueueUsed,
    this.priorityQueueLimit,
    this.exclusiveModelUsed,
    this.exclusiveModelLimit
  });
}

class PlusApiResultListVipPointsHistoryVO {
  final List<VipPointsHistoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipPointsHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipPointsHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? changeType;
  final int? changeAmount;
  final int? beforeBalance;
  final int? afterBalance;
  final String? sourceType;
  final String? remark;

  VipPointsHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.changeType,
    this.changeAmount,
    this.beforeBalance,
    this.afterBalance,
    this.sourceType,
    this.remark
  });
}

class PlusApiResultVipDailyRewardStatusVO {
  final VipDailyRewardStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipDailyRewardStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipDailyRewardStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? canClaim;
  final bool? claimedToday;
  final int? consecutiveDays;
  final int? totalDays;

  VipDailyRewardStatusVO({
    this.createdAt,
    this.updatedAt,
    this.canClaim,
    this.claimedToday,
    this.consecutiveDays,
    this.totalDays
  });
}

class PlusApiResultLong {
  final int? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultLong({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipPackGroupQueryForm {
  final int? vipLevelId;
  final bool? recommendedOnly;

  VipPackGroupQueryForm({
    this.vipLevelId,
    this.recommendedOnly
  });
}

class PlusApiResultListVipPackGroupVO {
  final List<VipPackGroupVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipPackGroupVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipPackGroupVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final int? sortWeight;
  final List<VipPackVO>? packs;

  VipPackGroupVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.sortWeight,
    this.packs
  });
}

class VipPackVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final double? price;
  final double? originalPrice;
  final int? pointAmount;
  final int? vipDurationDays;
  final String? levelName;
  final int? sortWeight;
  final bool? recommended;
  final List<String>? tags;

  VipPackVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.price,
    this.originalPrice,
    this.pointAmount,
    this.vipDurationDays,
    this.levelName,
    this.sortWeight,
    this.recommended,
    this.tags
  });
}

class PlusApiResultVipPackGroupDetailVO {
  final VipPackGroupDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipPackGroupDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipPackGroupDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final int? sortWeight;
  final List<VipPackVO>? packs;

  VipPackGroupDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.sortWeight,
    this.packs
  });
}

class PlusApiResultListVipPackVO {
  final List<VipPackVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipPackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVipPackDetailVO {
  final VipPackDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipPackDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipBenefitVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? benefitKey;
  final String? type;
  final String? description;
  final String? icon;
  final bool? claimed;
  final int? usageLimit;
  final int? usedCount;

  VipBenefitVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.benefitKey,
    this.type,
    this.description,
    this.icon,
    this.claimed,
    this.usageLimit,
    this.usedCount
  });
}

class VipPackDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final double? price;
  final double? originalPrice;
  final int? pointAmount;
  final int? vipDurationDays;
  final int? levelId;
  final String? levelName;
  final int? groupId;
  final String? groupName;
  final String? validFrom;
  final String? validTo;
  final int? sortWeight;
  final List<VipBenefitVO>? benefits;

  VipPackDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.price,
    this.originalPrice,
    this.pointAmount,
    this.vipDurationDays,
    this.levelId,
    this.levelName,
    this.groupId,
    this.groupName,
    this.validFrom,
    this.validTo,
    this.sortWeight,
    this.benefits
  });
}

class PlusApiResultListVipLevelVO {
  final List<VipLevelVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipLevelVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final int? levelValue;
  final int? requiredPoints;
  final String? description;
  final String? icon;
  final String? badge;

  VipLevelVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.levelValue,
    this.requiredPoints,
    this.description,
    this.icon,
    this.badge
  });
}

class InviteRulesVO {
  final String? title;
  final String? description;
  final int? inviterReward;
  final int? inviteeReward;
  final List<String>? rules;

  InviteRulesVO({
    this.title,
    this.description,
    this.inviterReward,
    this.inviteeReward,
    this.rules
  });
}

class PlusApiResultInviteRulesVO {
  final InviteRulesVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInviteRulesVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListVipInviteRecordVO {
  final List<VipInviteRecordVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipInviteRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipInviteRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final int? inviteeId;
  final String? inviteeNickname;
  final String? inviteeAvatar;
  final String? status;
  final int? rewardPoints;
  final String? invitedAt;
  final String? completedAt;

  VipInviteRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.inviteeId,
    this.inviteeNickname,
    this.inviteeAvatar,
    this.status,
    this.rewardPoints,
    this.invitedAt,
    this.completedAt
  });
}

class PlusApiResultVipInviteInfoVO {
  final VipInviteInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipInviteInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipInviteInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? inviteCode;
  final String? inviteLink;
  final int? totalInvites;
  final int? successfulInvites;
  final int? rewardPoints;
  final String? rewardRule;

  VipInviteInfoVO({
    this.createdAt,
    this.updatedAt,
    this.inviteCode,
    this.inviteLink,
    this.totalInvites,
    this.successfulInvites,
    this.rewardPoints,
    this.rewardRule
  });
}

class CustomerServiceInfo {
  final String? serviceId;
  final String? serviceName;
  final String? servicePhone;
  final String? serviceWechat;
  final bool? online;

  CustomerServiceInfo({
    this.serviceId,
    this.serviceName,
    this.servicePhone,
    this.serviceWechat,
    this.online
  });
}

class PlusApiResultVipInfoVO {
  final VipInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VipCouponVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final double? discount;
  final double? minAmount;
  final double? reduceAmount;
  final String? validFrom;
  final String? validTo;
  final String? status;
  final bool? used;

  VipCouponVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.discount,
    this.minAmount,
    this.reduceAmount,
    this.validFrom,
    this.validTo,
    this.status,
    this.used
  });
}

class VipInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final int? vipLevel;
  final String? vipLevelName;
  final String? vipStatus;
  final String? effectiveTime;
  final String? expireTime;
  final int? remainingDays;
  final int? totalDays;
  final int? totalSpent;
  final int? vipPoints;
  final int? growthValue;
  final int? upgradeGrowthValue;
  final CustomerServiceInfo? customerService;
  final List<VipBenefitVO>? benefits;
  final List<VipCouponVO>? coupons;

  VipInfoVO({
    this.createdAt,
    this.updatedAt,
    this.vipLevel,
    this.vipLevelName,
    this.vipStatus,
    this.effectiveTime,
    this.expireTime,
    this.remainingDays,
    this.totalDays,
    this.totalSpent,
    this.vipPoints,
    this.growthValue,
    this.upgradeGrowthValue,
    this.customerService,
    this.benefits,
    this.coupons
  });
}

class PlusApiResultListVipCouponVO {
  final List<VipCouponVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultBoolean {
  final bool? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBoolean({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListVipBenefitVO {
  final List<VipBenefitVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListVipBenefitVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ImageMediaResourceList {
  final List<ImageMediaResource>? images;

  ImageMediaResourceList({
    this.images
  });
}

class PlusApiResultVideoDetailVO {
  final VideoDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVideoDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? videoId;
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final String? thumbnailUrl;
  final int? width;
  final int? height;
  final String? aspectRatio;
  final String? resolution;
  final int? fileSize;
  final int? categoryId;
  final ImageMediaResourceList? coverImages;
  final VideoMediaResource? resource;
  final AuthorInfo? author;
  final String? status;
  final bool? isPublic;
  final bool? isFavorite;
  final int? playCount;
  final int? downloadCount;
  final int? likeCount;

  VideoDetailVO({
    this.createdAt,
    this.updatedAt,
    this.videoId,
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.thumbnailUrl,
    this.width,
    this.height,
    this.aspectRatio,
    this.resolution,
    this.fileSize,
    this.categoryId,
    this.coverImages,
    this.resource,
    this.author,
    this.status,
    this.isPublic,
    this.isFavorite,
    this.playCount,
    this.downloadCount,
    this.likeCount
  });
}

class PlusApiResultVideoStatisticsVO {
  final VideoStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVideoStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalVideos;
  final int? completedVideos;
  final int? processingVideos;

  VideoStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalVideos,
    this.completedVideos,
    this.processingVideos
  });
}

class PageVideoVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<VideoVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageVideoVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageVideoVO {
  final PageVideoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageVideoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class LoginHistoryQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? loginType;
  final String? deviceType;
  final String? status;
  final String? ipAddress;
  final String? startTime;
  final String? endTime;
  final int? size;
  final int? page;

  LoginHistoryQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.loginType,
    this.deviceType,
    this.status,
    this.ipAddress,
    this.startTime,
    this.endTime,
    this.size,
    this.page
  });
}

class PageMapStringObject {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<Map<String, dynamic>>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageMapStringObject({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageMapStringObject {
  final PageMapStringObject? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageMapStringObject({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerationHistoryQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? generationType;
  final String? status;
  final String? keyword;
  final String? startTime;
  final String? endTime;
  final int? size;
  final int? page;

  GenerationHistoryQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.generationType,
    this.status,
    this.keyword,
    this.startTime,
    this.endTime,
    this.size,
    this.page
  });
}

class PlusApiResultListUserAddressVO {
  final List<UserAddressVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListUserAddressVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultStorageUsageVO {
  final StorageUsageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultStorageUsageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class StorageUsageVO {
  final int? totalSize;
  final int? usedSize;
  final int? remainingSize;
  final int? fileCount;

  StorageUsageVO({
    this.totalSize,
    this.usedSize,
    this.remainingSize,
    this.fileCount
  });
}

class PageFileVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<FileVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageFileVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageFileVO {
  final PageFileVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageFileVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListInteger {
  final List<int>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListInteger({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InstallAppList {
  final List<int>? appIdList;

  InstallAppList({
    this.appIdList
  });
}

class PlusApiResultTenantDetailVO {
  final TenantDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTenantDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TenantDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? type;
  final String? bizType;
  final int? bizId;
  final String? status;
  final String? description;
  final int? adminUserId;
  final InstallAppList? installAppList;
  final TenantMetadata? metadata;
  final String? contactPerson;
  final String? contactPhone;
  final int? tokenExpirationMs;
  final int? refreshTokenExpirationMs;
  final String? expireTime;

  TenantDetailVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.type,
    this.bizType,
    this.bizId,
    this.status,
    this.description,
    this.adminUserId,
    this.installAppList,
    this.metadata,
    this.contactPerson,
    this.contactPhone,
    this.tokenExpirationMs,
    this.refreshTokenExpirationMs,
    this.expireTime
  });
}

class TenantMetadata {
  final int? spMchId;

  TenantMetadata({
    this.spMchId
  });
}

class PlusApiResultListTenantTypeVO {
  final List<TenantTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTenantTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TenantTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? name;

  TenantTypeVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.name
  });
}

class PlusApiResultTenantStatisticsVO {
  final TenantStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTenantStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TenantStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalTenants;
  final int? activeTenants;
  final int? frozenTenants;
  final int? closedTenants;

  TenantStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalTenants,
    this.activeTenants,
    this.frozenTenants,
    this.closedTenants
  });
}

class PageTenantVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<TenantVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageTenantVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageTenantVO {
  final PageTenantVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageTenantVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FollowStatsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? followingCount;
  final int? followersCount;
  final int? mutualCount;

  FollowStatsVO({
    this.createdAt,
    this.updatedAt,
    this.followingCount,
    this.followersCount,
    this.mutualCount
  });
}

class PlusApiResultFollowStatsVO {
  final FollowStatsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFollowStatsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MessageUnreadCountVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalUnread;
  final int? privateUnread;
  final int? systemUnread;

  MessageUnreadCountVO({
    this.createdAt,
    this.updatedAt,
    this.totalUnread,
    this.privateUnread,
    this.systemUnread
  });
}

class PlusApiResultMessageUnreadCountVO {
  final MessageUnreadCountVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMessageUnreadCountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FollowQueryForm {
  final int? page;
  final int? size;
  final String? queryType;
  final String? userId;
  final String? keyword;

  FollowQueryForm({
    this.page,
    this.size,
    this.queryType,
    this.userId,
    this.keyword
  });
}

class FollowUserVO {
  final String? createdAt;
  final String? updatedAt;
  final String? userId;
  final String? username;
  final String? nickname;
  final String? avatar;
  final String? followTime;
  final bool? isMutual;

  FollowUserVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.username,
    this.nickname,
    this.avatar,
    this.followTime,
    this.isMutual
  });
}

class PageFollowUserVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<FollowUserVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageFollowUserVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageFollowUserVO {
  final PageFollowUserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageFollowUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultFollowCheckVO {
  final FollowCheckVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFollowCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ConversationQueryForm {
  final int? page;
  final int? size;
  final String? conversationType;
  final bool? showUnread;
  final String? keyword;

  ConversationQueryForm({
    this.page,
    this.size,
    this.conversationType,
    this.showUnread,
    this.keyword
  });
}

class ConversationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? conversationId;
  final String? conversationType;
  final String? otherUserId;
  final String? otherUsername;
  final String? otherNickname;
  final String? otherAvatar;
  final String? lastMessage;
  final String? lastMessageTime;
  final int? unreadCount;
  final bool? isTop;

  ConversationVO({
    this.createdAt,
    this.updatedAt,
    this.conversationId,
    this.conversationType,
    this.otherUserId,
    this.otherUsername,
    this.otherNickname,
    this.otherAvatar,
    this.lastMessage,
    this.lastMessageTime,
    this.unreadCount,
    this.isTop
  });
}

class PageConversationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ConversationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageConversationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageConversationVO {
  final PageConversationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageConversationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MessageQueryForm {
  final String? conversationId;
  final int? page;
  final int? size;
  final String? messageType;
  final String? startTime;
  final String? endTime;

  MessageQueryForm({
    this.conversationId,
    this.page,
    this.size,
    this.messageType,
    this.startTime,
    this.endTime
  });
}

class PagePrivateMessageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PrivateMessageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePrivateMessageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePrivateMessageVO {
  final PagePrivateMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePrivateMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BlockedUserQueryForm {
  final int? page;
  final int? size;
  final String? keyword;
  final String? startTime;
  final String? endTime;

  BlockedUserQueryForm({
    this.page,
    this.size,
    this.keyword,
    this.startTime,
    this.endTime
  });
}

class BlockedUserVO {
  final String? createdAt;
  final String? updatedAt;
  final String? userId;
  final String? username;
  final String? nickname;
  final String? avatar;
  final String? blockTime;
  final String? blockReason;

  BlockedUserVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.username,
    this.nickname,
    this.avatar,
    this.blockTime,
    this.blockReason
  });
}

class PageBlockedUserVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<BlockedUserVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageBlockedUserVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageBlockedUserVO {
  final PageBlockedUserVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageBlockedUserVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BlockCheckVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? isBlocked;
  final String? blockTime;
  final String? blockReason;

  BlockCheckVO({
    this.createdAt,
    this.updatedAt,
    this.isBlocked,
    this.blockTime,
    this.blockReason
  });
}

class PlusApiResultBlockCheckVO {
  final BlockCheckVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBlockCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultSkuDetailVO {
  final SkuDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSkuDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SkuDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? productId;
  final String? productName;
  final String? skuCode;
  final String? skuName;
  final Map<String, String>? attributes;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? warningStock;
  final int? sales;
  final String? mainImage;
  final List<String>? images;
  final double? weight;
  final double? volume;
  final String? status;
  final int? sort;

  SkuDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.productId,
    this.productName,
    this.skuCode,
    this.skuName,
    this.attributes,
    this.price,
    this.originalPrice,
    this.stock,
    this.warningStock,
    this.sales,
    this.mainImage,
    this.images,
    this.weight,
    this.volume,
    this.status,
    this.sort
  });
}

class PlusApiResultSkuStockVO {
  final SkuStockVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSkuStockVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SkuStockVO {
  final String? createdAt;
  final String? updatedAt;
  final String? skuId;
  final String? productId;
  final String? skuCode;
  final String? skuName;
  final int? quantity;
  final int? warningStock;
  final int? lockedStock;
  final int? availableStock;
  final String? status;

  SkuStockVO({
    this.createdAt,
    this.updatedAt,
    this.skuId,
    this.productId,
    this.skuCode,
    this.skuName,
    this.quantity,
    this.warningStock,
    this.lockedStock,
    this.availableStock,
    this.status
  });
}

class PageSkuVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<SkuVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageSkuVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageSkuVO {
  final PageSkuVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageSkuVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SkuVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? productId;
  final String? skuCode;
  final String? skuName;
  final Map<String, String>? attributes;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? sales;
  final String? image;
  final String? status;
  final int? sort;

  SkuVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.productId,
    this.skuCode,
    this.skuName,
    this.attributes,
    this.price,
    this.originalPrice,
    this.stock,
    this.sales,
    this.image,
    this.status,
    this.sort
  });
}

class PlusApiResultSkuStatisticsVO {
  final SkuStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSkuStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SkuStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? productId;
  final String? productName;
  final int? totalSkuCount;
  final int? enabledSkuCount;
  final int? disabledSkuCount;
  final int? totalStock;
  final int? totalSales;
  final double? averagePrice;
  final int? warningStockCount;
  final Map<String, int>? stockTrend;
  final Map<String, int>? salesTrend;

  SkuStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.productId,
    this.productName,
    this.totalSkuCount,
    this.enabledSkuCount,
    this.disabledSkuCount,
    this.totalStock,
    this.totalSales,
    this.averagePrice,
    this.warningStockCount,
    this.stockTrend,
    this.salesTrend
  });
}

class PlusApiResultSkuVO {
  final SkuVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSkuVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListSkuVO {
  final List<SkuVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListSkuVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShopQueryForm {
  final int? page;
  final int? size;
  final String? keyword;
  final String? status;

  ShopQueryForm({
    this.page,
    this.size,
    this.keyword,
    this.status
  });
}

class PageShopVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ShopVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageShopVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageShopVO {
  final PageShopVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageShopVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultShopDetailVO {
  final ShopDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShopDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShopDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? description;
  final String? logoUrl;
  final String? coverUrl;
  final String? contactPhone;
  final String? contactEmail;
  final String? address;
  final double? latitude;
  final double? longitude;
  final String? licenseNumber;
  final List<String>? tags;
  final String? businessHours;
  final String? status;
  final String? statusName;
  final String? ownerId;
  final String? ownerName;
  final int? productCount;
  final int? orderCount;
  final double? rating;
  final int? followerCount;

  ShopDetailVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.description,
    this.logoUrl,
    this.coverUrl,
    this.contactPhone,
    this.contactEmail,
    this.address,
    this.latitude,
    this.longitude,
    this.licenseNumber,
    this.tags,
    this.businessHours,
    this.status,
    this.statusName,
    this.ownerId,
    this.ownerName,
    this.productCount,
    this.orderCount,
    this.rating,
    this.followerCount
  });
}

class PlusApiResultShopStatisticsVO {
  final ShopStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShopStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShopStatisticsVO {
  final int? totalShops;
  final int? activeShops;
  final int? inactiveShops;

  ShopStatisticsVO({
    this.totalShops,
    this.activeShops,
    this.inactiveShops
  });
}

class PlusApiResultListShopVO {
  final List<ShopVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListShopVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShareVisitorQueryForm {
  final String? shareId;
  final int? page;
  final int? size;
  final String? startTime;
  final String? endTime;

  ShareVisitorQueryForm({
    this.shareId,
    this.page,
    this.size,
    this.startTime,
    this.endTime
  });
}

class PageShareVisitorVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ShareVisitorVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageShareVisitorVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageShareVisitorVO {
  final PageShareVisitorVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageShareVisitorVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShareVisitorVO {
  final String? createdAt;
  final String? updatedAt;
  final String? visitorId;
  final String? visitTime;
  final String? userAgent;
  final String? ipAddress;
  final String? deviceInfo;
  final String? visitType;

  ShareVisitorVO({
    this.createdAt,
    this.updatedAt,
    this.visitorId,
    this.visitTime,
    this.userAgent,
    this.ipAddress,
    this.deviceInfo,
    this.visitType
  });
}

class PlusApiResultShareStatisticsVO {
  final ShareStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShareStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShareStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalShares;
  final int? totalVisits;
  final int? todayShares;
  final int? todayVisits;
  final String? successRate;

  ShareStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalShares,
    this.totalVisits,
    this.todayShares,
    this.todayVisits,
    this.successRate
  });
}

class PlusApiResultShareInfoVO {
  final ShareInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShareInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListSharePlatformVO {
  final List<SharePlatformVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListSharePlatformVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SharePlatformVO {
  final String? createdAt;
  final String? updatedAt;
  final String? platformId;
  final String? platformName;
  final String? platformIcon;
  final bool? supported;

  SharePlatformVO({
    this.createdAt,
    this.updatedAt,
    this.platformId,
    this.platformName,
    this.platformIcon,
    this.supported
  });
}

class ShareQueryForm {
  final int? page;
  final int? size;
  final String? shareType;
  final String? status;
  final String? keyword;
  final String? startTime;
  final String? endTime;

  ShareQueryForm({
    this.page,
    this.size,
    this.shareType,
    this.status,
    this.keyword,
    this.startTime,
    this.endTime
  });
}

class PageShareRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ShareRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageShareRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageShareRecordVO {
  final PageShareRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageShareRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InviteRecordQueryForm {
  final int? page;
  final int? size;
  final String? status;
  final String? startTime;
  final String? endTime;

  InviteRecordQueryForm({
    this.page,
    this.size,
    this.status,
    this.startTime,
    this.endTime
  });
}

class InviteRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? inviteeId;
  final String? inviteeNickname;
  final String? inviteTime;
  final String? status;
  final String? rewardAmount;

  InviteRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.inviteeId,
    this.inviteeNickname,
    this.inviteTime,
    this.status,
    this.rewardAmount
  });
}

class PageInviteRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<InviteRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageInviteRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageInviteRecordVO {
  final PageInviteRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageInviteRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InviteInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? inviteCode;
  final String? inviteLink;
  final int? inviteCount;
  final String? rewardAmount;
  final String? remainingReward;

  InviteInfoVO({
    this.createdAt,
    this.updatedAt,
    this.inviteCode,
    this.inviteLink,
    this.inviteCount,
    this.rewardAmount,
    this.remainingReward
  });
}

class PlusApiResultInviteInfoVO {
  final InviteInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInviteInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultMapStringObject {
  final Map<String, dynamic>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMapStringObject({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUISettingsVO {
  final UISettingsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUISettingsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UISettingsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? theme;
  final String? language;
  final String? fontSize;
  final int? zoomLevel;
  final bool? notificationsEnabled;
  final bool? shortcutsEnabled;
  final String? sidebarState;
  final bool? autoSaveEnabled;

  UISettingsVO({
    this.createdAt,
    this.updatedAt,
    this.theme,
    this.language,
    this.fontSize,
    this.zoomLevel,
    this.notificationsEnabled,
    this.shortcutsEnabled,
    this.sidebarState,
    this.autoSaveEnabled
  });
}

class PlusApiResultSecuritySettingsVO {
  final SecuritySettingsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSecuritySettingsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SecuritySettingsVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? twoFactorEnabled;
  final bool? biometricEnabled;
  final bool? autoLockEnabled;
  final int? autoLockMinutes;
  final bool? loginNotificationsEnabled;
  final bool? ipRestrictionEnabled;
  final List<String>? allowedIps;
  final bool? passwordStrengthCheckEnabled;
  final int? passwordExpiryDays;
  final String? lastPasswordChangeTime;

  SecuritySettingsVO({
    this.createdAt,
    this.updatedAt,
    this.twoFactorEnabled,
    this.biometricEnabled,
    this.autoLockEnabled,
    this.autoLockMinutes,
    this.loginNotificationsEnabled,
    this.ipRestrictionEnabled,
    this.allowedIps,
    this.passwordStrengthCheckEnabled,
    this.passwordExpiryDays,
    this.lastPasswordChangeTime
  });
}

class PlusApiResultPrivacySettingsVO {
  final PrivacySettingsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPrivacySettingsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AppVersionVO {
  final String? createdAt;
  final String? updatedAt;
  final String? currentVersion;
  final String? latestVersion;
  final bool? updateRequired;
  final bool? forceUpdate;
  final String? updateDescription;
  final String? updateUrl;
  final String? updateSize;
  final int? releaseDate;

  AppVersionVO({
    this.createdAt,
    this.updatedAt,
    this.currentVersion,
    this.latestVersion,
    this.updateRequired,
    this.forceUpdate,
    this.updateDescription,
    this.updateUrl,
    this.updateSize,
    this.releaseDate
  });
}

class PlusApiResultAppVersionVO {
  final AppVersionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppVersionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultMapStringBoolean {
  final Map<String, bool>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMapStringBoolean({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AppConfigVO {
  final String? createdAt;
  final String? updatedAt;
  final String? version;
  final String? buildNumber;
  final String? apiVersion;
  final int? serverTime;
  final Map<String, bool>? features;
  final Map<String, dynamic>? systemConfig;
  final bool? maintenanceMode;
  final String? maintenanceMessage;

  AppConfigVO({
    this.createdAt,
    this.updatedAt,
    this.version,
    this.buildNumber,
    this.apiVersion,
    this.serverTime,
    this.features,
    this.systemConfig,
    this.maintenanceMode,
    this.maintenanceMessage
  });
}

class PlusApiResultAppConfigVO {
  final AppConfigVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppConfigVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GlobalSearchRequest {
  final String? keyword;
  final String? type;
  final int? page;
  final int? size;

  GlobalSearchRequest({
    this.keyword,
    this.type,
    this.page,
    this.size
  });
}

class AssetSearchResult {
  final String? id;
  final String? name;
  final String? type;
  final String? path;
  final String? workspaceId;

  AssetSearchResult({
    this.id,
    this.name,
    this.type,
    this.path,
    this.workspaceId
  });
}

class GlobalSearchVO {
  final String? createdAt;
  final String? updatedAt;
  final List<ProjectSearchResult>? projects;
  final List<AssetSearchResult>? assets;
  final List<NoteSearchResult>? notes;
  final List<UserSearchResult>? users;

  GlobalSearchVO({
    this.createdAt,
    this.updatedAt,
    this.projects,
    this.assets,
    this.notes,
    this.users
  });
}

class NoteSearchResult {
  final int? id;
  final String? title;
  final String? summary;
  final String? folderId;
  final String? folderName;

  NoteSearchResult({
    this.id,
    this.title,
    this.summary,
    this.folderId,
    this.folderName
  });
}

class PlusApiResultGlobalSearchVO {
  final GlobalSearchVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGlobalSearchVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectSearchResult {
  final String? id;
  final String? name;
  final String? description;
  final String? workspaceId;
  final String? workspaceName;
  final String? type;

  ProjectSearchResult({
    this.id,
    this.name,
    this.description,
    this.workspaceId,
    this.workspaceName,
    this.type
  });
}

class UserSearchResult {
  final int? id;
  final String? username;
  final String? realName;
  final String? userType;
  final String? avatarUrl;

  UserSearchResult({
    this.id,
    this.username,
    this.realName,
    this.userType,
    this.avatarUrl
  });
}

class UserSearchRequest {
  final String? keyword;
  final String? userType;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  UserSearchRequest({
    this.keyword,
    this.userType,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageUserSearchResult {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<UserSearchResult>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageUserSearchResult({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageUserSearchResult {
  final PageUserSearchResult? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageUserSearchResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListSearchSuggestionVO {
  final List<SearchSuggestionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListSearchSuggestionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SearchSuggestionVO {
  final String? createdAt;
  final String? updatedAt;
  final String? keyword;
  final String? type;
  final int? count;

  SearchSuggestionVO({
    this.createdAt,
    this.updatedAt,
    this.keyword,
    this.type,
    this.count
  });
}

class PlusApiResultSearchStatisticsVO {
  final SearchStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSearchStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SearchStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalSearches;
  final int? todaySearches;
  final int? thisWeekSearches;
  final int? thisMonthSearches;
  final Map<String, int>? hotKeywords;
  final Map<String, int>? typeDistribution;
  final String? lastSearchTime;

  SearchStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalSearches,
    this.todaySearches,
    this.thisWeekSearches,
    this.thisMonthSearches,
    this.hotKeywords,
    this.typeDistribution,
    this.lastSearchTime
  });
}

class ProjectSearchRequest {
  final String? keyword;
  final String? workspaceId;
  final String? type;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  ProjectSearchRequest({
    this.keyword,
    this.workspaceId,
    this.type,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageProjectSearchResult {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ProjectSearchResult>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageProjectSearchResult({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageProjectSearchResult {
  final PageProjectSearchResult? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageProjectSearchResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NoteSearchRequest {
  final String? keyword;
  final String? folderId;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  NoteSearchRequest({
    this.keyword,
    this.folderId,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageNoteSearchResult {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<NoteSearchResult>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageNoteSearchResult({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageNoteSearchResult {
  final PageNoteSearchResult? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageNoteSearchResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class HotSearchVO {
  final String? createdAt;
  final String? updatedAt;
  final String? keyword;
  final int? count;
  final int? rank;

  HotSearchVO({
    this.createdAt,
    this.updatedAt,
    this.keyword,
    this.count,
    this.rank
  });
}

class PlusApiResultListHotSearchVO {
  final List<HotSearchVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListHotSearchVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListSearchHistoryVO {
  final List<SearchHistoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListSearchHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SearchHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? keyword;
  final String? searchTime;
  final int? count;

  SearchHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.keyword,
    this.searchTime,
    this.count
  });
}

class PlusApiResultSearchFiltersVO {
  final SearchFiltersVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSearchFiltersVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SearchFiltersVO {
  final String? createdAt;
  final String? updatedAt;
  final Map<String, String>? typeFilters;
  final Map<String, String>? dateFilters;
  final Map<String, dynamic>? otherFilters;

  SearchFiltersVO({
    this.createdAt,
    this.updatedAt,
    this.typeFilters,
    this.dateFilters,
    this.otherFilters
  });
}

class AssetSearchRequest {
  final String? keyword;
  final String? type;
  final String? workspaceId;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  AssetSearchRequest({
    this.keyword,
    this.type,
    this.workspaceId,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageAssetSearchResult {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<AssetSearchResult>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageAssetSearchResult({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageAssetSearchResult {
  final PageAssetSearchResult? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageAssetSearchResult({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePromptVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PromptVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePromptVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePromptVO {
  final PagePromptVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePromptVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PromptQueryForm {
  final String? keyword;
  final String? type;
  final String? bizType;
  final bool? enabled;
  final String? model;
  final bool? isPublic;
  final bool? isFavorite;
  final int? page;
  final int? size;
  final String? sortBy;
  final String? sortDirection;

  PromptQueryForm({
    this.keyword,
    this.type,
    this.bizType,
    this.enabled,
    this.model,
    this.isPublic,
    this.isFavorite,
    this.page,
    this.size,
    this.sortBy,
    this.sortDirection
  });
}

class PlusApiResultPromptHistoryVO {
  final PromptHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPromptHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PromptHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final int? promptId;
  final String? promptTitle;
  final String? promptContent;
  final String? usedContent;
  final String? responseContent;
  final String? model;
  final int? duration;
  final int? inputTokens;
  final int? outputTokens;
  final bool? success;
  final String? errorMessage;

  PromptHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.promptId,
    this.promptTitle,
    this.promptContent,
    this.usedContent,
    this.responseContent,
    this.model,
    this.duration,
    this.inputTokens,
    this.outputTokens,
    this.success,
    this.errorMessage
  });
}

class PromptHistoryQueryForm {
  final int? promptId;
  final String? keyword;
  final String? model;
  final bool? success;
  final int? page;
  final int? size;
  final String? sortBy;
  final String? sortDirection;

  PromptHistoryQueryForm({
    this.promptId,
    this.keyword,
    this.model,
    this.success,
    this.page,
    this.size,
    this.sortBy,
    this.sortDirection
  });
}

class PagePromptHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PromptHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePromptHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePromptHistoryVO {
  final PagePromptHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePromptHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectListQueryRequest {
  final String? keyword;
  final String? workspaceId;
  final String? type;
  final String? status;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  ProjectListQueryRequest({
    this.keyword,
    this.workspaceId,
    this.type,
    this.status,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PlusApiResultProjectStatisticsVO {
  final ProjectStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultProjectStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProjectStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? projectId;
  final int? totalFiles;
  final int? totalMembers;
  final int? totalConversations;
  final int? documentCount;
  final int? tagCount;
  final String? lastActivityTime;
  final Map<String, int>? activityStats;
  final Map<String, int>? documentTypeStats;

  ProjectStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.projectId,
    this.totalFiles,
    this.totalMembers,
    this.totalConversations,
    this.documentCount,
    this.tagCount,
    this.lastActivityTime,
    this.activityStats,
    this.documentTypeStats
  });
}

class PlusApiResultListProjectVO {
  final List<ProjectVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListProjectVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageProductVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ProductVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageProductVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageProductVO {
  final PageProductVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageProductVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProductVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? type;
  final String? summary;
  final String? mainImage;
  final double? price;
  final double? originalPrice;
  final int? sales;
  final String? status;
  final bool? recommended;
  final bool? hot;
  final String? categoryName;
  final String? brandName;
  final List<String>? tags;

  ProductVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.type,
    this.summary,
    this.mainImage,
    this.price,
    this.originalPrice,
    this.sales,
    this.status,
    this.recommended,
    this.hot,
    this.categoryName,
    this.brandName,
    this.tags
  });
}

class PlusApiResultProductDetailVO {
  final ProductDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultProductDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProductAttributeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final List<String>? values;
  final bool? searchable;
  final bool? filterable;
  final int? sort;

  ProductAttributeVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.values,
    this.searchable,
    this.filterable,
    this.sort
  });
}

class ProductDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? type;
  final String? description;
  final String? summary;
  final String? categoryId;
  final String? categoryName;
  final String? brandId;
  final String? brandName;
  final List<String>? tagIds;
  final List<String>? tags;
  final String? mainImage;
  final List<String>? images;
  final String? videoUrl;
  final double? price;
  final double? originalPrice;
  final int? stock;
  final int? sales;
  final String? status;
  final bool? recommended;
  final bool? hot;
  final int? sort;
  final String? shelfTime;
  final String? offShelfTime;
  final List<ProductAttributeVO>? attributes;
  final List<SkuVO>? skus;
  final Map<String, dynamic>? reviewStatistics;

  ProductDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.type,
    this.description,
    this.summary,
    this.categoryId,
    this.categoryName,
    this.brandId,
    this.brandName,
    this.tagIds,
    this.tags,
    this.mainImage,
    this.images,
    this.videoUrl,
    this.price,
    this.originalPrice,
    this.stock,
    this.sales,
    this.status,
    this.recommended,
    this.hot,
    this.sort,
    this.shelfTime,
    this.offShelfTime,
    this.attributes,
    this.skus,
    this.reviewStatistics
  });
}

class PlusApiResultInteger {
  final int? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInteger({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultProductStatisticsVO {
  final ProductStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultProductStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ProductStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? productId;
  final int? totalSales;
  final int? totalStock;
  final int? reviewCount;
  final double? averageRating;
  final int? viewCount;
  final int? favoriteCount;
  final int? shareCount;
  final Map<String, int>? salesTrend;
  final Map<String, int>? stockTrend;

  ProductStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.productId,
    this.totalSales,
    this.totalStock,
    this.reviewCount,
    this.averageRating,
    this.viewCount,
    this.favoriteCount,
    this.shareCount,
    this.salesTrend,
    this.stockTrend
  });
}

class PlusApiResultListProductVO {
  final List<ProductVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListProductVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultProductVO {
  final ProductVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultProductVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PaymentStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final String? paymentOrderId;
  final String? merchantOrderId;
  final String? status;
  final String? statusName;
  final String? amount;
  final int? payTime;
  final String? paymentMethod;
  final int? paymentId;
  final String? paymentSn;
  final int? orderId;
  final String? paymentProvider;
  final String? transactionId;
  final String? outTradeNo;
  final String? successTime;

  PaymentStatusVO({
    this.createdAt,
    this.updatedAt,
    this.paymentOrderId,
    this.merchantOrderId,
    this.status,
    this.statusName,
    this.amount,
    this.payTime,
    this.paymentMethod,
    this.paymentId,
    this.paymentSn,
    this.orderId,
    this.paymentProvider,
    this.transactionId,
    this.outTradeNo,
    this.successTime
  });
}

class PlusApiResultPaymentStatusVO {
  final PaymentStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPaymentStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PaymentStatisticsVO {
  final int? totalPayments;
  final int? pendingPayments;
  final int? successPayments;
  final int? failedPayments;
  final int? closedPayments;

  PaymentStatisticsVO({
    this.totalPayments,
    this.pendingPayments,
    this.successPayments,
    this.failedPayments,
    this.closedPayments
  });
}

class PlusApiResultPaymentStatisticsVO {
  final PaymentStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPaymentStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PaymentQueryForm {
  final String? paymentOrderId;
  final String? merchantOrderId;
  final String? queryType;
  final String? status;
  final int? page;
  final int? size;

  PaymentQueryForm({
    this.paymentOrderId,
    this.merchantOrderId,
    this.queryType,
    this.status,
    this.page,
    this.size
  });
}

class PagePaymentStatusVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PaymentStatusVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePaymentStatusVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePaymentStatusVO {
  final PagePaymentStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePaymentStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPaymentStatusVO {
  final List<PaymentStatusVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPaymentStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PaymentMethodVO {
  final String? createdAt;
  final String? updatedAt;
  final String? code;
  final String? methodId;
  final String? methodName;
  final String? methodIcon;
  final bool? enabled;
  final int? sort;
  final String? icon;
  final bool? available;
  final List<PaymentProductTypeVO>? productTypes;

  PaymentMethodVO({
    this.createdAt,
    this.updatedAt,
    this.code,
    this.methodId,
    this.methodName,
    this.methodIcon,
    this.enabled,
    this.sort,
    this.icon,
    this.available,
    this.productTypes
  });
}

class PaymentProductTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? code;
  final String? name;
  final bool? available;

  PaymentProductTypeVO({
    this.createdAt,
    this.updatedAt,
    this.code,
    this.name,
    this.available
  });
}

class PlusApiResultListPaymentMethodVO {
  final List<PaymentMethodVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPaymentMethodVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PartnerDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? partnerId;
  final String? name;
  final String? level;
  final String? status;
  final String? promotionCode;
  final String? contactName;
  final String? contactPhone;
  final String? contactEmail;
  final String? companyAddress;
  final String? businessLicense;
  final String? settlementAccount;
  final double? commissionRate;
  final double? totalCommission;
  final double? withdrawableCommission;
  final double? withdrawnCommission;
  final int? parentId;
  final String? cooperationStartTime;
  final String? cooperationEndTime;
  final String? remark;

  PartnerDetailVO({
    this.createdAt,
    this.updatedAt,
    this.partnerId,
    this.name,
    this.level,
    this.status,
    this.promotionCode,
    this.contactName,
    this.contactPhone,
    this.contactEmail,
    this.companyAddress,
    this.businessLicense,
    this.settlementAccount,
    this.commissionRate,
    this.totalCommission,
    this.withdrawableCommission,
    this.withdrawnCommission,
    this.parentId,
    this.cooperationStartTime,
    this.cooperationEndTime,
    this.remark
  });
}

class PlusApiResultPartnerDetailVO {
  final PartnerDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPartnerDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PagePartnerVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PartnerVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePartnerVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePartnerVO {
  final PagePartnerVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePartnerVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PartnerStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalPartners;
  final int? activePartners;
  final int? pendingPartners;
  final double? totalCommission;
  final double? withdrawableCommission;

  PartnerStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalPartners,
    this.activePartners,
    this.pendingPartners,
    this.totalCommission,
    this.withdrawableCommission
  });
}

class PlusApiResultPartnerStatisticsVO {
  final PartnerStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPartnerStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrganizationDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? status;
  final String? description;
  final int? parentId;
  final String? contactPerson;
  final String? contactPhone;
  final String? contactEmail;
  final String? address;
  final String? website;
  final String? logoUrl;
  final OrganizationMetadata? metadata;
  final InstallAppList? installAppList;
  final int? memberCount;
  final int? departmentCount;
  final int? positionCount;

  OrganizationDetailVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.status,
    this.description,
    this.parentId,
    this.contactPerson,
    this.contactPhone,
    this.contactEmail,
    this.address,
    this.website,
    this.logoUrl,
    this.metadata,
    this.installAppList,
    this.memberCount,
    this.departmentCount,
    this.positionCount
  });
}

class OrganizationMetadata {
  final int? spMchId;
  final int? partnerId;
  final int? agentId;
  final int? shopId;

  OrganizationMetadata({
    this.spMchId,
    this.partnerId,
    this.agentId,
    this.shopId
  });
}

class PlusApiResultOrganizationDetailVO {
  final OrganizationDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrganizationDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPositionVO {
  final List<PositionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPositionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PathNode {
  final int? id;
  final String? name;
  final String? code;
  final int? level;
  final bool? isCurrent;

  PathNode({
    this.id,
    this.name,
    this.code,
    this.level,
    this.isCurrent
  });
}

class PlusApiResultListPositionDetailVO {
  final List<PositionDetailVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPositionDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PositionDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? description;
  final int? ownerId;
  final int? parentId;
  final int? level;
  final bool? isActive;
  final int? sortOrder;
  final TreeNodePath? treePath;
  final String? fullPathName;
  final String? category;
  final String? levelName;
  final int? requiredExperienceYears;
  final String? requiredEducation;
  final int? maxMemberCount;
  final int? currentMemberCount;
  final bool? isFull;

  PositionDetailVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.description,
    this.ownerId,
    this.parentId,
    this.level,
    this.isActive,
    this.sortOrder,
    this.treePath,
    this.fullPathName,
    this.category,
    this.levelName,
    this.requiredExperienceYears,
    this.requiredEducation,
    this.maxMemberCount,
    this.currentMemberCount,
    this.isFull
  });
}

class TreeNodePath {
  final List<PathNode>? nodes;
  final int? level;
  final int? depth;
  final String? pathName;
  final PathNode? rootNode;
  final PathNode? parentNode;
  final List<int>? pathIds;
  final PathNode? currentNode;

  TreeNodePath({
    this.nodes,
    this.level,
    this.depth,
    this.pathName,
    this.rootNode,
    this.parentNode,
    this.pathIds,
    this.currentNode
  });
}

class PageMemberVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<MemberVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageMemberVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageMemberVO {
  final PageMemberVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListDepartmentVO {
  final List<DepartmentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListDepartmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DepartmentDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? name;
  final String? code;
  final String? description;
  final int? ownerId;
  final int? parentId;
  final int? level;
  final bool? isActive;
  final int? sortOrder;
  final TreeNodePath? treePath;
  final String? fullPathName;
  final int? managerId;
  final String? phone;
  final String? email;
  final int? memberCount;
  final int? childrenCount;

  DepartmentDetailVO({
    this.createdAt,
    this.updatedAt,
    this.name,
    this.code,
    this.description,
    this.ownerId,
    this.parentId,
    this.level,
    this.isActive,
    this.sortOrder,
    this.treePath,
    this.fullPathName,
    this.managerId,
    this.phone,
    this.email,
    this.memberCount,
    this.childrenCount
  });
}

class PlusApiResultListDepartmentDetailVO {
  final List<DepartmentDetailVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListDepartmentDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListOrganizationVO {
  final List<OrganizationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListOrganizationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrganizationStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalOrganizations;
  final int? activeOrganizations;
  final int? totalMembers;
  final int? totalDepartments;
  final int? totalPositions;

  OrganizationStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalOrganizations,
    this.activeOrganizations,
    this.totalMembers,
    this.totalDepartments,
    this.totalPositions
  });
}

class PlusApiResultOrganizationStatisticsVO {
  final OrganizationStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrganizationStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultPositionDetailVO {
  final PositionDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPositionDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultMemberVO {
  final MemberVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMemberVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageOrganizationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<OrganizationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageOrganizationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageOrganizationVO {
  final PageOrganizationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageOrganizationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultDepartmentDetailVO {
  final DepartmentDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDepartmentDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderListQueryForm {
  final int? page;
  final int? size;
  final String? status;
  final String? orderType;
  final String? keyword;
  final String? startTime;
  final String? endTime;

  OrderListQueryForm({
    this.page,
    this.size,
    this.status,
    this.orderType,
    this.keyword,
    this.startTime,
    this.endTime
  });
}

class PageOrderVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<OrderVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageOrderVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageOrderVO {
  final PageOrderVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageOrderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CouponInfoVO {
  final String? couponId;
  final String? couponName;
  final String? discountAmount;
  final String? couponType;

  CouponInfoVO({
    this.couponId,
    this.couponName,
    this.discountAmount,
    this.couponType
  });
}

class OrderAddressVO {
  final String? recipient;
  final String? phone;
  final String? address;

  OrderAddressVO({
    this.recipient,
    this.phone,
    this.address
  });
}

class OrderDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? orderId;
  final String? orderSn;
  final String? orderType;
  final String? orderTypeName;
  final String? subject;
  final String? productId;
  final String? productImage;
  final int? quantity;
  final String? productAmount;
  final String? shippingAmount;
  final String? discountAmount;
  final String? taxAmount;
  final String? totalAmount;
  final String? paidAmount;
  final String? paidPointsAmount;
  final String? refundedAmount;
  final String? status;
  final String? statusName;
  final String? refundStatus;
  final String? refundStatusName;
  final String? paymentMethod;
  final String? paymentProvider;
  final String? transactionId;
  final String? outTradeNo;
  final String? currency;
  final String? payTime;
  final String? expireTime;
  final String? completeTime;
  final String? cancelTime;
  final String? remark;
  final String? merchantRemark;
  final String? sourceChannel;
  final int? userId;
  final String? username;
  final String? email;
  final String? receiverName;
  final String? receiverPhone;
  final String? receiverAddress;
  final String? logisticsCompany;
  final String? logisticsNo;
  final String? deliverTime;
  final CouponInfoVO? couponInfo;
  final List<OrderItemVO>? items;
  final OrderAddressVO? address;

  OrderDetailVO({
    this.createdAt,
    this.updatedAt,
    this.orderId,
    this.orderSn,
    this.orderType,
    this.orderTypeName,
    this.subject,
    this.productId,
    this.productImage,
    this.quantity,
    this.productAmount,
    this.shippingAmount,
    this.discountAmount,
    this.taxAmount,
    this.totalAmount,
    this.paidAmount,
    this.paidPointsAmount,
    this.refundedAmount,
    this.status,
    this.statusName,
    this.refundStatus,
    this.refundStatusName,
    this.paymentMethod,
    this.paymentProvider,
    this.transactionId,
    this.outTradeNo,
    this.currency,
    this.payTime,
    this.expireTime,
    this.completeTime,
    this.cancelTime,
    this.remark,
    this.merchantRemark,
    this.sourceChannel,
    this.userId,
    this.username,
    this.email,
    this.receiverName,
    this.receiverPhone,
    this.receiverAddress,
    this.logisticsCompany,
    this.logisticsNo,
    this.deliverTime,
    this.couponInfo,
    this.items,
    this.address
  });
}

class OrderItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? orderId;
  final String? categoryId;
  final String? productType;
  final String? productId;
  final String? skuId;
  final String? productName;
  final String? productImage;
  final int? quantity;
  final String? unitPrice;
  final String? totalAmount;
  final String? discountAmount;
  final String? paidAmount;
  final String? refundedAmount;
  final String? skuSpec;
  final String? currency;
  final String? refundStatus;
  final String? reviewStatus;
  final String? paymentProvider;
  final String? paymentProductType;
  final String? expireTime;

  OrderItemVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.orderId,
    this.categoryId,
    this.productType,
    this.productId,
    this.skuId,
    this.productName,
    this.productImage,
    this.quantity,
    this.unitPrice,
    this.totalAmount,
    this.discountAmount,
    this.paidAmount,
    this.refundedAmount,
    this.skuSpec,
    this.currency,
    this.refundStatus,
    this.reviewStatus,
    this.paymentProvider,
    this.paymentProductType,
    this.expireTime
  });
}

class PlusApiResultOrderDetailVO {
  final OrderDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderStatusVO {
  final String? orderId;
  final String? status;
  final String? statusName;
  final int? expireTime;

  OrderStatusVO({
    this.orderId,
    this.status,
    this.statusName,
    this.expireTime
  });
}

class PlusApiResultOrderStatusVO {
  final OrderStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OrderStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalOrders;
  final int? pendingPayment;
  final int? pendingShipment;
  final int? pendingReceipt;
  final int? completed;
  final String? totalAmount;

  OrderStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalOrders,
    this.pendingPayment,
    this.pendingShipment,
    this.pendingReceipt,
    this.completed,
    this.totalAmount
  });
}

class PlusApiResultOrderStatisticsVO {
  final OrderStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultOrderStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NotificationQueryForm {
  final String? type;
  final bool? read;
  final int? page;
  final int? size;
  final String? sortBy;
  final String? sortDirection;

  NotificationQueryForm({
    this.type,
    this.read,
    this.page,
    this.size,
    this.sortBy,
    this.sortDirection
  });
}

class PageNotificationVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<NotificationVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageNotificationVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageNotificationVO {
  final PageNotificationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageNotificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NotificationDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? notificationId;
  final String? title;
  final String? content;
  final String? type;
  final String? status;
  final String? source;
  final String? redirectUrl;
  final bool? isRead;
  final String? readAt;
  final Map<String, dynamic>? extraData;

  NotificationDetailVO({
    this.createdAt,
    this.updatedAt,
    this.notificationId,
    this.title,
    this.content,
    this.type,
    this.status,
    this.source,
    this.redirectUrl,
    this.isRead,
    this.readAt,
    this.extraData
  });
}

class PlusApiResultNotificationDetailVO {
  final NotificationDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNotificationDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultMapStringInteger {
  final Map<String, int>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMapStringInteger({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NotificationTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? name;
  final bool? enabled;
  final String? pushMethod;
  final bool? needReminder;
  final String? description;

  NotificationTypeVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.name,
    this.enabled,
    this.pushMethod,
    this.needReminder,
    this.description
  });
}

class PlusApiResultListNotificationTypeVO {
  final List<NotificationTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListNotificationTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListString {
  final List<String>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListString({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DeviceVO {
  final String? createdAt;
  final String? updatedAt;
  final String? deviceId;
  final String? deviceType;
  final String? deviceName;
  final String? pushToken;
  final String? osVersion;
  final String? appVersion;
  final bool? isActive;
  final String? registerTime;
  final String? lastActiveAt;

  DeviceVO({
    this.createdAt,
    this.updatedAt,
    this.deviceId,
    this.deviceType,
    this.deviceName,
    this.pushToken,
    this.osVersion,
    this.appVersion,
    this.isActive,
    this.registerTime,
    this.lastActiveAt
  });
}

class PlusApiResultListDeviceVO {
  final List<DeviceVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListDeviceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NoteListQueryRequest {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortOrder;
  final String? folderId;
  final String? keyword;

  NoteListQueryRequest({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortOrder,
    this.folderId,
    this.keyword
  });
}

class NoteVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? uuid;
  final String? title;
  final String? content;
  final int? userId;
  final String? folderId;
  final String? folderPath;
  final List<String>? tags;
  final String? accessScope;
  final bool? hasPassword;
  final String? coverImageUrl;
  final String? status;
  final String? summary;
  final bool? favorited;
  final int? wordCount;

  NoteVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.uuid,
    this.title,
    this.content,
    this.userId,
    this.folderId,
    this.folderPath,
    this.tags,
    this.accessScope,
    this.hasPassword,
    this.coverImageUrl,
    this.status,
    this.summary,
    this.favorited,
    this.wordCount
  });
}

class PageNoteVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<NoteVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageNoteVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageNoteVO {
  final PageNoteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageNoteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultNoteVO {
  final NoteVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNoteVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NoteStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalNotes;
  final int? totalFolders;
  final int? favoritedNotes;
  final int? thisMonthNotes;
  final int? thisWeekNotes;
  final int? todayNotes;
  final int? totalWords;
  final String? lastUpdateTime;
  final Map<String, int>? folderNoteCounts;
  final Map<String, int>? tagUsageCounts;

  NoteStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalNotes,
    this.totalFolders,
    this.favoritedNotes,
    this.thisMonthNotes,
    this.thisWeekNotes,
    this.todayNotes,
    this.totalWords,
    this.lastUpdateTime,
    this.folderNoteCounts,
    this.tagUsageCounts
  });
}

class PlusApiResultNoteStatisticsVO {
  final NoteStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNoteStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListNoteFolderVO {
  final List<NoteFolderVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListNoteFolderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class NewsDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? newsId;
  final String? title;
  final String? summary;
  final String? url;
  final String? source;
  final int? categoryId;
  final TagsContent? tags;
  final String? publishTime;

  NewsDetailVO({
    this.createdAt,
    this.updatedAt,
    this.newsId,
    this.title,
    this.summary,
    this.url,
    this.source,
    this.categoryId,
    this.tags,
    this.publishTime
  });
}

class PlusApiResultNewsDetailVO {
  final NewsDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultNewsDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageNewsVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<NewsVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageNewsVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageNewsVO {
  final PageNewsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageNewsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MusicDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? musicId;
  final String? title;
  final String? description;
  final String? contentUrl;
  final String? format;
  final int? duration;
  final String? artist;
  final String? genre;
  final int? bitrate;
  final int? fileSize;
  final String? thumbnailUrl;
  final ImageMediaResourceList? coverImages;
  final MusicMediaResource? resource;
  final AuthorInfo? author;
  final String? status;
  final bool? isPublic;
  final bool? isFavorite;
  final int? playCount;
  final int? downloadCount;
  final int? likeCount;

  MusicDetailVO({
    this.createdAt,
    this.updatedAt,
    this.musicId,
    this.title,
    this.description,
    this.contentUrl,
    this.format,
    this.duration,
    this.artist,
    this.genre,
    this.bitrate,
    this.fileSize,
    this.thumbnailUrl,
    this.coverImages,
    this.resource,
    this.author,
    this.status,
    this.isPublic,
    this.isFavorite,
    this.playCount,
    this.downloadCount,
    this.likeCount
  });
}

class PlusApiResultMusicDetailVO {
  final MusicDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMusicDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MusicStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalMusic;
  final int? completedMusic;
  final int? processingMusic;

  MusicStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalMusic,
    this.completedMusic,
    this.processingMusic
  });
}

class PlusApiResultMusicStatisticsVO {
  final MusicStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMusicStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageMusicVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<MusicVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageMusicVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageMusicVO {
  final PageMusicVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageMusicVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AspectRatio {
  final String? ratio;
  final double? width;
  final double? height;

  AspectRatio({
    this.ratio,
    this.width,
    this.height
  });
}

class ModelInfoDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? modelId;
  final String? model;
  final String? name;
  final String? description;
  final String? channel;
  final String? vendor;
  final String? modelType;
  final String? family;
  final String? version;
  final bool? openSource;
  final String? apiEndpoint;
  final String? ownedBy;
  final SceneContent? scenes;
  final TagsContent? tags;
  final ModelLimitInfo? limitInfo;
  final ModelPrice? priceInfo;
  final ModelMetadata? metadata;
  final double? defaultTemperature;
  final double? defaultTopP;
  final double? defaultFrequencyPenalty;
  final double? defaultPresencePenalty;
  final String? status;
  final int? usageCount;
  final int? totalTokens;
  final int? avgResponseTime;

  ModelInfoDetailVO({
    this.createdAt,
    this.updatedAt,
    this.modelId,
    this.model,
    this.name,
    this.description,
    this.channel,
    this.vendor,
    this.modelType,
    this.family,
    this.version,
    this.openSource,
    this.apiEndpoint,
    this.ownedBy,
    this.scenes,
    this.tags,
    this.limitInfo,
    this.priceInfo,
    this.metadata,
    this.defaultTemperature,
    this.defaultTopP,
    this.defaultFrequencyPenalty,
    this.defaultPresencePenalty,
    this.status,
    this.usageCount,
    this.totalTokens,
    this.avgResponseTime
  });
}

class ModelLimitInfo {
  final String? unit;
  final List<ModelLimitItem>? items;

  ModelLimitInfo({
    this.unit,
    this.items
  });
}

class ModelLimitItem {
  final String? type;
  final double? value;

  ModelLimitItem({
    this.type,
    this.value
  });
}

class ModelMetadata {
  final List<int>? durations;
  final List<String>? resolutions;
  final List<AspectRatio>? ratios;
  final bool? isMultimodal;
  final bool? isReasoning;
  final bool? isToolCall;

  ModelMetadata({
    this.durations,
    this.resolutions,
    this.ratios,
    this.isMultimodal,
    this.isReasoning,
    this.isToolCall
  });
}

class ModelPrice {
  final String? unit;
  final List<ModelPriceItem>? items;
  final String? currency;

  ModelPrice({
    this.unit,
    this.items,
    this.currency
  });
}

class ModelPriceItem {
  final String? type;
  final double? price;

  ModelPriceItem({
    this.type,
    this.price
  });
}

class PlusApiResultModelInfoDetailVO {
  final ModelInfoDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultModelInfoDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SceneContent {
  final List<String>? scenes;
  final List<SceneContent>? children;

  SceneContent({
    this.scenes,
    this.children
  });
}

class ModelTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? name;

  ModelTypeVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.name
  });
}

class PlusApiResultListModelTypeVO {
  final List<ModelTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListModelTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ModelInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? modelId;
  final String? model;
  final String? name;
  final String? description;
  final String? channel;
  final String? modelType;
  final String? family;
  final String? version;
  final bool? openSource;
  final String? status;
  final int? usageCount;

  ModelInfoVO({
    this.createdAt,
    this.updatedAt,
    this.modelId,
    this.model,
    this.name,
    this.description,
    this.channel,
    this.modelType,
    this.family,
    this.version,
    this.openSource,
    this.status,
    this.usageCount
  });
}

class PageModelInfoVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ModelInfoVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageModelInfoVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageModelInfoVO {
  final PageModelInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageModelInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ModelStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalModels;
  final int? activeModels;
  final int? chatModels;
  final int? imageModels;
  final int? audioModels;

  ModelStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalModels,
    this.activeModels,
    this.chatModels,
    this.imageModels,
    this.audioModels
  });
}

class PlusApiResultModelStatisticsVO {
  final ModelStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultModelStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultModelPriceVO {
  final ModelPriceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultModelPriceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InvoiceDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? invoiceId;
  final String? title;
  final String? titleType;
  final String? taxNo;
  final String? type;
  final String? status;
  final String? invoiceCode;
  final String? invoiceNo;
  final double? amountExcludingTax;
  final double? taxAmount;
  final double? totalAmount;
  final double? taxRate;
  final String? currency;
  final String? bankName;
  final String? bankAccount;
  final String? registerAddress;
  final String? registerPhone;
  final String? electronicUrl;
  final String? invoiceTime;
  final List<InvoiceItemVO>? items;

  InvoiceDetailVO({
    this.createdAt,
    this.updatedAt,
    this.invoiceId,
    this.title,
    this.titleType,
    this.taxNo,
    this.type,
    this.status,
    this.invoiceCode,
    this.invoiceNo,
    this.amountExcludingTax,
    this.taxAmount,
    this.totalAmount,
    this.taxRate,
    this.currency,
    this.bankName,
    this.bankAccount,
    this.registerAddress,
    this.registerPhone,
    this.electronicUrl,
    this.invoiceTime,
    this.items
  });
}

class InvoiceItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? itemId;
  final String? productName;
  final String? specification;
  final String? unit;
  final double? quantity;
  final double? unitPriceExcludingTax;
  final double? amountExcludingTax;
  final double? taxAmount;
  final double? totalAmount;
  final double? taxRate;

  InvoiceItemVO({
    this.createdAt,
    this.updatedAt,
    this.itemId,
    this.productName,
    this.specification,
    this.unit,
    this.quantity,
    this.unitPriceExcludingTax,
    this.amountExcludingTax,
    this.taxAmount,
    this.totalAmount,
    this.taxRate
  });
}

class PlusApiResultInvoiceDetailVO {
  final InvoiceDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInvoiceDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListInvoiceItemVO {
  final List<InvoiceItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListInvoiceItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class InvoiceStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalInvoices;
  final int? pendingInvoices;
  final int? completedInvoices;
  final double? totalAmount;

  InvoiceStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalInvoices,
    this.pendingInvoices,
    this.completedInvoices,
    this.totalAmount
  });
}

class PlusApiResultInvoiceStatisticsVO {
  final InvoiceStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInvoiceStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageInvoiceVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<InvoiceVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageInvoiceVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageInvoiceVO {
  final PageInvoiceVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageInvoiceVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ImageDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? imageId;
  final String? title;
  final String? description;
  final String? url;
  final String? format;
  final int? width;
  final int? height;
  final String? aspectRatio;
  final int? fileSize;
  final ImageMediaResource? resource;
  final AuthorInfo? author;
  final String? status;
  final bool? isPublic;
  final bool? isFavorite;
  final int? viewCount;
  final int? downloadCount;
  final int? likeCount;

  ImageDetailVO({
    this.createdAt,
    this.updatedAt,
    this.imageId,
    this.title,
    this.description,
    this.url,
    this.format,
    this.width,
    this.height,
    this.aspectRatio,
    this.fileSize,
    this.resource,
    this.author,
    this.status,
    this.isPublic,
    this.isFavorite,
    this.viewCount,
    this.downloadCount,
    this.likeCount
  });
}

class PlusApiResultImageDetailVO {
  final ImageDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultImageDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ImageStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalImages;
  final int? completedImages;
  final int? processingImages;

  ImageStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalImages,
    this.completedImages,
    this.processingImages
  });
}

class PlusApiResultImageStatisticsVO {
  final ImageStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultImageStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageImageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ImageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageImageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageImageVO {
  final PageImageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageImageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class HistoryStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? browseCount;
  final int? operationCount;
  final int? generationCount;
  final int? loginCount;
  final int? activeSessionCount;
  final int? todayOperationCount;
  final int? weeklyOperationCount;
  final int? monthlyOperationCount;
  final String? mostFrequentAction;
  final String? mostFrequentBrowseType;

  HistoryStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.browseCount,
    this.operationCount,
    this.generationCount,
    this.loginCount,
    this.activeSessionCount,
    this.todayOperationCount,
    this.weeklyOperationCount,
    this.monthlyOperationCount,
    this.mostFrequentAction,
    this.mostFrequentBrowseType
  });
}

class PlusApiResultHistoryStatisticsVO {
  final HistoryStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultHistoryStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BrowseStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalCount;
  final int? totalDuration;
  final int? averageDuration;
  final int? todayCount;
  final int? weeklyCount;
  final int? monthlyCount;
  final Map<String, int>? typeDistribution;
  final Map<String, int>? sourceDistribution;
  final Map<String, int>? dailyTrend;

  BrowseStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalCount,
    this.totalDuration,
    this.averageDuration,
    this.todayCount,
    this.weeklyCount,
    this.monthlyCount,
    this.typeDistribution,
    this.sourceDistribution,
    this.dailyTrend
  });
}

class PlusApiResultBrowseStatisticsVO {
  final BrowseStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultBrowseStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListSessionInfoVO {
  final List<SessionInfoVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListSessionInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SessionInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? sessionId;
  final String? loginTime;
  final String? lastActivityTime;
  final String? ipAddress;
  final String? location;
  final String? device;
  final String? browser;
  final String? os;
  final String? loginMethod;
  final String? status;
  final int? remainingMinutes;

  SessionInfoVO({
    this.createdAt,
    this.updatedAt,
    this.sessionId,
    this.loginTime,
    this.lastActivityTime,
    this.ipAddress,
    this.location,
    this.device,
    this.browser,
    this.os,
    this.loginMethod,
    this.status,
    this.remainingMinutes
  });
}

class PlusApiResultSessionInfoVO {
  final SessionInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSessionInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OperationHistoryQueryForm {
  final String? action;
  final String? result;
  final int? page;
  final int? size;
  final String? sortField;
  final String? sortOrder;

  OperationHistoryQueryForm({
    this.action,
    this.result,
    this.page,
    this.size,
    this.sortField,
    this.sortOrder
  });
}

class OperationHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? action;
  final String? description;
  final String? targetType;
  final String? targetId;
  final String? targetName;
  final String? result;
  final String? operationTime;
  final String? ipAddress;
  final String? userAgent;

  OperationHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.action,
    this.description,
    this.targetType,
    this.targetId,
    this.targetName,
    this.result,
    this.operationTime,
    this.ipAddress,
    this.userAgent
  });
}

class PageOperationHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<OperationHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageOperationHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageOperationHistoryVO {
  final PageOperationHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageOperationHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListOperationHistoryVO {
  final List<OperationHistoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListOperationHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class LoginHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? loginTime;
  final String? ipAddress;
  final String? location;
  final String? device;
  final String? browser;
  final String? os;
  final String? loginMethod;
  final String? status;
  final String? result;
  final String? failureReason;

  LoginHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.loginTime,
    this.ipAddress,
    this.location,
    this.device,
    this.browser,
    this.os,
    this.loginMethod,
    this.status,
    this.result,
    this.failureReason
  });
}

class PageLoginHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<LoginHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageLoginHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageLoginHistoryVO {
  final PageLoginHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageLoginHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class GenerationHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? taskId;
  final String? title;
  final String? description;
  final String? status;
  final int? duration;
  final String? resultUrl;
  final String? resultPreview;
  final String? startTime;
  final String? endTime;
  final String? modelName;
  final int? tokenUsage;

  GenerationHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.taskId,
    this.title,
    this.description,
    this.status,
    this.duration,
    this.resultUrl,
    this.resultPreview,
    this.startTime,
    this.endTime,
    this.modelName,
    this.tokenUsage
  });
}

class PageGenerationHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<GenerationHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageGenerationHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageGenerationHistoryVO {
  final PageGenerationHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageGenerationHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListGenerationHistoryVO {
  final List<GenerationHistoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListGenerationHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BrowseHistoryQueryForm {
  final String? type;
  final String? targetId;
  final int? page;
  final int? size;
  final String? sortField;
  final String? sortOrder;

  BrowseHistoryQueryForm({
    this.type,
    this.targetId,
    this.page,
    this.size,
    this.sortField,
    this.sortOrder
  });
}

class BrowseHistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? targetId;
  final String? targetName;
  final String? targetDescription;
  final String? targetIcon;
  final String? browseTime;
  final int? duration;
  final String? source;

  BrowseHistoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.targetId,
    this.targetName,
    this.targetDescription,
    this.targetIcon,
    this.browseTime,
    this.duration,
    this.source
  });
}

class PageBrowseHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<BrowseHistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageBrowseHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageBrowseHistoryVO {
  final PageBrowseHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageBrowseHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultVoiceSpeakerGenerationVO {
  final VoiceSpeakerGenerationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoiceSpeakerGenerationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceSpeakerGenerationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? speakerId;
  final String? speakerName;
  final String? description;
  final String? previewAudioUrl;
  final String? gender;
  final String? ageRange;
  final String? language;
  final String? style;
  final String? status;
  final bool? favorite;
  final String? completedAt;

  VoiceSpeakerGenerationVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.speakerId,
    this.speakerName,
    this.description,
    this.previewAudioUrl,
    this.gender,
    this.ageRange,
    this.language,
    this.style,
    this.status,
    this.favorite,
    this.completedAt
  });
}

class Pageable {
  final int? page;
  final int? size;
  final List<String>? sort;

  Pageable({
    this.page,
    this.size,
    this.sort
  });
}

class PageGenerationTaskVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<GenerationTaskVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageGenerationTaskVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageGenerationTaskVO {
  final PageGenerationTaskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageGenerationTaskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceSpeakerListQueryForm {
  final String? gender;
  final String? language;
  final String? style;
  final String? ageRange;
  final int? pageNum;
  final int? pageSize;
  final bool? onlyFavorite;

  VoiceSpeakerListQueryForm({
    this.gender,
    this.language,
    this.style,
    this.ageRange,
    this.pageNum,
    this.pageSize,
    this.onlyFavorite
  });
}

class PageVoiceSpeakerListVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<VoiceSpeakerListVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageVoiceSpeakerListVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageVoiceSpeakerListVO {
  final PageVoiceSpeakerListVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageVoiceSpeakerListVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceSpeakerItem {
  final String? speakerId;
  final String? speakerName;
  final String? description;
  final String? previewAudioUrl;
  final String? gender;
  final String? ageRange;
  final String? language;
  final String? style;
  final bool? favorite;
  final String? createdAt;

  VoiceSpeakerItem({
    this.speakerId,
    this.speakerName,
    this.description,
    this.previewAudioUrl,
    this.gender,
    this.ageRange,
    this.language,
    this.style,
    this.favorite,
    this.createdAt
  });
}

class VoiceSpeakerListVO {
  final String? createdAt;
  final String? updatedAt;
  final List<VoiceSpeakerItem>? speakers;
  final int? total;
  final int? page;
  final int? size;

  VoiceSpeakerListVO({
    this.createdAt,
    this.updatedAt,
    this.speakers,
    this.total,
    this.page,
    this.size
  });
}

class GenerationStyleDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? styleId;
  final String? name;
  final String? description;
  final String? type;
  final Map<String, dynamic>? configParams;
  final TagsContent? tags;
  final ImageMediaResource? coverImage;
  final AssetMediaResourceList? assets;
  final ImageMediaResource? previewImage;
  final bool? isPublic;
  final String? status;
  final int? usageCount;

  GenerationStyleDetailVO({
    this.createdAt,
    this.updatedAt,
    this.styleId,
    this.name,
    this.description,
    this.type,
    this.configParams,
    this.tags,
    this.coverImage,
    this.assets,
    this.previewImage,
    this.isPublic,
    this.status,
    this.usageCount
  });
}

class PlusApiResultGenerationStyleDetailVO {
  final GenerationStyleDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerationStyleDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListStyleTypeVO {
  final List<StyleTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListStyleTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class StyleTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? name;

  StyleTypeVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.name
  });
}

class PlusApiResultStyleStatisticsVO {
  final StyleStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultStyleStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class StyleStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalStyles;
  final int? activeStyles;
  final int? imageStyles;
  final int? videoStyles;
  final int? musicStyles;

  StyleStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalStyles,
    this.activeStyles,
    this.imageStyles,
    this.videoStyles,
    this.musicStyles
  });
}

class PageGenerationStyleVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<GenerationStyleVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageGenerationStyleVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageGenerationStyleVO {
  final PageGenerationStyleVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageGenerationStyleVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultSoundEffectGenerationVO {
  final SoundEffectGenerationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSoundEffectGenerationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SoundEffectGenerationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? soundEffectId;
  final String? name;
  final String? description;
  final String? audioUrl;
  final String? waveformUrl;
  final String? category;
  final int? duration;
  final String? status;
  final String? completedAt;

  SoundEffectGenerationVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.soundEffectId,
    this.name,
    this.description,
    this.audioUrl,
    this.waveformUrl,
    this.category,
    this.duration,
    this.status,
    this.completedAt
  });
}

class SoundEffectCategoriesQueryForm {
  final String? parentCategory;
  final String? language;
  final bool? includeSubcategories;

  SoundEffectCategoriesQueryForm({
    this.parentCategory,
    this.language,
    this.includeSubcategories
  });
}

class CategoryItem {
  final String? id;
  final String? name;
  final String? description;
  final String? parentId;
  final List<CategoryItem>? subcategories;
  final List<String>? tags;

  CategoryItem({
    this.id,
    this.name,
    this.description,
    this.parentId,
    this.subcategories,
    this.tags
  });
}

class PlusApiResultSoundEffectCategoriesVO {
  final SoundEffectCategoriesVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSoundEffectCategoriesVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SoundEffectCategoriesVO {
  final String? createdAt;
  final String? updatedAt;
  final List<CategoryItem>? categories;

  SoundEffectCategoriesVO({
    this.createdAt,
    this.updatedAt,
    this.categories
  });
}

class MusicStylesQueryForm {
  final String? category;
  final String? genre;
  final String? style;
  final String? mood;
  final String? instrument;

  MusicStylesQueryForm({
    this.category,
    this.genre,
    this.style,
    this.mood,
    this.instrument
  });
}

class GenreVO {
  final String? name;
  final String? description;

  GenreVO({
    this.name,
    this.description
  });
}

class InstrumentVO {
  final String? name;
  final String? description;

  InstrumentVO({
    this.name,
    this.description
  });
}

class MoodVO {
  final String? name;
  final String? description;

  MoodVO({
    this.name,
    this.description
  });
}

class MusicStylesVO {
  final String? createdAt;
  final String? updatedAt;
  final List<GenreVO>? genres;
  final List<StyleVO>? styles;
  final List<MoodVO>? moods;
  final List<InstrumentVO>? instruments;

  MusicStylesVO({
    this.createdAt,
    this.updatedAt,
    this.genres,
    this.styles,
    this.moods,
    this.instruments
  });
}

class PlusApiResultMusicStylesVO {
  final MusicStylesVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMusicStylesVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class StyleVO {
  final String? name;
  final String? description;
  final String? genre;

  StyleVO({
    this.name,
    this.description,
    this.genre
  });
}

class CharacterGenerationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? characterId;
  final String? name;
  final String? description;
  final String? imageUrl;
  final String? thumbnailUrl;
  final String? style;
  final String? status;
  final String? completedAt;

  CharacterGenerationVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.characterId,
    this.name,
    this.description,
    this.imageUrl,
    this.thumbnailUrl,
    this.style,
    this.status,
    this.completedAt
  });
}

class PlusApiResultCharacterGenerationVO {
  final CharacterGenerationVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCharacterGenerationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CharacterListQueryForm {
  final String? style;
  final String? keyword;
  final int? pageNum;
  final int? pageSize;
  final String? sortBy;
  final String? sortOrder;

  CharacterListQueryForm({
    this.style,
    this.keyword,
    this.pageNum,
    this.pageSize,
    this.sortBy,
    this.sortOrder
  });
}

class CharacterListVO {
  final String? createdAt;
  final String? updatedAt;
  final List<CharacterItem>? characters;
  final int? total;
  final int? page;
  final int? size;

  CharacterListVO({
    this.createdAt,
    this.updatedAt,
    this.characters,
    this.total,
    this.page,
    this.size
  });
}

class PageCharacterListVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<CharacterListVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageCharacterListVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageCharacterListVO {
  final PageCharacterListVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageCharacterListVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceListQueryForm {
  final String? language;
  final String? gender;
  final String? style;
  final String? ageRange;

  VoiceListQueryForm({
    this.language,
    this.gender,
    this.style,
    this.ageRange
  });
}

class PlusApiResultVoiceListVO {
  final VoiceListVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVoiceListVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VoiceItem {
  final String? voiceId;
  final String? name;
  final String? description;
  final String? language;
  final String? gender;
  final String? style;
  final String? previewAudioUrl;

  VoiceItem({
    this.voiceId,
    this.name,
    this.description,
    this.language,
    this.gender,
    this.style,
    this.previewAudioUrl
  });
}

class VoiceListVO {
  final String? createdAt;
  final String? updatedAt;
  final List<VoiceItem>? voices;

  VoiceListVO({
    this.createdAt,
    this.updatedAt,
    this.voices
  });
}

class FileSystemNodeListForm {
  final String? diskId;
  final String? parentId;
  final String? keyword;
  final String? sortField;
  final String? sortOrder;
  final int? pageNum;
  final int? pageSize;

  FileSystemNodeListForm({
    this.diskId,
    this.parentId,
    this.keyword,
    this.sortField,
    this.sortOrder,
    this.pageNum,
    this.pageSize
  });
}

class PageFileSystemNodeVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<FileSystemNodeVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageFileSystemNodeVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageFileSystemNodeVO {
  final PageFileSystemNodeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageFileSystemNodeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FileSystemDiskVO {
  final String? createdAt;
  final String? updatedAt;
  final String? diskId;
  final String? diskUuid;
  final String? name;
  final String? type;
  final String? owner;
  final String? ownerId;
  final int? totalSize;
  final int? usedSize;
  final int? remainingSize;
  final double? usageRate;
  final int? fileCount;
  final String? description;

  FileSystemDiskVO({
    this.createdAt,
    this.updatedAt,
    this.diskId,
    this.diskUuid,
    this.name,
    this.type,
    this.owner,
    this.ownerId,
    this.totalSize,
    this.usedSize,
    this.remainingSize,
    this.usageRate,
    this.fileCount,
    this.description
  });
}

class PlusApiResultListFileSystemDiskVO {
  final List<FileSystemDiskVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFileSystemDiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultFileSystemDiskVO {
  final FileSystemDiskVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFileSystemDiskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListFeedItemVO {
  final List<FeedItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFeedItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FeedListQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? type;
  final String? contentType;
  final String? keyword;
  final int? authorId;
  final int? size;
  final int? page;

  FeedListQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.type,
    this.contentType,
    this.keyword,
    this.authorId,
    this.size,
    this.page
  });
}

class FeedbackQueryForm {
  final String? type;
  final String? status;
  final int? page;
  final int? size;

  FeedbackQueryForm({
    this.type,
    this.status,
    this.page,
    this.size
  });
}

class PageFeedbackVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<FeedbackVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageFeedbackVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageFeedbackVO {
  final PageFeedbackVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageFeedbackVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TutorialQueryForm {
  final String? categoryId;
  final String? keyword;
  final int? page;
  final int? size;

  TutorialQueryForm({
    this.categoryId,
    this.keyword,
    this.page,
    this.size
  });
}

class PageTutorialVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<TutorialVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageTutorialVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageTutorialVO {
  final PageTutorialVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageTutorialVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TutorialVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? description;
  final String? categoryId;
  final String? categoryName;
  final int? viewCount;
  final int? likeCount;
  final String? coverImage;

  TutorialVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.description,
    this.categoryId,
    this.categoryName,
    this.viewCount,
    this.likeCount,
    this.coverImage
  });
}

class PlusApiResultTutorialDetailVO {
  final TutorialDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultTutorialDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TutorialDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? description;
  final String? content;
  final String? categoryId;
  final String? categoryName;
  final int? viewCount;
  final int? likeCount;
  final String? coverImage;

  TutorialDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.description,
    this.content,
    this.categoryId,
    this.categoryName,
    this.viewCount,
    this.likeCount,
    this.coverImage
  });
}

class PlusApiResultSupportInfoVO {
  final SupportInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSupportInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SupportInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? hotline;
  final String? email;
  final String? workingHours;
  final String? wechatQrcode;
  final String? onlineSupportUrl;
  final String? faqUrl;
  final String? helpCenterUrl;

  SupportInfoVO({
    this.createdAt,
    this.updatedAt,
    this.hotline,
    this.email,
    this.workingHours,
    this.wechatQrcode,
    this.onlineSupportUrl,
    this.faqUrl,
    this.helpCenterUrl
  });
}

class SupportMessageQueryForm {
  final String? sessionId;
  final int? page;
  final int? size;

  SupportMessageQueryForm({
    this.sessionId,
    this.page,
    this.size
  });
}

class PageSupportMessageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<SupportMessageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageSupportMessageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageSupportMessageVO {
  final PageSupportMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageSupportMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ReportQueryForm {
  final String? type;
  final String? status;
  final int? page;
  final int? size;

  ReportQueryForm({
    this.type,
    this.status,
    this.page,
    this.size
  });
}

class PageReportVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ReportVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageReportVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageReportVO {
  final PageReportVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageReportVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultReportDetailVO {
  final ReportDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultReportDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ReportDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? targetId;
  final String? content;
  final String? attachmentUrl;
  final String? screenshotUrl;
  final String? status;
  final String? submitTime;
  final String? processTime;
  final String? processResult;

  ReportDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.targetId,
    this.content,
    this.attachmentUrl,
    this.screenshotUrl,
    this.status,
    this.submitTime,
    this.processTime,
    this.processResult
  });
}

class OnboardingStepVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? description;
  final int? order;
  final bool? completed;
  final String? completeTime;

  OnboardingStepVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.description,
    this.order,
    this.completed,
    this.completeTime
  });
}

class PlusApiResultListOnboardingStepVO {
  final List<OnboardingStepVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListOnboardingStepVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FaqQueryForm {
  final String? categoryId;
  final String? keyword;
  final int? page;
  final int? size;

  FaqQueryForm({
    this.categoryId,
    this.keyword,
    this.page,
    this.size
  });
}

class FaqVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? question;
  final String? categoryId;
  final String? categoryName;
  final int? viewCount;
  final int? helpfulCount;

  FaqVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.question,
    this.categoryId,
    this.categoryName,
    this.viewCount,
    this.helpfulCount
  });
}

class PageFaqVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<FaqVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageFaqVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageFaqVO {
  final PageFaqVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageFaqVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FaqDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? question;
  final String? answer;
  final String? categoryId;
  final String? categoryName;
  final int? viewCount;
  final int? helpfulCount;

  FaqDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.question,
    this.answer,
    this.categoryId,
    this.categoryName,
    this.viewCount,
    this.helpfulCount
  });
}

class PlusApiResultFaqDetailVO {
  final FaqDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFaqDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListFaqVO {
  final List<FaqVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFaqVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FaqCategoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? icon;
  final int? sortOrder;
  final int? faqCount;

  FaqCategoryVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.icon,
    this.sortOrder,
    this.faqCount
  });
}

class PlusApiResultListFaqCategoryVO {
  final List<FaqCategoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFaqCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteQueryForm {
  final String? favoriteType;
  final String? type;
  final String? folderId;
  final String? keyword;
  final String? sortField;
  final String? sortDirection;
  final int? page;
  final int? size;

  FavoriteQueryForm({
    this.favoriteType,
    this.type,
    this.folderId,
    this.keyword,
    this.sortField,
    this.sortDirection,
    this.page,
    this.size
  });
}

class PageFavoriteItemVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<FavoriteItemVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageFavoriteItemVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageFavoriteItemVO {
  final PageFavoriteItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageFavoriteItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? favoriteId;
  final String? favoriteType;
  final String? targetId;
  final String? favoriteName;
  final String? favoriteDescription;
  final String? folderId;
  final String? folderName;
  final String? tags;
  final String? favoriteTime;
  final String? updateTime;
  final dynamic? targetInfo;

  FavoriteDetailVO({
    this.createdAt,
    this.updatedAt,
    this.favoriteId,
    this.favoriteType,
    this.targetId,
    this.favoriteName,
    this.favoriteDescription,
    this.folderId,
    this.folderName,
    this.tags,
    this.favoriteTime,
    this.updateTime,
    this.targetInfo
  });
}

class PlusApiResultFavoriteDetailVO {
  final FavoriteDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFavoriteDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalCount;
  final int? folderCount;
  final int? monthlyAdded;
  final String? lastFavoritedTime;
  final Map<String, int>? countByType;

  FavoriteStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalCount,
    this.folderCount,
    this.monthlyAdded,
    this.lastFavoritedTime,
    this.countByType
  });
}

class PlusApiResultFavoriteStatisticsVO {
  final FavoriteStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFavoriteStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListFavoriteItemVO {
  final List<FavoriteItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFavoriteItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListFavoriteFolderVO {
  final List<FavoriteFolderVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFavoriteFolderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FavoriteTypeCountVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final int? count;
  final String? typeName;

  FavoriteTypeCountVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.count,
    this.typeName
  });
}

class PlusApiResultListFavoriteTypeCountVO {
  final List<FavoriteTypeCountVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFavoriteTypeCountVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultFavoriteCheckVO {
  final FavoriteCheckVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFavoriteCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DriveItemListForm {
  final String? keyword;
  final String? assetType;
  final String? folderId;
  final String? diskId;
  final String? sortField;
  final String? sortDirection;
  final int? pageNum;
  final int? pageSize;

  DriveItemListForm({
    this.keyword,
    this.assetType,
    this.folderId,
    this.diskId,
    this.sortField,
    this.sortDirection,
    this.pageNum,
    this.pageSize
  });
}

class PageDriveItemVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<DriveItemVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageDriveItemVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageDriveItemVO {
  final PageDriveItemVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageDriveItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DriveItemDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? itemId;
  final String? itemUuid;
  final String? itemName;
  final String? fileType;
  final bool? directory;
  final String? assetType;
  final String? mimeType;
  final String? extension;
  final int? size;
  final String? parentId;
  final String? path;
  final String? objectKey;
  final String? status;
  final FileMediaResource? resource;
  final ImageMediaResource? coverImage;
  final String? diskId;
  final String? uploadStatus;
  final String? description;
  final String? author;
  final String? versionId;
  final String? referenceFileId;
  final String? workspaceId;
  final String? projectId;
  final String? etag;

  DriveItemDetailVO({
    this.createdAt,
    this.updatedAt,
    this.itemId,
    this.itemUuid,
    this.itemName,
    this.fileType,
    this.directory,
    this.assetType,
    this.mimeType,
    this.extension,
    this.size,
    this.parentId,
    this.path,
    this.objectKey,
    this.status,
    this.resource,
    this.coverImage,
    this.diskId,
    this.uploadStatus,
    this.description,
    this.author,
    this.versionId,
    this.referenceFileId,
    this.workspaceId,
    this.projectId,
    this.etag
  });
}

class PlusApiResultDriveItemDetailVO {
  final DriveItemDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDriveItemDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DocumentListQueryRequest {
  final String? keyword;
  final String? folderId;
  final String? sortField;
  final String? sortOrder;
  final int? pageNum;
  final int? pageSize;

  DocumentListQueryRequest({
    this.keyword,
    this.folderId,
    this.sortField,
    this.sortOrder,
    this.pageNum,
    this.pageSize
  });
}

class DocumentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? documentId;
  final String? documentUuid;
  final String? title;
  final String? folderId;
  final String? assetType;
  final String? mimeType;
  final String? description;
  final List<String>? tags;
  final String? status;
  final String? summary;
  final int? wordCount;
  final int? charCount;

  DocumentVO({
    this.createdAt,
    this.updatedAt,
    this.documentId,
    this.documentUuid,
    this.title,
    this.folderId,
    this.assetType,
    this.mimeType,
    this.description,
    this.tags,
    this.status,
    this.summary,
    this.wordCount,
    this.charCount
  });
}

class PageDocumentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<DocumentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageDocumentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageDocumentVO {
  final PageDocumentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageDocumentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DocumentDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? documentId;
  final String? documentUuid;
  final String? title;
  final String? folderId;
  final String? assetType;
  final String? mimeType;
  final String? description;
  final List<String>? tags;
  final String? status;
  final String? summary;
  final int? wordCount;
  final int? charCount;
  final String? path;
  final String? objectKey;
  final String? versionId;
  final String? contentVersion;
  final String? extension;

  DocumentDetailVO({
    this.createdAt,
    this.updatedAt,
    this.documentId,
    this.documentUuid,
    this.title,
    this.folderId,
    this.assetType,
    this.mimeType,
    this.description,
    this.tags,
    this.status,
    this.summary,
    this.wordCount,
    this.charCount,
    this.path,
    this.objectKey,
    this.versionId,
    this.contentVersion,
    this.extension
  });
}

class PlusApiResultDocumentDetailVO {
  final DocumentDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDocumentDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListTrendingItemVO {
  final List<TrendingItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTrendingItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TrendingItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? description;
  final String? icon;
  final String? cover;
  final String? type;
  final String? url;
  final int? hotScore;
  final double? rating;
  final int? downloads;
  final int? favorites;
  final int? comments;
  final String? author;
  final List<String>? tags;
  final String? price;
  final bool? isFree;
  final String? updateTime;

  TrendingItemVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.icon,
    this.cover,
    this.type,
    this.url,
    this.hotScore,
    this.rating,
    this.downloads,
    this.favorites,
    this.comments,
    this.author,
    this.tags,
    this.price,
    this.isFree,
    this.updateTime
  });
}

class PlusApiResultListTodoItemVO {
  final List<TodoItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTodoItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TodoItemVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? description;
  final String? status;
  final String? priority;
  final String? dueDate;
  final String? createTime;
  final String? updateTime;
  final String? completedAt;
  final String? creator;
  final String? assignee;
  final String? resourceId;
  final String? resourceType;
  final List<String>? tags;
  final int? progress;
  final String? reminderTime;

  TodoItemVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.description,
    this.status,
    this.priority,
    this.dueDate,
    this.createTime,
    this.updateTime,
    this.completedAt,
    this.creator,
    this.assignee,
    this.resourceId,
    this.resourceType,
    this.tags,
    this.progress,
    this.reminderTime
  });
}

class AchievementStatisticsVO {
  final int? totalAchievements;
  final int? unlockedAchievements;
  final double? completionRate;
  final int? totalPoints;
  final List<AchievementVO>? recentAchievements;

  AchievementStatisticsVO({
    this.totalAchievements,
    this.unlockedAchievements,
    this.completionRate,
    this.totalPoints,
    this.recentAchievements
  });
}

class AchievementVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? description;
  final String? icon;
  final String? level;
  final String? status;
  final String? unlockedAt;
  final int? progress;
  final int? target;
  final String? type;
  final int? points;
  final int? sort;

  AchievementVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.icon,
    this.level,
    this.status,
    this.unlockedAt,
    this.progress,
    this.target,
    this.type,
    this.points,
    this.sort
  });
}

class GenerationStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? todayCount;
  final int? weekCount;
  final int? monthCount;
  final int? totalCount;
  final int? avgGenerationTime;
  final int? maxGenerationTime;
  final int? minGenerationTime;
  final double? successRate;
  final String? mostUsedModel;
  final GenerationTypeDistributionVO? typeDistribution;

  GenerationStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.todayCount,
    this.weekCount,
    this.monthCount,
    this.totalCount,
    this.avgGenerationTime,
    this.maxGenerationTime,
    this.minGenerationTime,
    this.successRate,
    this.mostUsedModel,
    this.typeDistribution
  });
}

class GenerationTypeDistributionVO {
  final double? text;
  final double? image;
  final double? audio;
  final double? video;
  final double? code;

  GenerationTypeDistributionVO({
    this.text,
    this.image,
    this.audio,
    this.video,
    this.code
  });
}

class PlusApiResultUserStatisticsVO {
  final UserStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PrivilegeVO {
  final String? privilegeId;
  final String? name;
  final String? description;
  final String? icon;
  final String? type;
  final String? status;

  PrivilegeVO({
    this.privilegeId,
    this.name,
    this.description,
    this.icon,
    this.type,
    this.status
  });
}

class UsageFrequencyVO {
  final int? monday;
  final int? tuesday;
  final int? wednesday;
  final int? thursday;
  final int? friday;
  final int? saturday;
  final int? sunday;

  UsageFrequencyVO({
    this.monday,
    this.tuesday,
    this.wednesday,
    this.thursday,
    this.friday,
    this.saturday,
    this.sunday
  });
}

class UsageStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? todayUsage;
  final int? weekUsage;
  final int? monthUsage;
  final int? totalUsage;
  final double? avgDailyUsage;
  final int? maxDailyUsage;
  final UsageFrequencyVO? frequency;
  final UsageTimeDistributionVO? timeDistribution;

  UsageStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.todayUsage,
    this.weekUsage,
    this.monthUsage,
    this.totalUsage,
    this.avgDailyUsage,
    this.maxDailyUsage,
    this.frequency,
    this.timeDistribution
  });
}

class UsageTimeDistributionVO {
  final int? midnight;
  final int? morning;
  final int? afternoon;
  final int? evening;

  UsageTimeDistributionVO({
    this.midnight,
    this.morning,
    this.afternoon,
    this.evening
  });
}

class UserLevelVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? icon;
  final String? description;
  final int? level;
  final int? currentExp;
  final int? requiredExp;
  final double? expProgress;
  final List<PrivilegeVO>? privileges;
  final String? validUntil;
  final String? status;

  UserLevelVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.icon,
    this.description,
    this.level,
    this.currentExp,
    this.requiredExp,
    this.expProgress,
    this.privileges,
    this.validUntil,
    this.status
  });
}

class UserStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? userId;
  final String? username;
  final String? avatar;
  final String? registeredAt;
  final String? lastLoginAt;
  final int? loginCount;
  final int? totalUsageTime;
  final int? totalGenerations;
  final int? totalProjects;
  final int? totalFiles;
  final int? totalStorage;
  final UserLevelVO? level;
  final VipStatisticsVO? vipInfo;
  final AchievementStatisticsVO? achievementStats;
  final UsageStatisticsVO? usageStats;
  final GenerationStatisticsVO? generationStats;

  UserStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.userId,
    this.username,
    this.avatar,
    this.registeredAt,
    this.lastLoginAt,
    this.loginCount,
    this.totalUsageTime,
    this.totalGenerations,
    this.totalProjects,
    this.totalFiles,
    this.totalStorage,
    this.level,
    this.vipInfo,
    this.achievementStats,
    this.usageStats,
    this.generationStats
  });
}

class VipPrivilegeVO {
  final String? id;
  final String? name;
  final String? description;
  final String? icon;
  final String? status;
  final String? type;

  VipPrivilegeVO({
    this.id,
    this.name,
    this.description,
    this.icon,
    this.status,
    this.type
  });
}

class VipRenewalVO {
  final String? price;
  final String? period;
  final String? renewalUrl;
  final bool? autoRenew;

  VipRenewalVO({
    this.price,
    this.period,
    this.renewalUrl,
    this.autoRenew
  });
}

class VipStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? status;
  final String? level;
  final String? startedAt;
  final String? expiredAt;
  final int? remainingDays;
  final int? totalDays;
  final List<VipPrivilegeVO>? privileges;
  final VipRenewalVO? renewalInfo;
  final VipUpgradeVO? upgradeInfo;

  VipStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.status,
    this.level,
    this.startedAt,
    this.expiredAt,
    this.remainingDays,
    this.totalDays,
    this.privileges,
    this.renewalInfo,
    this.upgradeInfo
  });
}

class VipUpgradeVO {
  final String? price;
  final String? targetLevel;
  final String? upgradeUrl;
  final String? discount;

  VipUpgradeVO({
    this.price,
    this.targetLevel,
    this.upgradeUrl,
    this.discount
  });
}

class PlusApiResultVipStatisticsVO {
  final VipStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVipStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUsageStatisticsVO {
  final UsageStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUsageStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultStorageStatisticsVO {
  final StorageStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultStorageStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class StorageStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalStorage;
  final int? usedStorage;
  final int? remainingStorage;
  final double? usageRate;
  final StorageTypeDistributionVO? typeDistribution;
  final StorageTrendVO? trend;

  StorageStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalStorage,
    this.usedStorage,
    this.remainingStorage,
    this.usageRate,
    this.typeDistribution,
    this.trend
  });
}

class StorageTrendVO {
  final int? last7Days;
  final int? last30Days;
  final int? last90Days;
  final int? avgDailyGrowth;

  StorageTrendVO({
    this.last7Days,
    this.last30Days,
    this.last90Days,
    this.avgDailyGrowth
  });
}

class StorageTypeDistributionVO {
  final double? text;
  final double? image;
  final double? audio;
  final double? video;
  final double? other;

  StorageTypeDistributionVO({
    this.text,
    this.image,
    this.audio,
    this.video,
    this.other
  });
}

class PlusApiResultGenerationStatisticsVO {
  final GenerationStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultGenerationStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListShortcutVO {
  final List<ShortcutVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListShortcutVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShortcutVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? icon;
  final String? url;
  final String? type;
  final int? sort;
  final String? group;
  final String? description;
  final bool? isDefault;
  final bool? enabled;
  final int? usageCount;
  final String? lastUsedAt;

  ShortcutVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.icon,
    this.url,
    this.type,
    this.sort,
    this.group,
    this.description,
    this.isDefault,
    this.enabled,
    this.usageCount,
    this.lastUsedAt
  });
}

class PlusApiResultListRecommendationVO {
  final List<RecommendationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListRecommendationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RecommendationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? title;
  final String? description;
  final String? icon;
  final String? image;
  final String? url;
  final double? rating;
  final int? hotScore;
  final String? reason;
  final List<String>? scenarios;
  final List<String>? tags;
  final bool? isFree;
  final String? price;
  final int? priority;

  RecommendationVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.title,
    this.description,
    this.icon,
    this.image,
    this.url,
    this.rating,
    this.hotScore,
    this.reason,
    this.scenarios,
    this.tags,
    this.isFree,
    this.price,
    this.priority
  });
}

class PlusApiResultUserLevelVO {
  final UserLevelVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserLevelVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChartConfigVO {
  final bool? showLegend;
  final bool? showTooltip;
  final bool? responsive;
  final int? height;

  ChartConfigVO({
    this.showLegend,
    this.showTooltip,
    this.responsive,
    this.height
  });
}

class ChartDataVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? title;
  final List<String>? labels;
  final List<DatasetVO>? datasets;
  final ChartConfigVO? config;

  ChartDataVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.title,
    this.labels,
    this.datasets,
    this.config
  });
}

class DailyUsageVO {
  final int? generationCount;
  final int? usageTime;
  final int? storageUsage;

  DailyUsageVO({
    this.generationCount,
    this.usageTime,
    this.storageUsage
  });
}

class DatasetVO {
  final String? label;
  final List<dynamic>? data;
  final List<String>? backgroundColor;
  final List<String>? borderColor;
  final int? borderWidth;

  DatasetVO({
    this.label,
    this.data,
    this.backgroundColor,
    this.borderColor,
    this.borderWidth
  });
}

class HomeDashboardVO {
  final String? createdAt;
  final String? updatedAt;
  final UserInfoVO? userInfo;
  final StatisticsVO? statistics;
  final List<ShortcutVO>? shortcuts;
  final List<RecentActivityVO>? recentActivities;
  final List<RecentProjectVO>? recentProjects;
  final List<TodoItemVO>? todoItems;
  final List<RecommendationVO>? recommendations;
  final List<TrendingItemVO>? trendingItems;
  final List<AchievementVO>? achievements;
  final List<PopupNotificationVO>? notifications;
  final List<ChartDataVO>? chartData;

  HomeDashboardVO({
    this.createdAt,
    this.updatedAt,
    this.userInfo,
    this.statistics,
    this.shortcuts,
    this.recentActivities,
    this.recentProjects,
    this.todoItems,
    this.recommendations,
    this.trendingItems,
    this.achievements,
    this.notifications,
    this.chartData
  });
}

class NotificationButtonVO {
  final String? text;
  final String? type;
  final String? url;
  final String? action;
  final bool? closeOnClick;

  NotificationButtonVO({
    this.text,
    this.type,
    this.url,
    this.action,
    this.closeOnClick
  });
}

class PlusApiResultHomeDashboardVO {
  final HomeDashboardVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultHomeDashboardVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PopupNotificationVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? content;
  final String? type;
  final String? icon;
  final String? image;
  final String? url;
  final List<NotificationButtonVO>? buttons;
  final bool? needConfirm;
  final bool? closable;
  final int? duration;
  final int? priority;

  PopupNotificationVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.content,
    this.type,
    this.icon,
    this.image,
    this.url,
    this.buttons,
    this.needConfirm,
    this.closable,
    this.duration,
    this.priority
  });
}

class RecentActivityVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? type;
  final String? title;
  final String? description;
  final String? icon;
  final String? url;
  final String? status;
  final String? resourceId;
  final String? resourceType;
  final String? creator;
  final String? createTime;
  final bool? read;
  final int? priority;

  RecentActivityVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.type,
    this.title,
    this.description,
    this.icon,
    this.url,
    this.status,
    this.resourceId,
    this.resourceType,
    this.creator,
    this.createTime,
    this.read,
    this.priority
  });
}

class RecentProjectVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? description;
  final String? icon;
  final String? cover;
  final String? type;
  final String? status;
  final String? url;
  final String? createTime;
  final String? updateTime;
  final int? memberCount;
  final int? fileCount;
  final int? size;
  final List<String>? tags;
  final bool? isPublic;
  final bool? isFavorite;

  RecentProjectVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.icon,
    this.cover,
    this.type,
    this.status,
    this.url,
    this.createTime,
    this.updateTime,
    this.memberCount,
    this.fileCount,
    this.size,
    this.tags,
    this.isPublic,
    this.isFavorite
  });
}

class StatisticsVO {
  final int? totalProjects;
  final int? totalGenerations;
  final int? totalUsageTime;
  final StorageStatisticsVO? storage;
  final DailyUsageVO? dailyUsage;

  StatisticsVO({
    this.totalProjects,
    this.totalGenerations,
    this.totalUsageTime,
    this.storage,
    this.dailyUsage
  });
}

class PlusApiResultChartDataVO {
  final ChartDataVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultChartDataVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListRecentActivityVO {
  final List<RecentActivityVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListRecentActivityVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListAchievementVO {
  final List<AchievementVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListAchievementVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CurrencyTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? name;

  CurrencyTypeVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.name
  });
}

class PlusApiResultListCurrencyTypeVO {
  final List<CurrencyTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCurrencyTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListExchangeRateVO {
  final List<ExchangeRateVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListExchangeRateVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageCurrencyVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<CurrencyVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageCurrencyVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageCurrencyVO {
  final PageCurrencyVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageCurrencyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListCurrencyVO {
  final List<CurrencyVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCurrencyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CouponListForm {
  final String? type;
  final String? status;
  final String? keyword;
  final int? pageNum;
  final int? pageSize;

  CouponListForm({
    this.type,
    this.status,
    this.keyword,
    this.pageNum,
    this.pageSize
  });
}

class CouponVO {
  final String? createdAt;
  final String? updatedAt;
  final String? couponId;
  final String? name;
  final String? type;
  final String? typeName;
  final String? description;
  final int? amount;
  final double? discount;
  final int? minConsume;
  final String? startTime;
  final String? endTime;
  final int? total;
  final int? getLimit;
  final int? receivedCount;
  final int? usedCount;
  final String? status;
  final String? statusName;
  final bool? stackable;
  final int? scopeType;
  final String? scopeValue;
  final int? remainingCount;
  final bool? canReceive;

  CouponVO({
    this.createdAt,
    this.updatedAt,
    this.couponId,
    this.name,
    this.type,
    this.typeName,
    this.description,
    this.amount,
    this.discount,
    this.minConsume,
    this.startTime,
    this.endTime,
    this.total,
    this.getLimit,
    this.receivedCount,
    this.usedCount,
    this.status,
    this.statusName,
    this.stackable,
    this.scopeType,
    this.scopeValue,
    this.remainingCount,
    this.canReceive
  });
}

class PageCouponVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<CouponVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageCouponVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageCouponVO {
  final PageCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultCouponVO {
  final CouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CouponStatisticsVO {
  final int? totalCoupons;
  final int? unusedCount;
  final int? usedCount;
  final int? expiredCount;

  CouponStatisticsVO({
    this.totalCoupons,
    this.unusedCount,
    this.usedCount,
    this.expiredCount
  });
}

class PlusApiResultCouponStatisticsVO {
  final CouponStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCouponStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserCouponListForm {
  final String? status;
  final String? type;
  final int? pageNum;
  final int? pageSize;

  UserCouponListForm({
    this.status,
    this.type,
    this.pageNum,
    this.pageSize
  });
}

class PageUserCouponVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<UserCouponVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageUserCouponVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageUserCouponVO {
  final PageUserCouponVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageUserCouponVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CommentDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? commentId;
  final String? content;
  final String? contentType;
  final int? contentId;
  final int? userId;
  final String? status;
  final int? likes;
  final int? replyCount;
  final bool? isTop;
  final int? parentId;
  final String? ipAddress;
  final String? deviceInfo;
  final List<CommentVO>? replies;

  CommentDetailVO({
    this.createdAt,
    this.updatedAt,
    this.commentId,
    this.content,
    this.contentType,
    this.contentId,
    this.userId,
    this.status,
    this.likes,
    this.replyCount,
    this.isTop,
    this.parentId,
    this.ipAddress,
    this.deviceInfo,
    this.replies
  });
}

class PlusApiResultCommentDetailVO {
  final CommentDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCommentDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageCommentVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<CommentVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageCommentVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageCommentVO {
  final PageCommentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageCommentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CommentStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalComments;

  CommentStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalComments
  });
}

class PlusApiResultCommentStatisticsVO {
  final CommentStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCommentStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CollectionDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? collectionId;
  final String? name;
  final String? description;
  final String? type;
  final String? coverImage;
  final bool? isPublic;
  final bool? isPinned;
  final int? itemCount;
  final int? viewCount;
  final int? favoriteCount;
  final int? parentId;
  final List<CollectionItemVO>? items;

  CollectionDetailVO({
    this.createdAt,
    this.updatedAt,
    this.collectionId,
    this.name,
    this.description,
    this.type,
    this.coverImage,
    this.isPublic,
    this.isPinned,
    this.itemCount,
    this.viewCount,
    this.favoriteCount,
    this.parentId,
    this.items
  });
}

class PlusApiResultCollectionDetailVO {
  final CollectionDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCollectionDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListCollectionVO {
  final List<CollectionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCollectionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListCollectionItemVO {
  final List<CollectionItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCollectionItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CollectionTreeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? collectionId;
  final String? name;
  final String? type;
  final int? itemCount;
  final int? parentId;

  CollectionTreeVO({
    this.createdAt,
    this.updatedAt,
    this.collectionId,
    this.name,
    this.type,
    this.itemCount,
    this.parentId
  });
}

class PlusApiResultListCollectionTreeVO {
  final List<CollectionTreeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCollectionTreeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageCollectionVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<CollectionVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageCollectionVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageCollectionVO {
  final PageCollectionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageCollectionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatSessionQueryForm {
  final int? sessionId;
  final String? name;
  final String? type;
  final int? page;
  final int? size;
  final String? sortBy;
  final String? sortDirection;
  final bool? includeMessageCount;

  ChatSessionQueryForm({
    this.sessionId,
    this.name,
    this.type,
    this.page,
    this.size,
    this.sortBy,
    this.sortDirection,
    this.includeMessageCount
  });
}

class PageChatSessionVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ChatSessionVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageChatSessionVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageChatSessionVO {
  final PageChatSessionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageChatSessionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChatSessionDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? description;
  final String? type;
  final String? status;
  final String? userId;
  final String? modelId;
  final String? systemPrompt;
  final double? temperature;
  final int? maxTokens;
  final double? topP;
  final int? messageCount;
  final int? unreadCount;
  final String? lastMessageTime;
  final String? lastMessageContent;
  final String? resourceId;
  final String? resourceType;
  final String? createTime;
  final String? updateTime;
  final Map<String, dynamic>? extra;
  final SessionStatsVO? stats;

  ChatSessionDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.type,
    this.status,
    this.userId,
    this.modelId,
    this.systemPrompt,
    this.temperature,
    this.maxTokens,
    this.topP,
    this.messageCount,
    this.unreadCount,
    this.lastMessageTime,
    this.lastMessageContent,
    this.resourceId,
    this.resourceType,
    this.createTime,
    this.updateTime,
    this.extra,
    this.stats
  });
}

class PlusApiResultChatSessionDetailVO {
  final ChatSessionDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultChatSessionDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SessionStatsVO {
  final int? totalMessages;
  final int? userMessages;
  final int? aiMessages;
  final int? totalTokens;
  final int? avgResponseTime;
  final int? totalDuration;

  SessionStatsVO({
    this.totalMessages,
    this.userMessages,
    this.aiMessages,
    this.totalTokens,
    this.avgResponseTime,
    this.totalDuration
  });
}

class ChatMessageQueryForm {
  final int? sessionId;
  final int? messageId;
  final int? page;
  final int? size;
  final String? sort;

  ChatMessageQueryForm({
    this.sessionId,
    this.messageId,
    this.page,
    this.size,
    this.sort
  });
}

class PageChatMessageVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ChatMessageVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageChatMessageVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageChatMessageVO {
  final PageChatMessageVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageChatMessageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CharacterDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? characterId;
  final String? name;
  final String? type;
  final String? description;
  final ImageMediaResource? avatar;
  final ImageMediaResource? threeViewImage;
  final ImageMediaResource? gridShotsImage;
  final VideoMediaResource? avatarVideo;
  final String? status;
  final int? agentId;
  final String? personality;
  final String? background;
  final String? interactionSettings;
  final String? version;
  final bool? isPublic;
  final int? usageCount;
  final int? likeCount;
  final String? lastUsedAt;

  CharacterDetailVO({
    this.createdAt,
    this.updatedAt,
    this.characterId,
    this.name,
    this.type,
    this.description,
    this.avatar,
    this.threeViewImage,
    this.gridShotsImage,
    this.avatarVideo,
    this.status,
    this.agentId,
    this.personality,
    this.background,
    this.interactionSettings,
    this.version,
    this.isPublic,
    this.usageCount,
    this.likeCount,
    this.lastUsedAt
  });
}

class PlusApiResultCharacterDetailVO {
  final CharacterDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCharacterDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageCharacterVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<CharacterVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageCharacterVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageCharacterVO {
  final PageCharacterVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageCharacterVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListCategoryVO {
  final List<CategoryVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCategoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CategoryDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? code;
  final String? icon;
  final String? description;
  final int? parentId;
  final String? parentName;
  final int? sort;
  final int? status;
  final String? type;
  final String? groupName;
  final int? visible;

  CategoryDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.code,
    this.icon,
    this.description,
    this.parentId,
    this.parentName,
    this.sort,
    this.status,
    this.type,
    this.groupName,
    this.visible
  });
}

class PlusApiResultCategoryDetailVO {
  final CategoryDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCategoryDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CategoryTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? type;
  final String? name;
  final String? description;

  CategoryTypeVO({
    this.createdAt,
    this.updatedAt,
    this.type,
    this.name,
    this.description
  });
}

class PlusApiResultListCategoryTypeVO {
  final List<CategoryTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCategoryTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CategoryTreeVO {
  final String? createdAt;
  final String? updatedAt;
  final int? id;
  final String? name;
  final String? code;
  final String? icon;
  final int? parentId;
  final int? sort;
  final int? status;
  final List<CategoryTreeVO>? children;

  CategoryTreeVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.code,
    this.icon,
    this.parentId,
    this.sort,
    this.status,
    this.children
  });
}

class PlusApiResultListCategoryTreeVO {
  final List<CategoryTreeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCategoryTreeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListTagVO {
  final List<TagVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTagVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CartGroupVO {
  final String? createdAt;
  final String? updatedAt;
  final String? uuid;
  final String? name;
  final List<CartItemVO>? items;
  final int? totalQuantity;
  final double? totalPrice;

  CartGroupVO({
    this.createdAt,
    this.updatedAt,
    this.uuid,
    this.name,
    this.items,
    this.totalQuantity,
    this.totalPrice
  });
}

class PlusApiResultShoppingCartVO {
  final ShoppingCartVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultShoppingCartVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ShoppingCartVO {
  final String? createdAt;
  final String? updatedAt;
  final String? cartId;
  final String? uuid;
  final String? name;
  final String? description;
  final String? owner;
  final int? ownerId;
  final String? status;
  final List<CartGroupVO>? groups;
  final int? totalQuantity;
  final double? totalPrice;
  final int? selectedQuantity;
  final double? selectedPrice;

  ShoppingCartVO({
    this.createdAt,
    this.updatedAt,
    this.cartId,
    this.uuid,
    this.name,
    this.description,
    this.owner,
    this.ownerId,
    this.status,
    this.groups,
    this.totalQuantity,
    this.totalPrice,
    this.selectedQuantity,
    this.selectedPrice
  });
}

class CartStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? cartId;
  final int? itemCount;
  final int? totalQuantity;
  final double? totalPrice;
  final int? selectedItemCount;
  final int? selectedQuantity;
  final double? selectedPrice;

  CartStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.cartId,
    this.itemCount,
    this.totalQuantity,
    this.totalPrice,
    this.selectedItemCount,
    this.selectedQuantity,
    this.selectedPrice
  });
}

class PlusApiResultCartStatisticsVO {
  final CartStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCartStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListCartItemVO {
  final List<CartItemVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCartItemVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultQrCodeStatusVO {
  final QrCodeStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultQrCodeStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class QrCodeStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final String? status;
  final UserInfoVO? userInfo;
  final LoginVO? token;

  QrCodeStatusVO({
    this.createdAt,
    this.updatedAt,
    this.status,
    this.userInfo,
    this.token
  });
}

class PlusApiResultListSensitiveWordListVO {
  final List<SensitiveWordListVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListSensitiveWordListVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SensitiveWordListVO {
  final String? createdAt;
  final String? updatedAt;
  final String? listId;
  final String? name;
  final String? description;
  final String? type;
  final int? wordCount;
  final List<String>? categories;
  final String? version;
  final bool? enabled;

  SensitiveWordListVO({
    this.createdAt,
    this.updatedAt,
    this.listId,
    this.name,
    this.description,
    this.type,
    this.wordCount,
    this.categories,
    this.version,
    this.enabled
  });
}

class FrameDetection {
  final int? timestamp;
  final String? result;
  final String? riskLevel;

  FrameDetection({
    this.timestamp,
    this.result,
    this.riskLevel
  });
}

class PlusApiResultVideoAuditStatusVO {
  final VideoAuditStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultVideoAuditStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class VideoAuditStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? status;
  final int? progress;
  final int? processedDuration;
  final int? totalDuration;
  final List<FrameDetection>? detections;
  final String? estimatedCompleteTime;

  VideoAuditStatusVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.status,
    this.progress,
    this.processedDuration,
    this.totalDuration,
    this.detections,
    this.estimatedCompleteTime
  });
}

class AuditRecordQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? contentType;
  final String? result;
  final String? riskLevel;
  final String? startDate;
  final String? endDate;
  final List<String>? checkTypes;
  final String? keyword;
  final int? size;
  final int? page;

  AuditRecordQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.contentType,
    this.result,
    this.riskLevel,
    this.startDate,
    this.endDate,
    this.checkTypes,
    this.keyword,
    this.size,
    this.page
  });
}

class AuditRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final String? recordId;
  final String? contentId;
  final String? contentType;
  final String? contentPreview;
  final String? result;
  final String? riskLevel;
  final List<String>? checkTypes;
  final List<String>? violationTypes;
  final String? auditTime;
  final int? processTime;

  AuditRecordVO({
    this.createdAt,
    this.updatedAt,
    this.recordId,
    this.contentId,
    this.contentType,
    this.contentPreview,
    this.result,
    this.riskLevel,
    this.checkTypes,
    this.violationTypes,
    this.auditTime,
    this.processTime
  });
}

class PageAuditRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<AuditRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageAuditRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageAuditRecordVO {
  final PageAuditRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageAuditRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AuditRecordDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? recordId;
  final String? contentId;
  final String? contentType;
  final String? originalContent;
  final String? processedContent;
  final String? userId;
  final String? result;
  final String? riskLevel;
  final double? confidence;
  final List<DetectionResult>? detectionResults;
  final List<String>? checkTypes;
  final String? scene;
  final Map<String, dynamic>? deviceInfo;
  final String? ipAddress;
  final String? location;
  final String? auditTime;
  final int? processTime;
  final bool? hasAppeal;

  AuditRecordDetailVO({
    this.createdAt,
    this.updatedAt,
    this.recordId,
    this.contentId,
    this.contentType,
    this.originalContent,
    this.processedContent,
    this.userId,
    this.result,
    this.riskLevel,
    this.confidence,
    this.detectionResults,
    this.checkTypes,
    this.scene,
    this.deviceInfo,
    this.ipAddress,
    this.location,
    this.auditTime,
    this.processTime,
    this.hasAppeal
  });
}

class DetectionResult {
  final String? type;
  final bool? hit;
  final double? confidence;
  final List<String>? keywords;

  DetectionResult({
    this.type,
    this.hit,
    this.confidence,
    this.keywords
  });
}

class PlusApiResultAuditRecordDetailVO {
  final AuditRecordDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAuditRecordDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AuditPolicyVO {
  final String? createdAt;
  final String? updatedAt;
  final String? policyId;
  final String? name;
  final String? description;
  final List<String>? scenes;
  final List<DetectionTypeConfig>? detectionTypes;
  final Map<String, double>? thresholds;
  final bool? enabled;
  final int? priority;

  AuditPolicyVO({
    this.createdAt,
    this.updatedAt,
    this.policyId,
    this.name,
    this.description,
    this.scenes,
    this.detectionTypes,
    this.thresholds,
    this.enabled,
    this.priority
  });
}

class DetectionTypeConfig {
  final String? type;
  final String? name;
  final bool? enabled;
  final String? sensitivity;
  final double? threshold;

  DetectionTypeConfig({
    this.type,
    this.name,
    this.enabled,
    this.sensitivity,
    this.threshold
  });
}

class PlusApiResultListAuditPolicyVO {
  final List<AuditPolicyVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListAuditPolicyVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class MyAuditRecordQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? contentType;
  final String? result;
  final String? startDate;
  final String? endDate;
  final int? size;
  final int? page;

  MyAuditRecordQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.contentType,
    this.result,
    this.startDate,
    this.endDate,
    this.size,
    this.page
  });
}

class PageAuditAppealVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<AuditAppealVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageAuditAppealVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageAuditAppealVO {
  final PageAuditAppealVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageAuditAppealVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AuditAppealStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final String? appealId;
  final String? recordId;
  final String? currentStatus;
  final String? statusDescription;
  final int? progress;
  final String? estimatedCompleteTime;
  final String? result;
  final bool? canAddEvidence;
  final bool? canCancel;

  AuditAppealStatusVO({
    this.createdAt,
    this.updatedAt,
    this.appealId,
    this.recordId,
    this.currentStatus,
    this.statusDescription,
    this.progress,
    this.estimatedCompleteTime,
    this.result,
    this.canAddEvidence,
    this.canCancel
  });
}

class PlusApiResultAuditAppealStatusVO {
  final AuditAppealStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAuditAppealStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AssetListForm {
  final String? type;
  final String? folderId;
  final String? keyword;
  final String? sortField;
  final String? sortDirection;
  final int? pageNum;
  final int? pageSize;

  AssetListForm({
    this.type,
    this.folderId,
    this.keyword,
    this.sortField,
    this.sortDirection,
    this.pageNum,
    this.pageSize
  });
}

class AssetVO {
  final String? createdAt;
  final String? updatedAt;
  final String? assetId;
  final String? assetName;
  final String? assetType;
  final String? fileType;
  final String? mimeType;
  final int? size;
  final String? description;
  final List<String>? tags;
  final String? folderId;
  final String? status;
  final ImageMediaResource? coverImage;
  final List<AssetMediaResource>? assets;
  final String? primaryUrl;
  final String? thumbnailUrl;

  AssetVO({
    this.createdAt,
    this.updatedAt,
    this.assetId,
    this.assetName,
    this.assetType,
    this.fileType,
    this.mimeType,
    this.size,
    this.description,
    this.tags,
    this.folderId,
    this.status,
    this.coverImage,
    this.assets,
    this.primaryUrl,
    this.thumbnailUrl
  });
}

class PageAssetVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<AssetVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageAssetVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageAssetVO {
  final PageAssetVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageAssetVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AssetDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? assetId;
  final String? assetName;
  final String? assetType;
  final String? fileType;
  final String? fileTypeName;
  final String? mimeType;
  final int? size;
  final String? description;
  final List<String>? tags;
  final String? folderId;
  final String? status;
  final String? statusName;
  final ImageMediaResource? coverImage;
  final List<AssetMediaResource>? assets;
  final String? primaryUrl;
  final String? thumbnailUrl;
  final String? diskId;
  final String? path;
  final String? versionId;
  final int? downloadCount;
  final bool? favorited;
  final String? author;
  final String? extension;

  AssetDetailVO({
    this.createdAt,
    this.updatedAt,
    this.assetId,
    this.assetName,
    this.assetType,
    this.fileType,
    this.fileTypeName,
    this.mimeType,
    this.size,
    this.description,
    this.tags,
    this.folderId,
    this.status,
    this.statusName,
    this.coverImage,
    this.assets,
    this.primaryUrl,
    this.thumbnailUrl,
    this.diskId,
    this.path,
    this.versionId,
    this.downloadCount,
    this.favorited,
    this.author,
    this.extension
  });
}

class PlusApiResultAssetDetailVO {
  final AssetDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAssetDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AssetDownloadForm {
  final String? format;

  AssetDownloadForm({
    this.format
  });
}

class DownloadUrlVO {
  final String? createdAt;
  final String? updatedAt;
  final AssetMediaResource? resource;
  final int? expiresIn;

  DownloadUrlVO({
    this.createdAt,
    this.updatedAt,
    this.resource,
    this.expiresIn
  });
}

class PlusApiResultDownloadUrlVO {
  final DownloadUrlVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDownloadUrlVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AssetStatisticsVO {
  final int? totalAssets;
  final int? imageCount;
  final int? videoCount;
  final int? audioCount;

  AssetStatisticsVO({
    this.totalAssets,
    this.imageCount,
    this.videoCount,
    this.audioCount
  });
}

class PlusApiResultAssetStatisticsVO {
  final AssetStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAssetStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListFolderVO {
  final List<FolderVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFolderVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AppDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? appId;
  final String? name;
  final String? description;
  final ImageMediaResource? icon;
  final String? iconUrl;
  final String? accessUrl;
  final String? version;
  final String? appType;
  final String? status;
  final int? projectId;
  final AppPlatforms? platforms;
  final String? packageName;
  final String? bundleId;
  final String? storeUrl;
  final String? downloadUrl;

  AppDetailVO({
    this.createdAt,
    this.updatedAt,
    this.appId,
    this.name,
    this.description,
    this.icon,
    this.iconUrl,
    this.accessUrl,
    this.version,
    this.appType,
    this.status,
    this.projectId,
    this.platforms,
    this.packageName,
    this.bundleId,
    this.storeUrl,
    this.downloadUrl
  });
}

class AppPlatforms {
  final List<String>? platforms;

  AppPlatforms({
    this.platforms
  });
}

class PlusApiResultAppDetailVO {
  final AppDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AppStatisticsVO {
  final String? createdAt;
  final String? updatedAt;
  final int? totalApps;

  AppStatisticsVO({
    this.createdAt,
    this.updatedAt,
    this.totalApps
  });
}

class PlusApiResultAppStatisticsVO {
  final AppStatisticsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAppStatisticsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PageAppVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<AppVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageAppVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageAppVO {
  final PageAppVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageAppVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AnnouncementQueryForm {
  final String? type;
  final String? status;
  final int? pageSize;
  final int? pageNum;

  AnnouncementQueryForm({
    this.type,
    this.status,
    this.pageSize,
    this.pageNum
  });
}

class AnnouncementVO {
  final String? createdAt;
  final String? updatedAt;
  final String? announcementId;
  final String? title;
  final String? type;
  final String? status;
  final String? publishTime;
  final String? expireTime;
  final int? viewCount;
  final bool? isTop;
  final String? coverImage;

  AnnouncementVO({
    this.createdAt,
    this.updatedAt,
    this.announcementId,
    this.title,
    this.type,
    this.status,
    this.publishTime,
    this.expireTime,
    this.viewCount,
    this.isTop,
    this.coverImage
  });
}

class PageAnnouncementVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<AnnouncementVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageAnnouncementVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageAnnouncementVO {
  final PageAnnouncementVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageAnnouncementVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AnnouncementDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? announcementId;
  final String? title;
  final String? content;
  final String? type;
  final String? status;
  final String? author;
  final String? publishTime;
  final String? expireTime;
  final int? viewCount;
  final bool? isTop;
  final String? coverImage;

  AnnouncementDetailVO({
    this.createdAt,
    this.updatedAt,
    this.announcementId,
    this.title,
    this.content,
    this.type,
    this.status,
    this.author,
    this.publishTime,
    this.expireTime,
    this.viewCount,
    this.isTop,
    this.coverImage
  });
}

class PlusApiResultAnnouncementDetailVO {
  final AnnouncementDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAnnouncementDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUpdateCheckVO {
  final UpdateCheckVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUpdateCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UpdateCheckVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? hasUpdate;
  final String? latestVersion;
  final String? currentVersion;
  final String? downloadUrl;
  final String? updateType;
  final String? title;
  final String? description;
  final int? fileSize;
  final bool? forceUpdate;

  UpdateCheckVO({
    this.createdAt,
    this.updatedAt,
    this.hasUpdate,
    this.latestVersion,
    this.currentVersion,
    this.downloadUrl,
    this.updateType,
    this.title,
    this.description,
    this.fileSize,
    this.forceUpdate
  });
}

class ChangelogVO {
  final String? createdAt;
  final String? updatedAt;
  final String? version;
  final String? releaseDate;
  final String? title;
  final List<String>? features;
  final List<String>? bugFixes;
  final List<String>? improvements;
  final String? status;
  final String? downloadUrl;

  ChangelogVO({
    this.createdAt,
    this.updatedAt,
    this.version,
    this.releaseDate,
    this.title,
    this.features,
    this.bugFixes,
    this.improvements,
    this.status,
    this.downloadUrl
  });
}

class PlusApiResultListChangelogVO {
  final List<ChangelogVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListChangelogVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListAnnouncementVO {
  final List<AnnouncementVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListAnnouncementVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultSystemStatusVO {
  final SystemStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSystemStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ServiceStatus {
  final String? api;
  final String? database;
  final String? cache;
  final String? storage;
  final String? thirdParty;

  ServiceStatus({
    this.api,
    this.database,
    this.cache,
    this.storage,
    this.thirdParty
  });
}

class SystemStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final String? status;
  final String? message;
  final String? timestamp;
  final String? version;
  final ServiceStatus? services;

  SystemStatusVO({
    this.createdAt,
    this.updatedAt,
    this.status,
    this.message,
    this.timestamp,
    this.version,
    this.services
  });
}

class MaintenanceNoticeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? noticeId;
  final String? title;
  final String? content;
  final String? startTime;
  final String? endTime;
  final String? status;
  final String? maintenanceType;
  final String? affectedServices;
  final String? contactInfo;
  final bool? isEmergency;

  MaintenanceNoticeVO({
    this.createdAt,
    this.updatedAt,
    this.noticeId,
    this.title,
    this.content,
    this.startTime,
    this.endTime,
    this.status,
    this.maintenanceType,
    this.affectedServices,
    this.contactInfo,
    this.isEmergency
  });
}

class PlusApiResultMaintenanceNoticeVO {
  final MaintenanceNoticeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultMaintenanceNoticeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListPopupNotificationVO {
  final List<PopupNotificationVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListPopupNotificationVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class OnboardingPageVO {
  final String? createdAt;
  final String? updatedAt;
  final String? pageId;
  final String? title;
  final String? description;
  final List<String>? images;
  final List<String>? buttons;
  final String? backgroundColor;
  final String? textColor;
  final bool? isActive;
  final int? order;

  OnboardingPageVO({
    this.createdAt,
    this.updatedAt,
    this.pageId,
    this.title,
    this.description,
    this.images,
    this.buttons,
    this.backgroundColor,
    this.textColor,
    this.isActive,
    this.order
  });
}

class PlusApiResultListOnboardingPageVO {
  final List<OnboardingPageVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListOnboardingPageVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUserUsageStatsVO {
  final UserUsageStatsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserUsageStatsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserUsageStatsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? statsId;
  final String? userId;
  final int? totalSessions;
  final int? totalDuration;
  final int? activeDays;
  final int? lastActiveDays;
  final String? deviceType;
  final String? osType;
  final String? firstSeen;
  final String? lastSeen;
  final String? userType;

  UserUsageStatsVO({
    this.createdAt,
    this.updatedAt,
    this.statsId,
    this.userId,
    this.totalSessions,
    this.totalDuration,
    this.activeDays,
    this.lastActiveDays,
    this.deviceType,
    this.osType,
    this.firstSeen,
    this.lastSeen,
    this.userType
  });
}

class PlusApiResultRetentionAnalysisVO {
  final RetentionAnalysisVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRetentionAnalysisVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RetentionAnalysisVO {
  final String? createdAt;
  final String? updatedAt;
  final String? retentionType;
  final Map<String, double>? retentionRates;
  final double? averageRetentionRate;
  final int? totalUsers;
  final Map<String, int>? cohortSizes;

  RetentionAnalysisVO({
    this.createdAt,
    this.updatedAt,
    this.retentionType,
    this.retentionRates,
    this.averageRetentionRate,
    this.totalUsers,
    this.cohortSizes
  });
}

class PlusApiResultListReportTypeVO {
  final List<ReportTypeVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListReportTypeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ReportTypeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? reportTypeId;
  final String? reportName;
  final String? reportType;
  final String? description;
  final bool? enabled;
  final String? icon;

  ReportTypeVO({
    this.createdAt,
    this.updatedAt,
    this.reportTypeId,
    this.reportName,
    this.reportType,
    this.description,
    this.enabled,
    this.icon
  });
}

class PlusApiResultRealtimeOnlineVO {
  final RealtimeOnlineVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRealtimeOnlineVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RealtimeOnlineVO {
  final String? createdAt;
  final String? updatedAt;
  final int? currentOnline;
  final int? peakOnline;
  final int? averageOnline;
  final int? newUsers;
  final int? activeUsers;
  final String? timestamp;

  RealtimeOnlineVO({
    this.createdAt,
    this.updatedAt,
    this.currentOnline,
    this.peakOnline,
    this.averageOnline,
    this.newUsers,
    this.activeUsers,
    this.timestamp
  });
}

class PlusApiResultListRealtimeEventVO {
  final List<RealtimeEventVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListRealtimeEventVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RealtimeEventVO {
  final String? createdAt;
  final String? updatedAt;
  final String? eventId;
  final String? eventName;
  final String? eventType;
  final String? userId;
  final String? deviceId;
  final String? timestamp;
  final String? pageUrl;
  final String? referrer;

  RealtimeEventVO({
    this.createdAt,
    this.updatedAt,
    this.eventId,
    this.eventName,
    this.eventType,
    this.userId,
    this.deviceId,
    this.timestamp,
    this.pageUrl,
    this.referrer
  });
}

class PathAnalysisQueryForm {
  final String? startDate;
  final String? endDate;
  final String? startPage;
  final String? endPage;
  final int? maxSteps;
  final String? deviceType;
  final String? osType;

  PathAnalysisQueryForm({
    this.startDate,
    this.endDate,
    this.startPage,
    this.endPage,
    this.maxSteps,
    this.deviceType,
    this.osType
  });
}

class PathAnalysisVO {
  final String? createdAt;
  final String? updatedAt;
  final String? startPage;
  final String? endPage;
  final List<PathStepVO>? steps;
  final int? totalUsers;
  final double? averageSteps;
  final double? conversionRate;

  PathAnalysisVO({
    this.createdAt,
    this.updatedAt,
    this.startPage,
    this.endPage,
    this.steps,
    this.totalUsers,
    this.averageSteps,
    this.conversionRate
  });
}

class PathStepVO {
  final String? createdAt;
  final String? updatedAt;
  final String? pageUrl;
  final String? pageTitle;
  final int? userCount;
  final double? percentage;
  final List<PathStepVO>? nextSteps;

  PathStepVO({
    this.createdAt,
    this.updatedAt,
    this.pageUrl,
    this.pageTitle,
    this.userCount,
    this.percentage,
    this.nextSteps
  });
}

class PlusApiResultPathAnalysisVO {
  final PathAnalysisVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPathAnalysisVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FunnelQueryForm {
  final String? funnelName;
  final List<String>? events;
  final String? startDate;
  final String? endDate;
  final String? deviceType;
  final String? osType;

  FunnelQueryForm({
    this.funnelName,
    this.events,
    this.startDate,
    this.endDate,
    this.deviceType,
    this.osType
  });
}

class FunnelAnalysisVO {
  final String? createdAt;
  final String? updatedAt;
  final String? funnelName;
  final List<FunnelStepVO>? steps;
  final double? overallConversionRate;
  final int? totalUsers;
  final int? convertedUsers;

  FunnelAnalysisVO({
    this.createdAt,
    this.updatedAt,
    this.funnelName,
    this.steps,
    this.overallConversionRate,
    this.totalUsers,
    this.convertedUsers
  });
}

class FunnelStepVO {
  final String? createdAt;
  final String? updatedAt;
  final String? eventName;
  final int? userCount;
  final double? conversionRate;
  final double? stepConversionRate;

  FunnelStepVO({
    this.createdAt,
    this.updatedAt,
    this.eventName,
    this.userCount,
    this.conversionRate,
    this.stepConversionRate
  });
}

class PlusApiResultFunnelAnalysisVO {
  final FunnelAnalysisVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFunnelAnalysisVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class EventTrendQueryForm {
  final String? eventName;
  final String? startDate;
  final String? endDate;
  final String? interval;
  final String? deviceType;
  final String? osType;
  final String? channel;

  EventTrendQueryForm({
    this.eventName,
    this.startDate,
    this.endDate,
    this.interval,
    this.deviceType,
    this.osType,
    this.channel
  });
}

class EventTrendVO {
  final String? createdAt;
  final String? updatedAt;
  final String? eventName;
  final List<String>? timePoints;
  final List<int>? values;
  final int? totalCount;
  final double? growthRate;
  final String? interval;

  EventTrendVO({
    this.createdAt,
    this.updatedAt,
    this.eventName,
    this.timePoints,
    this.values,
    this.totalCount,
    this.growthRate,
    this.interval
  });
}

class PlusApiResultEventTrendVO {
  final EventTrendVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultEventTrendVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListTopEventVO {
  final List<TopEventVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTopEventVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TopEventVO {
  final String? createdAt;
  final String? updatedAt;
  final String? eventName;
  final int? count;
  final double? percentage;
  final String? eventType;

  TopEventVO({
    this.createdAt,
    this.updatedAt,
    this.eventName,
    this.count,
    this.percentage,
    this.eventType
  });
}

class EventStatsQueryForm {
  final String? eventName;
  final String? startDate;
  final String? endDate;
  final String? interval;
  final String? deviceType;
  final String? osType;

  EventStatsQueryForm({
    this.eventName,
    this.startDate,
    this.endDate,
    this.interval,
    this.deviceType,
    this.osType
  });
}

class EventStatsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? eventName;
  final int? totalCount;
  final double? averagePerUser;
  final Map<String, int>? hourlyStats;
  final Map<String, int>? dailyStats;
  final Map<String, dynamic>? topProperties;

  EventStatsVO({
    this.createdAt,
    this.updatedAt,
    this.eventName,
    this.totalCount,
    this.averagePerUser,
    this.hourlyStats,
    this.dailyStats,
    this.topProperties
  });
}

class PlusApiResultEventStatsVO {
  final EventStatsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultEventStatsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class DeviceDistributionVO {
  final String? createdAt;
  final String? updatedAt;
  final String? deviceType;
  final String? deviceModel;
  final String? osType;
  final String? osVersion;
  final int? userCount;
  final double? percentage;
  final int? activeCount;

  DeviceDistributionVO({
    this.createdAt,
    this.updatedAt,
    this.deviceType,
    this.deviceModel,
    this.osType,
    this.osVersion,
    this.userCount,
    this.percentage,
    this.activeCount
  });
}

class PlusApiResultDeviceDistributionVO {
  final DeviceDistributionVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultDeviceDistributionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ConversionPathVO {
  final String? createdAt;
  final String? updatedAt;
  final String? pathId;
  final List<String>? steps;
  final int? conversionCount;
  final double? conversionRate;
  final double? averageTime;
  final String? startPage;
  final String? endPage;

  ConversionPathVO({
    this.createdAt,
    this.updatedAt,
    this.pathId,
    this.steps,
    this.conversionCount,
    this.conversionRate,
    this.averageTime,
    this.startPage,
    this.endPage
  });
}

class PlusApiResultConversionPathVO {
  final ConversionPathVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultConversionPathVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ChannelQueryForm {
  final String? startDate;
  final String? endDate;
  final String? channelType;
  final String? deviceType;
  final int? pageSize;
  final int? pageNum;

  ChannelQueryForm({
    this.startDate,
    this.endDate,
    this.channelType,
    this.deviceType,
    this.pageSize,
    this.pageNum
  });
}

class ChannelAnalysisVO {
  final String? createdAt;
  final String? updatedAt;
  final String? channelId;
  final String? channelName;
  final String? channelType;
  final int? clickCount;
  final int? installCount;
  final int? activeCount;
  final double? conversionRate;
  final double? costPerInstall;
  final double? roi;

  ChannelAnalysisVO({
    this.createdAt,
    this.updatedAt,
    this.channelId,
    this.channelName,
    this.channelType,
    this.clickCount,
    this.installCount,
    this.activeCount,
    this.conversionRate,
    this.costPerInstall,
    this.roi
  });
}

class PlusApiResultChannelAnalysisVO {
  final ChannelAnalysisVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultChannelAnalysisVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AiUsageStatsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? statsId;
  final String? modelName;
  final int? promptTokens;
  final int? completionTokens;
  final int? totalTokens;
  final int? requestCount;
  final int? errorCount;
  final String? date;
  final String? userId;

  AiUsageStatsVO({
    this.createdAt,
    this.updatedAt,
    this.statsId,
    this.modelName,
    this.promptTokens,
    this.completionTokens,
    this.totalTokens,
    this.requestCount,
    this.errorCount,
    this.date,
    this.userId
  });
}

class PlusApiResultAiUsageStatsVO {
  final AiUsageStatsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAiUsageStatsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserActivityQueryForm {
  final String? startDate;
  final String? endDate;
  final String? activityType;
  final String? userId;
  final int? pageSize;
  final int? pageNum;

  UserActivityQueryForm({
    this.startDate,
    this.endDate,
    this.activityType,
    this.userId,
    this.pageSize,
    this.pageNum
  });
}

class PlusApiResultUserActivityVO {
  final UserActivityVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUserActivityVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UserActivityVO {
  final String? createdAt;
  final String? updatedAt;
  final String? activityId;
  final String? userId;
  final String? activityType;
  final String? activityName;
  final String? timestamp;
  final String? deviceId;
  final String? ipAddress;
  final String? pageUrl;
  final String? referrer;

  UserActivityVO({
    this.createdAt,
    this.updatedAt,
    this.activityId,
    this.userId,
    this.activityType,
    this.activityName,
    this.timestamp,
    this.deviceId,
    this.ipAddress,
    this.pageUrl,
    this.referrer
  });
}

class PlusApiResultSplashAdvertVO {
  final SplashAdvertVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultSplashAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class SplashAdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;
  final int? displayDuration;
  final bool? skipEnabled;
  final int? skipDelay;
  final String? backgroundColor;
  final String? logoUrl;

  SplashAdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount,
    this.displayDuration,
    this.skipEnabled,
    this.skipDelay,
    this.backgroundColor,
    this.logoUrl
  });
}

class AdvertSettingsVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? enabled;
  final bool? personalized;
  final int? maxDailyAds;
  final String? adBlockLevel;
  final bool? rewardVideoEnabled;
  final bool? interstitialEnabled;
  final bool? bannerEnabled;
  final String? lastUpdated;

  AdvertSettingsVO({
    this.createdAt,
    this.updatedAt,
    this.enabled,
    this.personalized,
    this.maxDailyAds,
    this.adBlockLevel,
    this.rewardVideoEnabled,
    this.interstitialEnabled,
    this.bannerEnabled,
    this.lastUpdated
  });
}

class PlusApiResultAdvertSettingsVO {
  final AdvertSettingsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAdvertSettingsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultRewardedAdvertVO {
  final RewardedAdvertVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRewardedAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RewardedAdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;
  final String? rewardType;
  final int? rewardAmount;
  final int? videoDuration;
  final bool? skipEnabled;
  final String? rewardMessage;

  RewardedAdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount,
    this.rewardType,
    this.rewardAmount,
    this.videoDuration,
    this.skipEnabled,
    this.rewardMessage
  });
}

class AdvertPositionVO {
  final String? createdAt;
  final String? updatedAt;
  final String? positionId;
  final String? positionName;
  final String? positionType;
  final String? description;
  final int? priority;
  final bool? enabled;
  final int? advertCount;

  AdvertPositionVO({
    this.createdAt,
    this.updatedAt,
    this.positionId,
    this.positionName,
    this.positionType,
    this.description,
    this.priority,
    this.enabled,
    this.advertCount
  });
}

class PlusApiResultListAdvertPositionVO {
  final List<AdvertPositionVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListAdvertPositionVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AdvertPositionDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? positionId;
  final String? positionName;
  final String? positionType;
  final String? description;
  final int? priority;
  final bool? enabled;
  final List<AdvertVO>? adverts;

  AdvertPositionDetailVO({
    this.createdAt,
    this.updatedAt,
    this.positionId,
    this.positionName,
    this.positionType,
    this.description,
    this.priority,
    this.enabled,
    this.adverts
  });
}

class AdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;

  AdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount
  });
}

class PlusApiResultAdvertPositionDetailVO {
  final AdvertPositionDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAdvertPositionDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListAdvertVO {
  final List<AdvertVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultPopupAdvertVO {
  final PopupAdvertVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPopupAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PopupAdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;
  final String? popupSize;
  final int? displayDuration;
  final bool? closeButtonEnabled;
  final String? popupPosition;

  PopupAdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount,
    this.popupSize,
    this.displayDuration,
    this.closeButtonEnabled,
    this.popupPosition
  });
}

class InterstitialAdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;
  final String? interstitialSize;
  final int? displayTime;
  final bool? skipEnabled;
  final int? skipDelay;

  InterstitialAdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount,
    this.interstitialSize,
    this.displayTime,
    this.skipEnabled,
    this.skipDelay
  });
}

class PlusApiResultInterstitialAdvertVO {
  final InterstitialAdvertVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultInterstitialAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class FeedAdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;
  final String? title;
  final String? description;
  final String? imageUrl;
  final int? likes;
  final int? comments;

  FeedAdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount,
    this.title,
    this.description,
    this.imageUrl,
    this.likes,
    this.comments
  });
}

class PlusApiResultListFeedAdvertVO {
  final List<FeedAdvertVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFeedAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AdvertConfigVO {
  final String? createdAt;
  final String? updatedAt;
  final String? configId;
  final bool? enabled;
  final int? maxAdsPerHour;
  final int? minInterval;
  final String? adNetwork;
  final String? apiKey;
  final String? status;

  AdvertConfigVO({
    this.createdAt,
    this.updatedAt,
    this.configId,
    this.enabled,
    this.maxAdsPerHour,
    this.minInterval,
    this.adNetwork,
    this.apiKey,
    this.status
  });
}

class PlusApiResultAdvertConfigVO {
  final AdvertConfigVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAdvertConfigVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BannerAdvertVO {
  final String? createdAt;
  final String? updatedAt;
  final String? advertId;
  final String? advertName;
  final String? advertType;
  final String? positionId;
  final String? creativeUrl;
  final String? landingUrl;
  final int? priority;
  final bool? enabled;
  final String? startTime;
  final String? endTime;
  final int? clickCount;
  final int? impressionCount;
  final String? bannerSize;
  final String? animationType;
  final int? refreshInterval;

  BannerAdvertVO({
    this.createdAt,
    this.updatedAt,
    this.advertId,
    this.advertName,
    this.advertType,
    this.positionId,
    this.creativeUrl,
    this.landingUrl,
    this.priority,
    this.enabled,
    this.startTime,
    this.endTime,
    this.clickCount,
    this.impressionCount,
    this.bannerSize,
    this.animationType,
    this.refreshInterval
  });
}

class PlusApiResultListBannerAdvertVO {
  final List<BannerAdvertVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListBannerAdvertVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ActivityDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? description;
  final String? type;
  final String? coverImage;
  final List<String>? bannerImages;
  final String? rules;
  final String? startTime;
  final String? endTime;
  final int? participantCount;
  final bool? hasJoined;
  final int? maxJoinCount;
  final int? joinedCount;
  final int? remainingCount;
  final List<ActivityReward>? rewards;
  final Map<String, dynamic>? extraConfig;

  ActivityDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.description,
    this.type,
    this.coverImage,
    this.bannerImages,
    this.rules,
    this.startTime,
    this.endTime,
    this.participantCount,
    this.hasJoined,
    this.maxJoinCount,
    this.joinedCount,
    this.remainingCount,
    this.rewards,
    this.extraConfig
  });
}

class ActivityReward {
  final String? type;
  final String? name;
  final int? quantity;
  final String? icon;

  ActivityReward({
    this.type,
    this.name,
    this.quantity,
    this.icon
  });
}

class PlusApiResultActivityDetailVO {
  final ActivityDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultActivityDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultListTaskVO {
  final List<TaskVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListTaskVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class TaskVO {
  final String? createdAt;
  final String? updatedAt;
  final String? taskId;
  final String? taskName;
  final String? taskType;
  final String? status;
  final int? progress;
  final int? total;
  final String? rewardType;
  final int? rewardAmount;
  final String? expireAt;

  TaskVO({
    this.createdAt,
    this.updatedAt,
    this.taskId,
    this.taskName,
    this.taskType,
    this.status,
    this.progress,
    this.total,
    this.rewardType,
    this.rewardAmount,
    this.expireAt
  });
}

class ActivityRecordQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? activityId;
  final String? recordType;
  final int? size;
  final int? page;

  ActivityRecordQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.activityId,
    this.recordType,
    this.size,
    this.page
  });
}

class ActivityRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? activityId;
  final String? activityTitle;
  final String? activityType;
  final String? participateTime;
  final String? status;
  final String? result;
  final Map<String, dynamic>? rewards;

  ActivityRecordVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.activityId,
    this.activityTitle,
    this.activityType,
    this.participateTime,
    this.status,
    this.result,
    this.rewards
  });
}

class PageActivityRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ActivityRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageActivityRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageActivityRecordVO {
  final PageActivityRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageActivityRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultRankingVO {
  final RankingVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRankingVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RankInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final int? rank;
  final String? userId;
  final String? username;
  final int? score;
  final String? avatar;
  final bool? isCurrentUser;

  RankInfoVO({
    this.createdAt,
    this.updatedAt,
    this.rank,
    this.userId,
    this.username,
    this.score,
    this.avatar,
    this.isCurrentUser
  });
}

class RankingVO {
  final String? createdAt;
  final String? updatedAt;
  final String? rankingType;
  final String? period;
  final List<RankInfoVO>? rankings;
  final RankInfoVO? myRank;
  final int? totalUsers;

  RankingVO({
    this.createdAt,
    this.updatedAt,
    this.rankingType,
    this.period,
    this.rankings,
    this.myRank,
    this.totalUsers
  });
}

class PlusApiResultRankInfoVO {
  final RankInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRankInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsGoodsQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? category;
  final int? minPoints;
  final int? maxPoints;
  final bool? exchangeable;
  final int? size;
  final int? page;

  PointsGoodsQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.category,
    this.minPoints,
    this.maxPoints,
    this.exchangeable,
    this.size,
    this.page
  });
}

class PagePointsGoodsVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PointsGoodsVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePointsGoodsVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePointsGoodsVO {
  final PagePointsGoodsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePointsGoodsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsGoodsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? image;
  final String? category;
  final int? points;
  final int? originalPoints;
  final int? stock;
  final bool? exchangeable;
  final int? limitPerUser;
  final int? exchangedCount;
  final List<String>? tags;
  final int? sortWeight;

  PointsGoodsVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.image,
    this.category,
    this.points,
    this.originalPoints,
    this.stock,
    this.exchangeable,
    this.limitPerUser,
    this.exchangedCount,
    this.tags,
    this.sortWeight
  });
}

class PlusApiResultPointsGoodsDetailVO {
  final PointsGoodsDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPointsGoodsDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsGoodsDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? name;
  final String? description;
  final List<String>? images;
  final String? category;
  final int? points;
  final int? originalPoints;
  final int? stock;
  final bool? exchangeable;
  final int? limitPerUser;
  final int? myExchangedCount;
  final String? exchangeNote;
  final String? validUntil;
  final String? usageInstructions;

  PointsGoodsDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.name,
    this.description,
    this.images,
    this.category,
    this.points,
    this.originalPoints,
    this.stock,
    this.exchangeable,
    this.limitPerUser,
    this.myExchangedCount,
    this.exchangeNote,
    this.validUntil,
    this.usageInstructions
  });
}

class ExchangeRecordQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? status;
  final int? size;
  final int? page;

  ExchangeRecordQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.status,
    this.size,
    this.page
  });
}

class PagePointsExchangeRecordVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<PointsExchangeRecordVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PagePointsExchangeRecordVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPagePointsExchangeRecordVO {
  final PagePointsExchangeRecordVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPagePointsExchangeRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PointsExchangeRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final String? recordId;
  final String? goodsId;
  final String? goodsName;
  final String? goodsImage;
  final int? quantity;
  final int? pointsCost;
  final String? exchangeTime;
  final String? status;
  final String? deliverTime;
  final String? logisticsInfo;
  final String? remark;

  PointsExchangeRecordVO({
    this.createdAt,
    this.updatedAt,
    this.recordId,
    this.goodsId,
    this.goodsName,
    this.goodsImage,
    this.quantity,
    this.pointsCost,
    this.exchangeTime,
    this.status,
    this.deliverTime,
    this.logisticsInfo,
    this.remark
  });
}

class LotteryDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? description;
  final String? rules;
  final String? startTime;
  final String? endTime;
  final int? freeDrawCount;
  final int? remainingFreeCount;
  final int? pointsCost;
  final int? myPoints;
  final List<LotteryPrize>? prizes;
  final List<RecentWinner>? recentWinners;

  LotteryDetailVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.description,
    this.rules,
    this.startTime,
    this.endTime,
    this.freeDrawCount,
    this.remainingFreeCount,
    this.pointsCost,
    this.myPoints,
    this.prizes,
    this.recentWinners
  });
}

class LotteryPrize {
  final String? prizeId;
  final String? name;
  final String? image;
  final String? probability;
  final bool? isGrandPrize;
  final int? remainingCount;

  LotteryPrize({
    this.prizeId,
    this.name,
    this.image,
    this.probability,
    this.isGrandPrize,
    this.remainingCount
  });
}

class PlusApiResultLotteryDetailVO {
  final LotteryDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultLotteryDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RecentWinner {
  final String? nickname;
  final String? prizeName;
  final String? winTime;

  RecentWinner({
    this.nickname,
    this.prizeName,
    this.winTime
  });
}

class LotteryPrizeQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? claimStatus;
  final int? size;
  final int? page;

  LotteryPrizeQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.claimStatus,
    this.size,
    this.page
  });
}

class LotteryPrizeVO {
  final String? createdAt;
  final String? updatedAt;
  final String? recordId;
  final String? lotteryId;
  final String? lotteryTitle;
  final String? prizeId;
  final String? prizeName;
  final String? prizeImage;
  final String? prizeType;
  final bool? isGrandPrize;
  final String? winTime;
  final String? claimStatus;
  final String? claimTime;
  final String? expireTime;
  final bool? canClaim;

  LotteryPrizeVO({
    this.createdAt,
    this.updatedAt,
    this.recordId,
    this.lotteryId,
    this.lotteryTitle,
    this.prizeId,
    this.prizeName,
    this.prizeImage,
    this.prizeType,
    this.isGrandPrize,
    this.winTime,
    this.claimStatus,
    this.claimTime,
    this.expireTime,
    this.canClaim
  });
}

class PageLotteryPrizeVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<LotteryPrizeVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageLotteryPrizeVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageLotteryPrizeVO {
  final PageLotteryPrizeVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageLotteryPrizeVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class LotteryActivityVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? coverImage;
  final String? startTime;
  final String? endTime;
  final int? freeDrawCount;
  final int? pointsCost;
  final List<PrizePreview>? prizePreview;
  final bool? canDraw;

  LotteryActivityVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.coverImage,
    this.startTime,
    this.endTime,
    this.freeDrawCount,
    this.pointsCost,
    this.prizePreview,
    this.canDraw
  });
}

class PlusApiResultListLotteryActivityVO {
  final List<LotteryActivityVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListLotteryActivityVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PrizePreview {
  final String? name;
  final String? image;
  final bool? isGrandPrize;

  PrizePreview({
    this.name,
    this.image,
    this.isGrandPrize
  });
}

class ActivityQueryForm {
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;
  final String? type;
  final String? status;
  final int? size;
  final int? page;

  ActivityQueryForm({
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection,
    this.type,
    this.status,
    this.size,
    this.page
  });
}

class ActivityVO {
  final String? createdAt;
  final String? updatedAt;
  final String? id;
  final String? title;
  final String? subtitle;
  final String? type;
  final String? coverImage;
  final String? status;
  final String? startTime;
  final String? endTime;
  final bool? hasJoined;
  final int? maxJoinCount;
  final int? joinedCount;
  final List<String>? tags;

  ActivityVO({
    this.createdAt,
    this.updatedAt,
    this.id,
    this.title,
    this.subtitle,
    this.type,
    this.coverImage,
    this.status,
    this.startTime,
    this.endTime,
    this.hasJoined,
    this.maxJoinCount,
    this.joinedCount,
    this.tags
  });
}

class PageActivityVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<ActivityVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageActivityVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageActivityVO {
  final PageActivityVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageActivityVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CheckInReward {
  final int? points;
  final String? extraReward;

  CheckInReward({
    this.points,
    this.extraReward
  });
}

class CheckInStatusVO {
  final String? createdAt;
  final String? updatedAt;
  final bool? checkedInToday;
  final int? consecutiveDays;
  final int? monthlyCheckInCount;
  final List<String>? monthlyCheckInDates;
  final List<String>? missedDates;
  final CheckInReward? todayReward;
  final CheckInReward? tomorrowReward;
  final int? makeUpCost;
  final int? remainingMakeUpCount;

  CheckInStatusVO({
    this.createdAt,
    this.updatedAt,
    this.checkedInToday,
    this.consecutiveDays,
    this.monthlyCheckInCount,
    this.monthlyCheckInDates,
    this.missedDates,
    this.todayReward,
    this.tomorrowReward,
    this.makeUpCost,
    this.remainingMakeUpCount
  });
}

class PlusApiResultCheckInStatusVO {
  final CheckInStatusVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCheckInStatusVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CheckInRecordVO {
  final String? createdAt;
  final String? updatedAt;
  final String? date;
  final bool? checkedIn;
  final bool? isMakeUp;
  final int? points;
  final int? consecutiveDays;
  final Map<String, dynamic>? extraRewards;

  CheckInRecordVO({
    this.createdAt,
    this.updatedAt,
    this.date,
    this.checkedIn,
    this.isMakeUp,
    this.points,
    this.consecutiveDays,
    this.extraRewards
  });
}

class PlusApiResultListCheckInRecordVO {
  final List<CheckInRecordVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListCheckInRecordVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AccountSummaryVO {
  final String? createdAt;
  final String? updatedAt;
  final double? cashAvailable;
  final double? cashFrozen;
  final int? pointsAvailable;
  final int? pointsFrozen;
  final int? tokenAvailable;
  final int? tokenFrozen;
  final bool? hasPayPassword;

  AccountSummaryVO({
    this.createdAt,
    this.updatedAt,
    this.cashAvailable,
    this.cashFrozen,
    this.pointsAvailable,
    this.pointsFrozen,
    this.tokenAvailable,
    this.tokenFrozen,
    this.hasPayPassword
  });
}

class PlusApiResultAccountSummaryVO {
  final AccountSummaryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAccountSummaryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class HistoryQueryForm {
  final String? transactionType;
  final String? status;
  final String? startDate;
  final String? endDate;
  final int? pageNum;
  final int? pageSize;
  final String? sortField;
  final String? sortDirection;

  HistoryQueryForm({
    this.transactionType,
    this.status,
    this.startDate,
    this.endDate,
    this.pageNum,
    this.pageSize,
    this.sortField,
    this.sortDirection
  });
}

class HistoryVO {
  final String? createdAt;
  final String? updatedAt;
  final String? historyId;
  final String? accountId;
  final String? transactionType;
  final String? transactionTypeName;
  final double? amount;
  final int? points;
  final int? tokens;
  final double? balanceBefore;
  final double? balanceAfter;
  final int? pointsBefore;
  final int? pointsAfter;
  final String? transactionId;
  final String? relatedId;
  final String? relatedType;
  final String? remarks;
  final String? status;
  final String? statusName;
  final String? counterpartyAccountId;
  final String? counterpartyUserId;
  final String? counterpartyUserName;

  HistoryVO({
    this.createdAt,
    this.updatedAt,
    this.historyId,
    this.accountId,
    this.transactionType,
    this.transactionTypeName,
    this.amount,
    this.points,
    this.tokens,
    this.balanceBefore,
    this.balanceAfter,
    this.pointsBefore,
    this.pointsAfter,
    this.transactionId,
    this.relatedId,
    this.relatedType,
    this.remarks,
    this.status,
    this.statusName,
    this.counterpartyAccountId,
    this.counterpartyUserId,
    this.counterpartyUserName
  });
}

class PageHistoryVO {
  final int? totalPages;
  final int? totalElements;
  final int? size;
  final List<HistoryVO>? content;
  final int? number;
  final SortObject? sort;
  final bool? first;
  final bool? last;
  final int? numberOfElements;
  final PageableObject? pageable;
  final bool? empty;

  PageHistoryVO({
    this.totalPages,
    this.totalElements,
    this.size,
    this.content,
    this.number,
    this.sort,
    this.first,
    this.last,
    this.numberOfElements,
    this.pageable,
    this.empty
  });
}

class PlusApiResultPageHistoryVO {
  final PageHistoryVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultPageHistoryVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class CashAccountInfoVO {
  final String? createdAt;
  final String? updatedAt;
  final String? accountId;
  final String? accountType;
  final String? accountTypeName;
  final String? ownerId;
  final String? userId;
  final double? availableBalance;
  final double? frozenBalance;
  final double? totalBalance;
  final String? status;
  final String? statusName;
  final double? pendingBalance;
  final double? totalRecharged;
  final double? totalSpent;
  final double? totalWithdrawn;

  CashAccountInfoVO({
    this.createdAt,
    this.updatedAt,
    this.accountId,
    this.accountType,
    this.accountTypeName,
    this.ownerId,
    this.userId,
    this.availableBalance,
    this.frozenBalance,
    this.totalBalance,
    this.status,
    this.statusName,
    this.pendingBalance,
    this.totalRecharged,
    this.totalSpent,
    this.totalWithdrawn
  });
}

class PlusApiResultCashAccountInfoVO {
  final CashAccountInfoVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultCashAccountInfoVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExperimentResultsVO {
  final String? createdAt;
  final String? updatedAt;
  final String? experimentKey;
  final List<Map<String, dynamic>>? results;
  final Map<String, dynamic>? statistics;
  final String? status;
  final String? generatedAt;

  ExperimentResultsVO({
    this.createdAt,
    this.updatedAt,
    this.experimentKey,
    this.results,
    this.statistics,
    this.status,
    this.generatedAt
  });
}

class PlusApiResultExperimentResultsVO {
  final ExperimentResultsVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExperimentResultsVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExperimentReportVO {
  final String? createdAt;
  final String? updatedAt;
  final String? experimentKey;
  final String? reportType;
  final Map<String, dynamic>? reportData;
  final String? generatedAt;
  final String? version;

  ExperimentReportVO({
    this.createdAt,
    this.updatedAt,
    this.experimentKey,
    this.reportType,
    this.reportData,
    this.generatedAt,
    this.version
  });
}

class PlusApiResultExperimentReportVO {
  final ExperimentReportVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExperimentReportVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultUiConfigVO {
  final UiConfigVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultUiConfigVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class UiConfigVO {
  final String? createdAt;
  final String? updatedAt;
  final String? configKey;
  final String? configName;
  final Map<String, dynamic>? uiConfig;
  final String? version;

  UiConfigVO({
    this.createdAt,
    this.updatedAt,
    this.configKey,
    this.configName,
    this.uiConfig,
    this.version
  });
}

class PlusApiResultListRolloutConfigVO {
  final List<RolloutConfigVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListRolloutConfigVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RolloutConfigVO {
  final String? createdAt;
  final String? updatedAt;
  final String? rolloutKey;
  final String? rolloutName;
  final Map<String, dynamic>? config;
  final String? status;

  RolloutConfigVO({
    this.createdAt,
    this.updatedAt,
    this.rolloutKey,
    this.rolloutName,
    this.config,
    this.status
  });
}

class PlusApiResultRolloutCheckVO {
  final RolloutCheckVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultRolloutCheckVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class RolloutCheckVO {
  final String? createdAt;
  final String? updatedAt;
  final String? rolloutKey;
  final bool? canRollout;
  final String? reason;
  final String? status;
  final String? checkedAt;

  RolloutCheckVO({
    this.createdAt,
    this.updatedAt,
    this.rolloutKey,
    this.canRollout,
    this.reason,
    this.status,
    this.checkedAt
  });
}

class PlusApiResultListFeatureFlagVO {
  final List<FeatureFlagVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListFeatureFlagVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultFeatureFlagVO {
  final FeatureFlagVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultFeatureFlagVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExperimentVO {
  final String? createdAt;
  final String? updatedAt;
  final String? experimentKey;
  final String? experimentName;
  final String? experimentDescription;
  final String? status;

  ExperimentVO({
    this.createdAt,
    this.updatedAt,
    this.experimentKey,
    this.experimentName,
    this.experimentDescription,
    this.status
  });
}

class PlusApiResultListExperimentVO {
  final List<ExperimentVO>? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultListExperimentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class ExperimentDetailVO {
  final String? createdAt;
  final String? updatedAt;
  final String? experimentKey;
  final String? experimentName;
  final String? experimentDescription;
  final String? status;
  final List<Map<String, dynamic>>? variants;
  final Map<String, dynamic>? config;

  ExperimentDetailVO({
    this.createdAt,
    this.updatedAt,
    this.experimentKey,
    this.experimentName,
    this.experimentDescription,
    this.status,
    this.variants,
    this.config
  });
}

class PlusApiResultExperimentDetailVO {
  final ExperimentDetailVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExperimentDetailVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class PlusApiResultExperimentAssignmentVO {
  final ExperimentAssignmentVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultExperimentAssignmentVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class AlgorithmConfigVO {
  final String? createdAt;
  final String? updatedAt;
  final String? algorithmType;
  final dynamic? algorithmParams;
  final String? version;

  AlgorithmConfigVO({
    this.createdAt,
    this.updatedAt,
    this.algorithmType,
    this.algorithmParams,
    this.version
  });
}

class PlusApiResultAlgorithmConfigVO {
  final AlgorithmConfigVO? data;
  final String? code;
  final String? msg;
  final String? requestId;
  final String? ip;
  final String? hostname;
  final String? errorName;

  PlusApiResultAlgorithmConfigVO({
    this.data,
    this.code,
    this.msg,
    this.requestId,
    this.ip,
    this.hostname,
    this.errorName
  });
}

class BatchCancelShareForm {
  final List<String>? shareIds;
  final String? reason;

  BatchCancelShareForm({
    this.shareIds,
    this.reason
  });
}

class AccountDeleteForm {
  final String? password;
  final String? reason;
  final bool? confirm;
  final int? timestamp;

  AccountDeleteForm({
    this.password,
    this.reason,
    this.confirm,
    this.timestamp
  });
}

class NotificationBatchDeleteForm {
  final List<String>? notificationIds;

  NotificationBatchDeleteForm({
    this.notificationIds
  });
}

class HistoryBatchDeleteForm {
  final List<String>? historyIds;
  final String? type;

  HistoryBatchDeleteForm({
    this.historyIds,
    this.type
  });
}

class FavoriteBatchRemoveForm {
  final List<String>? favoriteIds;

  FavoriteBatchRemoveForm({
    this.favoriteIds
  });
}

class UploadAvatarRequest {
  final String? file;

  UploadAvatarRequest({
    this.file
  });
}

class ImageRequest {
  final String? file;

  ImageRequest({
    this.file
  });
}

class FileRequest {
  final String? file;

  FileRequest({
    this.file
  });
}

class ChunkRequest {
  final String? file;

  ChunkRequest({
    this.file
  });
}

class PaymentCallbackRequest {


  PaymentCallbackRequest({

  });
}

class PaymentCallbackResponse {


  PaymentCallbackResponse({

  });
}

class GetModelPricesRequest {


  GetModelPricesRequest({

  });
}

class BatchDeleteNotesRequest {


  BatchDeleteNotesRequest({

  });
}

class BatchDeleteAssetsRequest {


  BatchDeleteAssetsRequest({

  });
}
