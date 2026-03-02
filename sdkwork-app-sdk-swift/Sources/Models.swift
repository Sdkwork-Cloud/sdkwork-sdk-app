import Foundation

struct WorkspaceSettings: Codable {
    let isPublic: Bool?
    let allowInvite: Bool?
    let allowCreateProject: Bool?
    let allowFileUpload: Bool?
}

struct WorkspaceUpdateForm: Codable {
    let workspaceId: String?
    let workspaceName: String?
    let workspaceDescription: String?
    let workspaceIcon: String?
    let workspaceColor: String?
    let settings: WorkspaceSettings?
}

struct PlusApiResultWorkspaceVO: Codable {
    let data: WorkspaceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct WorkspaceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let workspaceId: String?
    let workspaceName: String?
    let workspaceDescription: String?
    let workspaceIcon: String?
    let workspaceColor: String?
    let workspaceType: String?
    let creatorId: String?
    let creatorName: String?
    let createTime: String?
    let updateTime: String?
    let memberCount: Int?
    let projectCount: Int?
    let status: String?
    let isPublic: Bool?
    let userRole: String?
    let userPermissions: [String]?
    let settings: WorkspaceSettings?
}

struct ProjectSettings: Codable {
    let isPublic: Bool?
    let allowComments: Bool?
    let allowFileUpload: Bool?
    let allowInviteMembers: Bool?
}

struct ProjectUpdateForm: Codable {
    let projectId: String?
    let projectName: String?
    let projectDescription: String?
    let projectIcon: String?
    let projectColor: String?
    let projectTags: [String]?
    let settings: ProjectSettings?
}

struct PlusApiResultProjectVO: Codable {
    let data: ProjectVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let projectId: String?
    let projectName: String?
    let projectDescription: String?
    let projectType: String?
    let projectIcon: String?
    let projectColor: String?
    let projectTags: [String]?
    let workspaceId: String?
    let workspaceName: String?
    let creatorId: String?
    let creatorName: String?
    let createTime: String?
    let updateTime: String?
    let memberCount: Int?
    let fileCount: Int?
    let status: String?
    let isPublic: Bool?
    let userPermissions: [String]?
}

struct PlusApiResultVoid: Codable {
    let data: Any?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectMoveForm: Codable {
    let projectId: String?
    let targetWorkspaceId: String?
    let moveReason: String?
    let retainMembers: Bool?
    let retainSettings: Bool?
}

struct MemberRoleUpdateForm: Codable {
    let workspaceId: String?
    let memberId: String?
    let userId: String?
    let newRoleId: String?
    let newRoleName: String?
    let permissions: [String]?
    let updateReason: String?
    let needNotify: Bool?
}

struct VoiceSpeakerCreateForm: Codable {
    let name: String?
    let localName: String?
    let code: String?
    let faceImageUrl: String?
    let channel: String?
    let product: String?
    let gender: String?
    let ageType: String?
    let type: String?
    let models: [String]?
    let channelSpeakerId: String?
    let version: String?
    let description: String?
    let tags: [String]?
}

struct PlusApiResultVoiceSpeakerVO: Codable {
    let data: VoiceSpeakerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceSpeakerVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let localName: String?
    let code: String?
    let faceImageUrl: String?
    let faceVideoUrl: String?
    let channel: String?
    let channelName: String?
    let product: String?
    let gender: String?
    let genderName: String?
    let ageType: String?
    let ageTypeName: String?
    let type: String?
    let typeName: String?
    let models: [String]?
    let channelSpeakerId: String?
    let version: String?
    let isDefault: Bool?
    let status: String?
    let statusName: String?
    let description: String?
    let tags: [String]?
}

struct VideoUpdateForm: Codable {
    let title: String?
    let description: String?
}

struct PlusApiResultVideoVO: Codable {
    let data: VideoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let videoId: String?
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let thumbnailUrl: String?
    let width: Int?
    let height: Int?
    let aspectRatio: String?
    let categoryId: Int?
    let status: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let playCount: Int?
    let likeCount: Int?
}

struct DownloadSettings: Codable {
    let downloadPath: String?
    let wifiOnly: Bool?
    let autoDownload: Bool?
    let maxConcurrent: Int?
}

struct NotificationSettings: Codable {
    let system: Bool?
    let message: Bool?
    let activity: Bool?
    let promotion: Bool?
    let sound: Bool?
    let vibration: Bool?
}

struct PrivacySettings: Codable {
    let publicProfile: Bool?
    let allowSearch: Bool?
    let allowFriendRequest: Bool?
    let allowStrangerMessage: Bool?
    let locationShare: Bool?
}

struct UserSettingsUpdateForm: Codable {
    let notificationSettings: NotificationSettings?
    let privacySettings: PrivacySettings?
    let language: String?
    let theme: String?
    let autoPlay: Bool?
    let highQuality: Bool?
    let dataSaver: Bool?
    let downloadSettings: DownloadSettings?
}

struct NotificationSettingsVO: Codable {
    let system: Bool?
    let message: Bool?
    let activity: Bool?
    let promotion: Bool?
    let sound: Bool?
    let vibration: Bool?
}

struct PlusApiResultUserSettingsVO: Codable {
    let data: UserSettingsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PrivacySettingsVO: Codable {
    let publicProfile: Bool?
    let allowSearch: Bool?
    let allowFriendRequest: Bool?
}

struct UserSettingsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let theme: String?
    let language: String?
    let notificationSettings: NotificationSettingsVO?
    let privacySettings: PrivacySettingsVO?
}

struct UserProfileUpdateForm: Codable {
    let nickname: String?
    let avatar: String?
    let gender: String?
    let birthday: String?
    let region: String?
    let bio: String?
    let occupation: String?
    let interests: String?
    let phone: String?
    let email: String?
    let verifyCode: String?
}

struct PlusApiResultUserProfileVO: Codable {
    let data: UserProfileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserProfileVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let nickname: String?
    let avatar: String?
    let gender: String?
    let birthday: Int?
    let region: String?
    let bio: String?
    let occupation: String?
    let interests: String?
    let phone: String?
    let email: String?
}

struct PasswordChangeForm: Codable {
    let oldPassword: String?
    let newPassword: String?
    let confirmPassword: String?
    let verifyCode: String?
}

struct UserAddressUpdateForm: Codable {
    let name: String?
    let phone: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let addressDetail: String?
    let postalCode: String?
    let isDefault: Bool?
}

struct PlusApiResultUserAddressVO: Codable {
    let data: UserAddressVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserAddressVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let phone: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let addressDetail: String?
    let postalCode: String?
    let isDefault: Bool?
    let fullAddress: String?
}

struct TenantUpdateForm: Codable {
    let name: String?
    let description: String?
    let contactPerson: String?
    let contactPhone: String?
    let expireTime: String?
}

struct PlusApiResultTenantVO: Codable {
    let data: TenantVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TenantVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let type: String?
    let bizType: String?
    let status: String?
    let description: String?
    let contactPerson: String?
    let contactPhone: String?
    let expireTime: String?
}

struct ShopUpdateForm: Codable {
    let name: String?
    let description: String?
    let logoUrl: String?
    let coverUrl: String?
    let contactPhone: String?
    let contactEmail: String?
    let address: String?
    let latitude: Double?
    let longitude: Double?
    let licenseNumber: String?
    let tags: [String]?
    let businessHours: String?
}

struct PlusApiResultShopVO: Codable {
    let data: ShopVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShopVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let description: String?
    let logoUrl: String?
    let coverUrl: String?
    let contactPhone: String?
    let contactEmail: String?
    let address: String?
    let latitude: Double?
    let longitude: Double?
    let licenseNumber: String?
    let tags: [String]?
    let businessHours: String?
    let status: String?
    let statusName: String?
    let ownerId: String?
    let ownerName: String?
}

struct ShareUpdateForm: Codable {
    let shareId: String?
    let title: String?
    let description: String?
    let imageUrl: String?
    let expireSeconds: Int?
    let passwordRequired: Bool?
    let password: String?
    let status: String?
}

struct PlusApiResultShareRecordVO: Codable {
    let data: ShareRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShareRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let shareId: String?
    let shareType: String?
    let title: String?
    let createTime: String?
    let expireTime: String?
    let status: String?
    let visitCount: Int?
}

struct SettingsUpdateForm: Codable {
    let settings: [String: Any]?
    let module: String?
    let overwrite: Bool?
}

struct UISettingsUpdateForm: Codable {
    let theme: String?
    let language: String?
    let fontSize: String?
    let zoomLevel: Int?
    let notificationsEnabled: Bool?
    let shortcutsEnabled: Bool?
    let sidebarState: String?
    let autoSaveEnabled: Bool?
}

struct ThemeSwitchForm: Codable {
    let theme: String?
}

struct LanguageSwitchForm: Codable {
    let language: String?
}

struct SecuritySettingsUpdateForm: Codable {
    let twoFactorEnabled: Bool?
    let biometricEnabled: Bool?
    let autoLockEnabled: Bool?
    let autoLockMinutes: Int?
    let loginNotificationsEnabled: Bool?
    let ipRestrictionEnabled: Bool?
    let allowedIps: [String]?
    let passwordStrengthCheckEnabled: Bool?
    let passwordExpiryDays: Int?
}

struct TwoFactorToggleForm: Codable {
    let enable: Bool?
    let method: String?
    let verificationCode: String?
}

struct PlusApiResultTwoFactorSetupVO: Codable {
    let data: TwoFactorSetupVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TwoFactorSetupVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let enabled: Bool?
    let method: String?
    let qrCodeData: String?
    let secretKey: String?
    let verificationCode: String?
    let recoveryCodes: [String]?
}

struct PrivacySettingsUpdateForm: Codable {
    let dataCollectionEnabled: Bool?
    let personalizedRecommendationsEnabled: Bool?
    let thirdPartyAnalyticsEnabled: Bool?
    let notificationsEnabled: Bool?
    let usageDataSharingEnabled: Bool?
    let autoSaveEnabled: Bool?
    let dataRetentionDays: Int?
    let aiLearningEnabled: Bool?
}

struct PromptUpdateForm: Codable {
    let title: String?
    let content: String?
    let description: String?
    let cateId: Int?
    let enabled: Bool?
    let sort: Int?
    let parameters: [String: Any]?
    let model: String?
    let isPublic: Bool?
}

struct PlusApiResultPromptVO: Codable {
    let data: PromptVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PromptVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let title: String?
    let content: String?
    let type: String?
    let bizType: String?
    let description: String?
    let cateId: Int?
    let enabled: Bool?
    let sort: Int?
    let parameters: [String: Any]?
    let creator: String?
    let model: String?
    let tags: TagsContent?
    let usageCount: Int?
    let avgResponseTime: Int?
    let version: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let favoriteCount: Int?
    let lastUsedAt: String?
}

struct TagsContent: Codable {
    let tags: [String]?
    let children: [TagsContent]?
}

struct ProjectUpdateRequest: Codable {
    let name: String?
    let description: String?
    let type: String?
    let tags: [String]?
    let isPublic: Bool?
}

struct ProjectMoveRequest: Codable {
    let targetWorkspaceId: String?
}

struct PartnerUpdateForm: Codable {
    let name: String?
    let contactName: String?
    let contactPhone: String?
    let contactEmail: String?
}

struct PartnerVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let partnerId: String?
    let name: String?
    let level: String?
    let status: String?
    let promotionCode: String?
    let contactName: String?
    let contactPhone: String?
    let totalCommission: Double?
    let withdrawableCommission: Double?
}

struct PlusApiResultPartnerVO: Codable {
    let data: PartnerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NotificationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let notificationId: String?
    let title: String?
    let content: String?
    let type: String?
    let status: String?
    let source: String?
    let link: String?
    let isRead: Bool?
    let readAt: String?
}

struct PlusApiResultNotificationVO: Codable {
    let data: NotificationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NotificationSettingsUpdateForm: Codable {
    let enablePush: Bool?
    let enableEmail: Bool?
    let enableSms: Bool?
    let enableInApp: Bool?
    let quietHoursStart: String?
    let quietHoursEnd: String?
    let notificationSound: String?
    let vibrationEnabled: Bool?
}

struct PlusApiResultNotificationSettingsVO: Codable {
    let data: NotificationSettingsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NotificationTypeSettingsForm: Codable {
    let type: String?
    let enabled: Bool?
    let pushMethod: String?
    let needReminder: Bool?
}

struct NotificationBatchReadForm: Codable {
    let notificationIds: [String]?
}

struct NoteUpdateRequest: Codable {
    let title: String?
    let content: String?
    let tags: [String]?
}

struct NoteOperationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let noteId: Int?
    let uuid: String?
    let title: String?
    let operationType: String?
    let operationTime: String?
    let message: String?
}

struct PlusApiResultNoteOperationVO: Codable {
    let data: NoteOperationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NoteMoveRequest: Codable {
    let folderId: String?
}

struct NoteFolderUpdateRequest: Codable {
    let name: String?
}

struct NoteFolderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let parentId: Int?
    let parentName: String?
    let path: String?
    let subFolderCount: Int?
    let noteCount: Int?
    let children: [NoteFolderVO]?
}

struct PlusApiResultNoteFolderVO: Codable {
    let data: NoteFolderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NewsUpdateForm: Codable {
    let title: String?
    let summary: String?
    let url: String?
    let source: String?
}

struct NewsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let newsId: String?
    let title: String?
    let summary: String?
    let url: String?
    let source: String?
    let categoryId: Int?
    let publishTime: String?
}

struct PlusApiResultNewsVO: Codable {
    let data: NewsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MusicUpdateForm: Codable {
    let title: String?
    let description: String?
}

struct MusicVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let musicId: String?
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let artist: String?
    let genre: String?
    let thumbnailUrl: String?
    let status: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let playCount: Int?
    let likeCount: Int?
}

struct PlusApiResultMusicVO: Codable {
    let data: MusicVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InvoiceUpdateForm: Codable {
    let title: String?
    let taxNo: String?
    let bankName: String?
    let bankAccount: String?
    let registerAddress: String?
    let registerPhone: String?
}

struct InvoiceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let invoiceId: String?
    let title: String?
    let titleType: String?
    let taxNo: String?
    let type: String?
    let status: String?
    let invoiceCode: String?
    let invoiceNo: String?
    let totalAmount: Double?
    let currency: String?
}

struct PlusApiResultInvoiceVO: Codable {
    let data: InvoiceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ImageUpdateForm: Codable {
    let title: String?
    let description: String?
}

struct ImageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let imageId: String?
    let title: String?
    let description: String?
    let url: String?
    let format: String?
    let width: Int?
    let height: Int?
    let aspectRatio: String?
    let status: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let viewCount: Int?
    let likeCount: Int?
}

struct PlusApiResultImageVO: Codable {
    let data: ImageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerationStyleUpdateForm: Codable {
    let name: String?
    let description: String?
    let configParams: [String: Any]?
}

struct GenerationStyleVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let styleId: String?
    let name: String?
    let description: String?
    let type: String?
    let isPublic: Bool?
    let status: String?
    let usageCount: Int?
    let coverImageUrl: String?
}

struct PlusApiResultGenerationStyleVO: Codable {
    let data: GenerationStyleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FileSystemRenameForm: Codable {
    let name: String?
}

struct FileSystemNodeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let nodeId: String?
    let nodeUuid: String?
    let name: String?
    let type: String?
    let directory: Bool?
    let diskId: String?
    let parentId: String?
    let path: String?
    let relativePath: String?
    let objectKey: String?
    let size: Int?
    let mimeType: String?
    let extension: String?
    let assetType: String?
    let status: String?
    let description: String?
    let tags: [String]?
    let versionId: String?
    let uploadStatus: String?
}

struct PlusApiResultFileSystemNodeVO: Codable {
    let data: FileSystemNodeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FileSystemMoveForm: Codable {
    let targetParentId: String?
    let targetDiskId: String?
}

struct FileSystemContentUpdateForm: Codable {
    let text: String?
    let contents: [String: String]?
    let prompt: String?
    let thinkingContent: String?
    let encoding: String?
    let bumpVersion: Bool?
}

struct FileSystemContentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let nodeId: String?
    let nodeUuid: String?
    let contentId: String?
    let fileVersion: String?
    let encoding: String?
    let prompt: String?
    let thinkingContent: String?
    let text: String?
    let contents: [String: String]?
    let charCount: Int?
    let wordCount: Int?
}

struct PlusApiResultFileSystemContentVO: Codable {
    let data: FileSystemContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FeedbackDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let content: String?
    let contact: String?
    let attachmentUrl: String?
    let screenshotUrl: String?
    let status: String?
    let submitTime: String?
    let processTime: String?
    let followUps: [FeedbackFollowUpVO]?
}

struct FeedbackFollowUpVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let feedbackId: String?
    let content: String?
    let attachmentUrl: String?
    let followUpTime: String?
    let follower: String?
}

struct PlusApiResultFeedbackDetailVO: Codable {
    let data: FeedbackDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteMoveForm: Codable {
    let favoriteId: String?
    let targetFolderId: String?
    let folderId: String?
}

struct FavoriteVO: Codable {
    let favoriteId: String?
    let favoriteType: String?
    let targetId: String?
    let favoriteName: String?
    let folderId: String?
    let favoriteTime: String?
    let updateTime: String?
}

struct PlusApiResultFavoriteVO: Codable {
    let data: FavoriteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteFolderUpdateForm: Codable {
    let folderId: String?
    let folderName: String?
    let parentFolderId: String?
    let folderDescription: String?
}

struct FavoriteFolderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let folderId: String?
    let folderName: String?
    let parentFolderId: String?
    let folderDescription: String?
    let subFolders: [FavoriteFolderVO]?
    let favoriteItems: [FavoriteItemVO]?
    let createTime: String?
    let updateTime: String?
    let favoriteCount: Int?
}

struct FavoriteItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let favoriteId: String?
    let favoriteType: String?
    let targetId: String?
    let favoriteName: String?
    let folderId: String?
    let favoriteTime: String?
    let updateTime: String?
}

struct PlusApiResultFavoriteFolderVO: Codable {
    let data: FavoriteFolderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteBatchMoveForm: Codable {
    let favoriteIds: [String]?
    let targetFolderId: String?
    let folderId: String?
}

struct DriveRenameForm: Codable {
    let name: String?
}

struct DriveItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let itemId: String?
    let itemUuid: String?
    let itemName: String?
    let fileType: String?
    let directory: Bool?
    let assetType: String?
    let mimeType: String?
    let extension: String?
    let size: Int?
    let parentId: String?
    let path: String?
    let objectKey: String?
    let status: String?
    let resource: FileMediaResource?
    let coverImage: ImageMediaResource?
}

struct FileMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let width: Int?
    let height: Int?
    let duration: Int?
    let mimeType: String?
}

struct ImageMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let width: Int?
    let height: Int?
    let splitImages: ImageMediaResource?
    let aspectRatio: String?
}

struct PlusApiResultDriveItemVO: Codable {
    let data: DriveItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DriveMoveForm: Codable {
    let targetFolderId: String?
}

struct DriveContentUpdateForm: Codable {
    let text: String?
    let contents: [String: String]?
    let prompt: String?
    let thinkingContent: String?
    let encoding: String?
}

struct DriveContentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let fileId: String?
    let fileUuid: String?
    let fileVersion: String?
    let contentId: String?
    let encoding: String?
    let prompt: String?
    let thinkingContent: String?
    let text: String?
    let contents: [String: String]?
}

struct PlusApiResultDriveContentVO: Codable {
    let data: DriveContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DocumentUpdateRequest: Codable {
    let title: String?
    let folderId: String?
    let description: String?
    let tags: [String]?
}

struct DocumentOperationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let operationType: String?
    let message: String?
    let documentId: String?
    let documentUuid: String?
    let title: String?
    let operationTime: String?
}

struct PlusApiResultDocumentOperationVO: Codable {
    let data: DocumentOperationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DocumentContentUpdateRequest: Codable {
    let text: String?
    let contents: [String: String]?
    let prompt: String?
    let thinkingContent: String?
    let encoding: String?
}

struct DocumentContentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let documentId: String?
    let documentUuid: String?
    let contentId: String?
    let versionId: String?
    let encoding: String?
    let prompt: String?
    let thinkingContent: String?
    let text: String?
    let contents: [String: String]?
    let charCount: Int?
    let wordCount: Int?
}

struct PlusApiResultDocumentContentVO: Codable {
    let data: DocumentContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShortcutItemForm: Codable {
    let id: String?
    let name: String?
    let icon: String?
    let url: String?
    let sort: Int?
    let type: String?
}

struct ShortcutsUpdateForm: Codable {
    let shortcuts: [ShortcutItemForm]?
}

struct CollectionUpdateForm: Codable {
    let name: String?
    let description: String?
    let coverImage: String?
}

struct CollectionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let collectionId: String?
    let name: String?
    let description: String?
    let type: String?
    let coverImage: String?
    let isPublic: Bool?
    let isPinned: Bool?
    let itemCount: Int?
    let viewCount: Int?
    let favoriteCount: Int?
    let parentId: Int?
}

struct PlusApiResultCollectionVO: Codable {
    let data: CollectionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CollectionItemPositionForm: Codable {
    let itemIds: [Int]?
}

struct ChatSessionUpdateForm: Codable {
    let sessionId: Int?
    let name: String?
    let description: String?
    let modelId: String?
    let systemPrompt: String?
    let temperature: Double?
    let maxTokens: Int?
    let topP: Double?
    let status: String?
}

struct CharacterUpdateForm: Codable {
    let name: String?
    let description: String?
    let personality: String?
    let background: String?
}

struct CharacterVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let characterId: String?
    let name: String?
    let type: String?
    let description: String?
    let avatar: ImageMediaResource?
    let status: String?
    let agentId: Int?
    let isPublic: Bool?
    let usageCount: Int?
    let likeCount: Int?
}

struct PlusApiResultCharacterVO: Codable {
    let data: CharacterVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CategoryUpdateForm: Codable {
    let name: String?
    let icon: String?
    let description: String?
    let sort: Int?
    let status: Int?
}

struct CategoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let code: String?
    let icon: String?
    let description: String?
    let parentId: Int?
    let sort: Int?
    let status: Int?
}

struct PlusApiResultCategoryVO: Codable {
    let data: CategoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CategoryMoveForm: Codable {
    let targetParentId: Int?
}

struct CategorySortForm: Codable {
    let categoryId: String?
}

struct UpdateCartItemForm: Codable {
    let quantity: Int?
}

struct CartItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let itemId: String?
    let uuid: String?
    let cartId: String?
    let cartGroupUuid: String?
    let productId: String?
    let skuId: String?
    let skuName: String?
    let skuCode: String?
    let skuImage: String?
    let skuPrice: Double?
    let quantity: Int?
    let price: Double?
    let totalPrice: Double?
    let selected: Bool?
}

struct PlusApiResultCartItemVO: Codable {
    let data: CartItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BatchSelectForm: Codable {
    let itemIds: [Int]?
    let selected: Bool?
}

struct AssetRenameForm: Codable {
    let name: String?
}

struct AssetMoveForm: Codable {
    let folderId: String?
}

struct AppUpdateForm: Codable {
    let name: String?
    let description: String?
    let accessUrl: String?
}

struct AppVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let appId: String?
    let name: String?
    let description: String?
    let icon: ImageMediaResource?
    let iconUrl: String?
    let accessUrl: String?
    let version: String?
    let appType: String?
    let status: String?
    let projectId: Int?
}

struct PlusApiResultAppVO: Codable {
    let data: AppVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AdvertSettingsUpdateForm: Codable {
    let enabled: Bool?
    let personalized: Bool?
    let maxDailyAds: Int?
    let adBlockLevel: String?
    let rewardVideoEnabled: Bool?
    let interstitialEnabled: Bool?
    let bannerEnabled: Bool?
}

struct WorkspaceCreateForm: Codable {
    let workspaceName: String?
    let workspaceDescription: String?
    let workspaceIcon: String?
    let workspaceColor: String?
    let workspaceType: String?
    let members: [WorkspaceMember]?
    let settings: WorkspaceSettings?
}

struct WorkspaceMember: Codable {
    let userId: String?
    let roleId: String?
    let roleName: String?
    let permissions: [String]?
}

struct ProjectCreateForm: Codable {
    let workspaceId: String?
    let projectName: String?
    let projectDescription: String?
    let projectType: String?
    let projectIcon: String?
    let projectColor: String?
    let projectTags: [String]?
    let members: [ProjectMember]?
    let settings: ProjectSettings?
}

struct ProjectMember: Codable {
    let userId: String?
    let roleId: String?
    let roleName: String?
    let permissions: [String]?
}

struct ProjectCopyForm: Codable {
    let sourceProjectId: String?
    let targetWorkspaceId: String?
    let newName: String?
    let newProjectDescription: String?
    let copyMembers: Bool?
    let copyFiles: Bool?
    let copySettings: Bool?
    let copyReason: String?
}

struct MemberInviteForm: Codable {
    let workspaceId: String?
    let emails: [String]?
    let roleId: String?
    let roleName: String?
    let permissions: [String]?
    let inviteMessage: String?
    let expireHours: Int?
    let needApproval: Bool?
}

struct VoteForm: Codable {
    let contentType: String?
    let contentId: Int?
    let rating: String?
    let source: String?
    let deviceInfo: String?
}

struct PlusApiResultVoteVO: Codable {
    let data: VoteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoteVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let voteId: String?
    let contentType: String?
    let contentId: Int?
    let rating: String?
}

struct VipPurchaseForm: Codable {
    let packId: Int?
    let couponId: String?
    let paymentMethod: String?
}

struct PlusApiResultVipPurchaseVO: Codable {
    let data: VipPurchaseVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipPurchaseVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: String?
    let packId: Int?
    let packName: String?
    let amount: Double?
    let durationDays: Int?
    let targetLevelId: Int?
    let targetLevelName: String?
    let status: String?
}

struct VipUpgradeForm: Codable {
    let targetLevelId: Int?
    let couponId: String?
    let paymentMethod: String?
}

struct VipRenewForm: Codable {
    let duration: Int?
    let packId: Int?
    let couponId: String?
    let paymentMethod: String?
}

struct SpeedUpForm: Codable {
    let taskId: String?
}

struct PlusApiResultVipDailyRewardVO: Codable {
    let data: VipDailyRewardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipDailyRewardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let rewardPoints: Int?
    let claimedAt: String?
    let message: String?
    let consecutiveDays: Int?
}

struct VipInviteForm: Codable {
    let email: String?
    let phone: String?
    let channel: String?
}

struct PlusApiResultVipInviteVO: Codable {
    let data: VipInviteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipInviteVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let inviteId: String?
    let email: String?
    let phone: String?
    let status: String?
}

struct VideoCreateForm: Codable {
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let width: Int?
    let height: Int?
    let categoryId: Int?
}

struct AccountDeactivateForm: Codable {
    let reason: String?
    let verifyCode: String?
    let password: String?
    let confirm: Bool?
    let remark: String?
}

struct ThirdPartyBindForm: Codable {
    let platform: String?
    let code: String?
    let thirdPartyUserId: String?
    let thirdPartyUserName: String?
    let thirdPartyAvatar: String?
    let accessToken: String?
    let refreshToken: String?
    let expireTime: String?
}

struct PlusApiResultMapStringString: Codable {
    let data: [String: String]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserAddressCreateForm: Codable {
    let name: String?
    let phone: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let addressDetail: String?
    let postalCode: String?
    let isDefault: Bool?
}

struct PlusApiResultUploadPolicyVO: Codable {
    let data: UploadPolicyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UploadPolicyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let bucketName: String?
    let objectKeyPrefix: String?
    let expirationTime: String?
    let maxFileSize: Int?
    let minFileSize: Int?
    let allowedContentTypes: [String]?
    let allowOverwrite: Bool?
    let callbackUrl: String?
}

struct PlusApiResultUploadCredentialsVO: Codable {
    let data: UploadCredentialsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UploadCredentialsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let accessKeyId: String?
    let secretAccessKey: String?
    let sessionToken: String?
    let expirationTime: String?
    let bucket: String?
    let region: String?
}

struct PresignedUrlForm: Codable {
    let objectKey: String?
    let bucket: String?
    let method: String?
    let expirationSeconds: Int?
}

struct PlusApiResultPresignedUrlVO: Codable {
    let data: PresignedUrlVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PresignedUrlVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let url: String?
    let previewUrl: String?
    let objectKey: String?
}

struct FileVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let fileId: String?
    let fileName: String?
    let fileSize: Int?
    let fileType: String?
    let extension: String?
    let objectKey: String?
    let path: String?
    let diskId: String?
    let status: String?
    let uploadStatus: String?
    let contentType: String?
    let fileCategory: String?
    let assetType: String?
    let accessUrl: String?
    let uploadTime: String?
}

struct PlusApiResultFileVO: Codable {
    let data: FileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListFileVO: Codable {
    let data: [FileVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUploadChunkVO: Codable {
    let data: UploadChunkVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UploadChunkVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let uploadId: String?
    let chunkIndex: Int?
    let chunkSize: Int?
    let status: String?
    let success: Bool?
    let errorMsg: String?
    let chunkMd5: String?
    let uploadedSize: Int?
    let remainingChunks: Int?
    let progress: Int?
}

struct UploadInitForm: Codable {
    let fileName: String?
    let fileSize: Int?
    let fileMd5: String?
    let fileType: String?
    let uploadType: String?
    let chunkSize: Int?
    let totalChunks: Int?
    let storagePath: String?
    let businessType: String?
    let businessId: String?
}

struct PlusApiResultUploadInitVO: Codable {
    let data: UploadInitVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UploadInitVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let uploadId: String?
    let fileName: String?
    let fileSize: Int?
    let chunkSize: Int?
    let totalChunks: Int?
    let storagePath: String?
    let uploadUrl: String?
    let uploadParams: Any?
    let uploadedChunks: [Int]?
    let expireTime: Int?
    let supportResume: Bool?
    let uploadType: String?
}

struct TenantCreateForm: Codable {
    let name: String?
    let code: String?
    let type: String?
    let bizType: String?
    let bizId: Int?
    let description: String?
    let adminUserId: Int?
    let contactPerson: String?
    let contactPhone: String?
    let expireTime: String?
}

struct SendMessageForm: Codable {
    let recipientId: String?
    let content: String?
    let messageType: String?
    let conversationId: String?
    let attachmentUrl: String?
}

struct PlusApiResultPrivateMessageVO: Codable {
    let data: PrivateMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PrivateMessageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let messageId: String?
    let senderId: String?
    let recipientId: String?
    let content: String?
    let messageType: String?
    let sendTime: String?
    let isRead: Bool?
    let attachmentUrl: String?
}

struct FollowVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let isFollowing: Bool?
    let userId: String?
}

struct PlusApiResultFollowVO: Codable {
    let data: FollowVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BatchFollowCheckForm: Codable {
    let userIds: [String]?
    let checkType: String?
}

struct FollowCheckVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let isFollowing: Bool?
    let followTime: String?
    let isFollowedBy: Bool?
}

struct PlusApiResultListFollowCheckVO: Codable {
    let data: [FollowCheckVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShopCreateForm: Codable {
    let name: String?
    let description: String?
    let logoUrl: String?
    let coverUrl: String?
    let contactPhone: String?
    let contactEmail: String?
    let address: String?
    let latitude: Double?
    let longitude: Double?
    let licenseNumber: String?
    let tags: [String]?
    let businessHours: String?
}

struct ShareCreateForm: Codable {
    let shareType: String?
    let contentId: String?
    let title: String?
    let description: String?
    let imageUrl: String?
    let expireSeconds: Int?
    let passwordRequired: Bool?
    let password: String?
    let channel: String?
}

struct PlusApiResultShareCreateVO: Codable {
    let data: ShareCreateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShareCreateVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let shareId: String?
    let shareUrl: String?
    let qrCode: String?
    let expireTime: String?
    let password: String?
}

struct ShareVisitForm: Codable {
    let shareId: String?
    let visitType: String?
    let userAgent: String?
    let ipAddress: String?
    let deviceInfo: String?
}

struct ShareVerifyForm: Codable {
    let shareId: String?
    let password: String?
    let verificationCode: String?
}

struct PlusApiResultShareVerifyVO: Codable {
    let data: ShareVerifyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShareInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let shareId: String?
    let shareType: String?
    let title: String?
    let description: String?
    let imageUrl: String?
    let shareUrl: String?
    let createTime: String?
    let expireTime: String?
    let status: String?
    let visitCount: Int?
}

struct ShareVerifyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let valid: Bool?
    let errorMessage: String?
    let shareInfo: ShareInfoVO?
}

struct ShareTrackForm: Codable {
    let shareId: String?
    let trackType: String?
    let userAgent: String?
    let ipAddress: String?
    let deviceInfo: String?
}

struct SharePosterForm: Codable {
    let shareType: String?
    let shareId: String?
    let template: String?
    let backgroundColor: String?
    let textColor: String?
    let includeQrCode: Bool?
    let customText: String?
}

struct PlusApiResultSharePosterVO: Codable {
    let data: SharePosterVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SharePosterVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let posterUrl: String?
    let width: Int?
    let height: Int?
    let fileSize: String?
}

struct InviteRewardClaimVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let amount: String?
    let balance: String?
    let transactionId: String?
}

struct PlusApiResultInviteRewardClaimVO: Codable {
    let data: InviteRewardClaimVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InviteLinkForm: Codable {
    let inviteType: String?
    let expireSeconds: Int?
    let inviteCode: String?
    let channel: String?
}

struct InviteLinkVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let inviteLink: String?
    let inviteCode: String?
    let expireTime: String?
    let qrCode: String?
}

struct PlusApiResultInviteLinkVO: Codable {
    let data: InviteLinkVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DataExportForm: Codable {
    let format: String?
    let dataType: String?
    let includeMedia: Bool?
    let startTime: String?
    let endTime: String?
    let email: String?
}

struct DataExportVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let status: String?
    let downloadUrl: String?
    let fileSize: String?
    let estimatedCompletionTime: String?
    let progress: Int?
    let errorMessage: String?
}

struct PlusApiResultDataExportVO: Codable {
    let data: DataExportVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SearchHistoryAddRequest: Codable {
    let keyword: String?
}

struct AdvancedSearchRequest: Codable {
    let keyword: String?
    let type: String?
    let filters: [String: Any]?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageSearchResult: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [SearchResult]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PageableObject: Codable {
    let offset: Int?
    let sort: SortObject?
    let paged: Bool?
    let pageNumber: Int?
    let pageSize: Int?
    let unpaged: Bool?
}

struct PlusApiResultPageSearchResult: Codable {
    let data: PageSearchResult?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SearchResult: Codable {
    let id: String?
    let title: String?
    let content: String?
    let type: String?
    let path: String?
}

struct SortObject: Codable {
    let empty: Bool?
    let sorted: Bool?
    let unsorted: Bool?
}

struct PromptCreateForm: Codable {
    let title: String?
    let content: String?
    let type: String?
    let bizType: String?
    let description: String?
    let cateId: Int?
    let sort: Int?
    let parameters: [String: Any]?
    let model: String?
    let isPublic: Bool?
}

struct ProjectCreateRequest: Codable {
    let name: String?
    let description: String?
    let workspaceId: String?
    let type: String?
    let tags: [String]?
    let isPublic: Bool?
}

struct ProjectCopyRequest: Codable {
    let targetWorkspaceId: String?
    let newName: String?
}

struct PaymentCreateForm: Codable {
    let orderId: String?
    let businessType: String?
    let businessOrderId: String?
    let amount: String?
    let paymentMethod: String?
    let paymentScene: String?
    let clientIp: String?
    let paymentProvider: String?
    let productType: String?
}

struct PaymentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let paymentOrderId: String?
    let merchantOrderId: String?
    let status: String?
    let amount: String?
    let paymentMethod: String?
    let paymentUrl: String?
    let qrCode: String?
    let paymentId: Int?
    let paymentSn: String?
    let orderId: Int?
    let subject: String?
    let paymentProvider: String?
    let paymentProviderName: String?
    let productType: String?
    let productTypeName: String?
    let statusName: String?
    let expireTime: String?
    let needQuery: Bool?
    let queryInterval: Int?
    let remark: String?
    let paymentParams: [String: Any]?
    let transactionId: String?
    let outTradeNo: String?
    let successTime: String?
}

struct PlusApiResultPaymentVO: Codable {
    let data: PaymentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PartnerCreateForm: Codable {
    let name: String?
    let contactName: String?
    let contactPhone: String?
    let contactEmail: String?
    let level: String?
    let parentId: Int?
}

struct CommissionForm: Codable {
    let amount: Double?
}

struct OrganizationCreateForm: Codable {
    let name: String?
    let code: String?
    let description: String?
    let parentId: Int?
    let contactPerson: String?
    let contactPhone: String?
    let contactEmail: String?
    let address: String?
    let website: String?
    let logoUrl: String?
}

struct OrganizationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let status: String?
    let description: String?
    let contactPerson: String?
    let contactPhone: String?
    let contactEmail: String?
    let logoUrl: String?
}

struct PlusApiResultOrganizationVO: Codable {
    let data: OrganizationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PositionCreateForm: Codable {
    let name: String?
    let code: String?
    let description: String?
    let ownerId: Int?
    let parentId: Int?
    let level: Int?
    let sortOrder: Int?
    let category: String?
    let requiredExperienceYears: Int?
    let requiredEducation: String?
    let maxMemberCount: Int?
}

struct PlusApiResultPositionVO: Codable {
    let data: PositionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PositionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let description: String?
    let ownerId: Int?
    let parentId: Int?
    let level: Int?
    let isActive: Bool?
    let sortOrder: Int?
    let category: String?
    let levelName: String?
}

struct DepartmentCreateForm: Codable {
    let name: String?
    let code: String?
    let description: String?
    let ownerId: Int?
    let parentId: Int?
    let sortOrder: Int?
    let managerId: Int?
    let phone: String?
    let email: String?
}

struct DepartmentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let description: String?
    let ownerId: Int?
    let parentId: Int?
    let level: Int?
    let isActive: Bool?
    let sortOrder: Int?
    let fullPathName: String?
}

struct PlusApiResultDepartmentVO: Codable {
    let data: DepartmentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderCreateForm: Codable {
    let orderType: String?
    let productId: String?
    let quantity: Int?
    let items: [OrderItemForm]?
    let addressId: String?
    let paymentMethod: String?
    let couponId: String?
    let remark: String?
    let sourceChannel: String?
    let rechargePoints: Int?
}

struct OrderItemForm: Codable {
    let productId: String?
    let quantity: Int?
    let price: String?
    let productName: String?
}

struct OrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: String?
    let orderSn: String?
    let orderType: String?
    let subject: String?
    let productImage: String?
    let quantity: Int?
    let totalAmount: String?
    let paidAmount: String?
    let paidPointsAmount: String?
    let discountAmount: String?
    let shippingAmount: String?
    let status: String?
    let statusName: String?
    let refundStatus: String?
    let paymentMethod: String?
    let paymentProvider: String?
    let payTime: String?
    let expireTime: String?
    let remark: String?
}

struct PlusApiResultOrderVO: Codable {
    let data: OrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RefundApplyForm: Codable {
    let orderId: String?
    let refundAmount: String?
    let refundReason: String?
    let reason: String?
    let refundType: String?
    let proofImage: String?
}

struct OrderPayForm: Codable {
    let orderId: String?
    let paymentMethod: String?
    let amount: String?
    let paymentPassword: String?
    let clientIp: String?
}

struct PaymentParamsVO: Codable {
    let orderId: String?
    let amount: String?
    let paymentMethod: String?
}

struct PlusApiResultPaymentParamsVO: Codable {
    let data: PaymentParamsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderCancelForm: Codable {
    let orderId: String?
    let cancelReason: String?
    let reason: String?
    let cancelType: String?
}

struct TestNotificationForm: Codable {
    let title: String?
    let content: String?
    let type: String?
    let deviceId: String?
}

struct TopicSubscribeForm: Codable {
    let topic: String?
    let subscribe: Bool?
    let deviceId: String?
}

struct DeviceRegisterForm: Codable {
    let deviceType: String?
    let deviceId: String?
    let pushToken: String?
    let osVersion: String?
    let appVersion: String?
}

struct NoteCreateRequest: Codable {
    let title: String?
    let content: String?
    let folderId: String?
    let tags: [String]?
}

struct NoteCopyRequest: Codable {
    let folderId: String?
    let title: String?
}

struct NoteFolderCreateRequest: Codable {
    let name: String?
    let parentId: String?
}

struct NewsCreateForm: Codable {
    let title: String?
    let summary: String?
    let url: String?
    let source: String?
    let categoryId: Int?
}

struct MusicCreateForm: Codable {
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let artist: String?
    let genre: String?
}

struct ModelPriceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let model: String?
    let unit: String?
    let currency: String?
    let price: Double?
    let inputPrice: Double?
    let outputPrice: Double?
    let batchInputPrice: Double?
    let batchOutputPrice: Double?
    let cachedInputPrice: Double?
    let batchCachedInputPrice: Double?
}

struct PlusApiResultListModelPriceVO: Codable {
    let data: [ModelPriceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InvoiceCreateForm: Codable {
    let title: String?
    let titleType: String?
    let taxNo: String?
    let type: String?
    let totalAmount: Double?
}

struct InvoiceCancelForm: Codable {
    let cancelReason: String?
}

struct ImageCreateForm: Codable {
    let title: String?
    let description: String?
    let url: String?
    let format: String?
    let width: Int?
    let height: Int?
}

struct BrowseHistoryAddForm: Codable {
    let type: String?
    let targetId: String?
    let targetName: String?
    let targetDescription: String?
    let targetIcon: String?
    let duration: Int?
    let source: String?
}

struct AssetMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let image: ImageMediaResource?
    let video: VideoMediaResource?
    let audio: AudioMediaResource?
    let music: MusicMediaResource?
    let character: CharacterMediaResource?
    let file: FileMediaResource?
    let extraProps: [String: Any]?
}

struct AudioMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let format: String?
    let bitRate: Int?
    let sampleRate: Int?
    let channels: Int?
    let duration: Int?
}

struct CharacterMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let characterType: String?
    let gender: String?
    let ageGroup: String?
    let avatarUrl: String?
    let avatarVideoUrl: String?
    let speakerId: Int?
    let appearanceParams: [String: Any]?
    let animationParams: [String: Any]?
}

struct MusicMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let format: String?
    let duration: Int?
}

struct VideoMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let duration: Int?
    let width: Int?
    let height: Int?
}

struct VoiceSpeakerGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let speakerName: String?
    let text: String?
    let speakerId: String?
    let language: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let format: String?
    let emotion: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct AssetMediaResourceList: Codable {
    let images: [ImageMediaResource]?
    let videos: [VideoMediaResource]?
    let audios: [AudioMediaResource]?
    let files: [FileMediaResource]?
    let musics: [MusicMediaResource]?
    let resources: [AssetMediaResource]?
}

struct AudioEffectGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let description: String?
    let category: String?
    let duration: Int?
    let sampleRate: Int?
    let bitRate: Int?
    let channels: Int?
    let loop: Bool?
    let fadeIn: Double?
    let fadeOut: Double?
    let referenceAssetCount: Int?
}

struct AudioGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let text: String?
    let voice: String?
    let voiceSpeakerId: Int?
    let language: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let sampleRate: Int?
    let bitRate: Int?
    let channels: Int?
    let emotion: String?
    let referenceAssetCount: Int?
}

struct BaseGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let referenceAssetCount: Int?
}

struct CharacterGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let name: String?
    let description: String?
    let appearance: String?
    let personality: String?
    let background: String?
    let type: String?
    let style: String?
    let pose: String?
    let expression: String?
    let gender: String?
    let age: String?
    let clothing: String?
    let width: Int?
    let height: Int?
    let hd: Bool?
    let multiView: Bool?
    let referenceAssetCount: Int?
}

struct GenerationInput: Codable {
    let type: String?
    let image: ImageGenerationInput?
    let video: VideoGenerationInput?
    let audio: AudioGenerationInput?
    let music: MusicGenerationInput?
    let character: CharacterGenerationInput?
    let voiceSpeaker: VoiceSpeakerGenerationInput?
    let audioEffect: AudioEffectGenerationInput?
    let input: BaseGenerationInput?
    let prompt: String?
}

struct GenerationOutput: Codable {
    let resources: [AssetMediaResource]?
    let primaryUrl: String?
    let urls: [String]?
    let durationMs: Int?
    let tokenUsage: Int?
    let cost: Double?
    let modelVersion: String?
    let seed: Int?
    let metadata: [String: Any]?
    let createdAt: String?
    let resourceCount: Int?
    let primaryResource: AssetMediaResource?
}

struct GenerationTaskVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: Int?
    let requestId: String?
    let type: String?
    let model: String?
    let channel: String?
    let status: String?
    let progress: Int?
    let inputParams: GenerationInput?
    let outputResult: GenerationOutput?
    let cost: Double?
    let errorCode: String?
    let errorMessage: String?
    let retryCount: Int?
    let maxRetry: Int?
    let startedAt: String?
    let completedAt: String?
    let conversationId: Int?
    let messageId: Int?
    let parentId: Int?
    let batchId: String?
    let bizScene: String?
    let bizId: Int?
    let done: Bool?
}

struct ImageGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let width: Int?
    let height: Int?
    let size: String?
    let quality: String?
    let style: String?
    let cfgScale: Double?
    let steps: Int?
    let sampler: String?
    let strength: Double?
    let safetyChecker: Bool?
    let aspectRatio: String?
    let referenceAssetCount: Int?
}

struct MusicGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let lyrics: String?
    let duration: Int?
    let genre: String?
    let style: String?
    let tempo: Int?
    let key: String?
    let timeSignature: String?
    let mood: String?
    let instruments: String?
    let instrumental: Bool?
    let hd: Bool?
    let referenceAssetCount: Int?
}

struct PlusApiResultGenerationTaskVO: Codable {
    let data: GenerationTaskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let width: Int?
    let height: Int?
    let duration: Int?
    let fps: Int?
    let style: String?
    let aspectRatio: String?
    let motionStrength: Int?
    let cameraMotion: String?
    let loop: Bool?
    let hd: Bool?
    let subtitle: Bool?
    let textToVideo: Bool?
    let referenceAssetCount: Int?
}

struct VideoShotItem: Codable {
    let id: String?
    let uuid: String?
    let shotPrompt: String?
    let dialogue: String?
    let duration: Double?
    let startFrame: ImageMediaResource?
    let endFrame: ImageMediaResource?
    let image: ImageMediaResource?
    let resourceList: AssetMediaResourceList?
    let emotion: String?
    let videoDescription: String?
    let video: VideoMediaResource?
}

struct VideoStoryboard: Codable {
    let shots: [VideoShotItem]?
    let finalVideo: VideoMediaResource?
    let finalAudio: AudioMediaResource?
    let title: String?
    let description: String?
    let style: String?
    let aspectRatio: String?
    let prompt: String?
    let duration: Double?
    let speaker: VoiceSpeakerInfo?
}

struct VoiceMotion: Codable {

}

struct VoiceSpeakerGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let text: String?
    let speakerName: String?
    let speakerId: String?
    let language: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let emotion: String?
    let saveSpeaker: Bool?
    let usingExistingSpeaker: Bool?
    let voiceClone: Bool?
    let referenceAssetCount: Int?
}

struct VoiceSpeakerInfo: Codable {
    let channel: String?
    let provider: String?
    let product: String?
    let id: String?
    let models: [String]?
    let speakerId: String?
    let displayName: String?
    let tags: TagsContent?
    let motion: VoiceMotion?
    let style: VoiceStyle?
    let description: String?
}

struct VoiceStyle: Codable {

}

struct VoiceSpeakerCloneForm: Codable {
    let sampleAudioUrl: String?
    let speakerName: String?
    let language: String?
    let model: String?
}

struct VideoGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let width: Int?
    let height: Int?
    let duration: Int?
    let fps: Int?
    let format: String?
    let style: String?
    let aspectRatio: String?
    let motionStrength: Int?
    let cameraMotion: String?
    let loop: Bool?
    let hd: Bool?
    let audioUrls: [String]?
    let type: String?
    let referenceAssetCount: Int?
}

struct VideoStyleTransferForm: Codable {
    let videoUrl: String?
    let style: String?
    let model: String?
}

struct ImageToVideoForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let duration: Int?
    let width: Int?
    let height: Int?
    let format: String?
    let motionStrength: Int?
    let cameraMotion: String?
    let audioUrls: [String]?
    let type: String?
    let referenceAssetCount: Int?
}

struct VideoExtendForm: Codable {
    let videoUrl: String?
    let extendDuration: Int?
    let model: String?
    let style: String?
}

struct GenerationStyleCreateForm: Codable {
    let name: String?
    let description: String?
    let type: String?
    let configParams: [String: Any]?
    let isPublic: Bool?
}

struct SoundEffectGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let description: String?
    let category: String?
    let duration: Int?
    let format: String?
    let loop: Bool?
    let type: String?
    let referenceAssetCount: Int?
}

struct MusicGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let lyrics: String?
    let duration: Int?
    let genre: String?
    let style: String?
    let tempo: Int?
    let key: String?
    let mood: String?
    let instruments: String?
    let format: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct MusicSimilarForm: Codable {
    let referenceUrl: String?
    let duration: Int?
    let model: String?
}

struct MusicRemixForm: Codable {
    let musicUrl: String?
    let style: String?
    let model: String?
}

struct MusicExtendForm: Codable {
    let musicUrl: String?
    let extendDuration: Int?
    let model: String?
    let style: String?
}

struct ImageGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let width: Int?
    let height: Int?
    let size: String?
    let quality: String?
    let style: String?
    let format: String?
    let cfgScale: Double?
    let steps: Int?
    let sampler: String?
    let strength: Double?
    let maskAssets: [AssetMediaResource]?
    let safetyChecker: Bool?
    let aspectRatio: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct ImageVariationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let width: Int?
    let height: Int?
    let format: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct ImageUpscaleForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let scale: Int?
    let targetWidth: Int?
    let targetHeight: Int?
    let format: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct ImageEditForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let maskAssets: [AssetMediaResource]?
    let strength: Double?
    let format: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct CharacterGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let description: String?
    let style: String?
    let pose: String?
    let expression: String?
    let gender: String?
    let age: String?
    let clothing: String?
    let width: Int?
    let height: Int?
    let format: String?
    let hd: Bool?
    let type: String?
    let referenceAssetCount: Int?
}

struct CharacterBatchGenerationForm: Codable {
    let characters: [CharacterItem]?
    let model: String?
}

struct CharacterItem: Codable {
    let description: String?
    let style: String?
    let pose: String?
}

struct PlusApiResultListGenerationTaskVO: Codable {
    let data: [GenerationTaskVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceCloneForm: Codable {
    let sampleAudioUrl: String?
    let text: String?
    let model: String?
    let format: String?
}

struct AudioGenerationForm: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let model: String?
    let channel: String?
    let referenceAssets: [AssetMediaResource]?
    let n: Int?
    let seed: Int?
    let async: Bool?
    let callbackUrl: String?
    let extraParams: [String: Any]?
    let bizScene: String?
    let bizId: Int?
    let conversationId: Int?
    let messageId: Int?
    let text: String?
    let voice: String?
    let language: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let format: String?
    let emotion: String?
    let type: String?
    let referenceAssetCount: Int?
}

struct AudioTranslationForm: Codable {
    let audioUrl: String?
    let targetLanguage: String?
    let model: String?
    let sourceLanguage: String?
    let format: String?
}

struct AudioTranscriptionForm: Codable {
    let audioUrl: String?
    let model: String?
    let language: String?
    let format: String?
}

struct FileSystemCopyForm: Codable {
    let targetParentId: String?
    let targetDiskId: String?
    let name: String?
    let copyContent: Bool?
}

struct FileSystemFolderCreateForm: Codable {
    let name: String?
    let parentId: String?
    let diskId: String?
    let description: String?
    let tags: [String]?
}

struct FileSystemFileCreateForm: Codable {
    let name: String?
    let parentId: String?
    let diskId: String?
    let mimeType: String?
    let assetType: String?
    let description: String?
    let tags: [String]?
    let text: String?
    let contents: [String: String]?
    let prompt: String?
    let thinkingContent: String?
    let encoding: String?
}

struct AuthorInfo: Codable {
    let id: Int?
    let name: String?
    let avatar: String?
    let bio: String?
    let isFollowing: Bool?
}

struct FeedItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let title: String?
    let content: String?
    let summary: String?
    let coverImage: String?
    let contentType: String?
    let tags: [String]?
    let author: AuthorInfo?
    let viewCount: Int?
    let likeCount: Int?
    let commentCount: Int?
    let shareCount: Int?
    let isLiked: Bool?
    let isCollected: Bool?
}

struct PlusApiResultFeedItemVO: Codable {
    let data: FeedItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FeedbackSubmitForm: Codable {
    let type: String?
    let content: String?
    let contact: String?
    let attachmentUrl: String?
    let screenshotUrl: String?
}

struct FeedbackVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let content: String?
    let status: String?
    let submitTime: String?
    let processTime: String?
}

struct PlusApiResultFeedbackVO: Codable {
    let data: FeedbackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FeedbackFollowUpForm: Codable {
    let feedbackId: String?
    let content: String?
    let attachmentUrl: String?
}

struct SupportMessageRequest: Codable {
    let sessionId: String?
    let content: String?
    let attachmentUrl: String?
}

struct PlusApiResultSupportMessageVO: Codable {
    let data: SupportMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SupportMessageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let sessionId: String?
    let content: String?
    let attachmentUrl: String?
    let senderType: String?
    let sendTime: String?
    let read: Bool?
}

struct ReportSubmitForm: Codable {
    let type: String?
    let targetId: String?
    let content: String?
    let attachmentUrl: String?
    let screenshotUrl: String?
}

struct PlusApiResultReportVO: Codable {
    let data: ReportVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ReportVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let targetId: String?
    let status: String?
    let submitTime: String?
    let processTime: String?
}

struct FavoriteAddForm: Codable {
    let favoriteType: String?
    let type: String?
    let targetId: String?
    let favoriteName: String?
    let favoriteDescription: String?
    let folderId: String?
    let tags: String?
}

struct FavoriteFolderCreateForm: Codable {
    let folderName: String?
    let name: String?
    let parentFolderId: String?
    let folderDescription: String?
}

struct CheckItem: Codable {
    let type: String?
    let targetId: String?
}

struct FavoriteBatchCheckForm: Codable {
    let favoriteType: String?
    let targetIds: [String]?
    let items: [CheckItem]?
}

struct FavoriteCheckVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let targetId: String?
    let isFavorite: Bool?
    let favoriteId: String?
    let favoriteTime: String?
}

struct PlusApiResultListFavoriteCheckVO: Codable {
    let data: [FavoriteCheckVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DriveCopyForm: Codable {
    let targetFolderId: String?
    let newName: String?
}

struct DriveBatchDeleteForm: Codable {
    let itemIds: [String]?
}

struct DriveFolderCreateForm: Codable {
    let name: String?
    let parentId: String?
    let diskId: String?
}

struct DocumentCreateRequest: Codable {
    let title: String?
    let content: String?
    let folderId: String?
    let diskId: String?
    let description: String?
    let mimeType: String?
    let tags: [String]?
}

struct DocumentCopyRequest: Codable {
    let folderId: String?
    let title: String?
}

struct DocumentBatchOperationRequest: Codable {
    let type: String?
    let index: Int?
    let startIndex: Int?
    let endIndex: Int?
    let text: String?
    let searchText: String?
    let replaceText: String?
}

struct DocumentBatchUpdateRequest: Codable {
    let requests: [DocumentBatchOperationRequest]?
    let strict: Bool?
}

struct DocumentBatchUpdateResultVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let documentId: String?
    let documentUuid: String?
    let versionId: String?
    let appliedCount: Int?
    let skippedCount: Int?
    let charCount: Int?
    let wordCount: Int?
}

struct PlusApiResultDocumentBatchUpdateResultVO: Codable {
    let data: DocumentBatchUpdateResultVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AchievementRewardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let type: String?
    let amount: Int?
    let description: String?
    let icon: String?
    let status: String?
    let claimedAt: String?
}

struct PlusApiResultAchievementRewardVO: Codable {
    let data: AchievementRewardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CurrencyCreateForm: Codable {
    let code: String?
    let name: String?
    let symbol: String?
    let currencyType: String?
    let precisionDigits: Int?
    let isActive: Bool?
    let description: String?
}

struct CurrencyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let code: String?
    let name: String?
    let symbol: String?
    let currencyType: String?
    let precisionDigits: Int?
    let isActive: Bool?
    let description: String?
}

struct PlusApiResultCurrencyVO: Codable {
    let data: CurrencyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExchangeRateCreateForm: Codable {
    let baseCurrencyCode: String?
    let targetCurrencyCode: String?
    let rate: Double?
    let effectiveDate: String?
}

struct ExchangeRateVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let baseCurrencyCode: String?
    let baseCurrencyName: String?
    let targetCurrencyCode: String?
    let targetCurrencyName: String?
    let rate: Double?
    let effectiveDate: String?
}

struct PlusApiResultExchangeRateVO: Codable {
    let data: ExchangeRateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CurrencyConvertForm: Codable {
    let baseCurrencyCode: String?
    let targetCurrencyCode: String?
    let amount: Double?
}

struct CurrencyConvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let baseCurrencyCode: String?
    let targetCurrencyCode: String?
    let originalAmount: Double?
    let rate: Double?
    let convertedAmount: Double?
}

struct PlusApiResultCurrencyConvertVO: Codable {
    let data: CurrencyConvertVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUserCouponVO: Codable {
    let data: UserCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserCouponVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userCouponId: String?
    let couponId: String?
    let couponName: String?
    let couponCode: String?
    let type: String?
    let typeName: String?
    let amount: Int?
    let discount: Double?
    let minConsume: Int?
    let acquireAt: String?
    let useAt: String?
    let expireAt: String?
    let status: String?
    let statusName: String?
    let orderId: String?
    let canShared: Bool?
    let available: Bool?
    let remainingDays: Int?
}

struct CommentCreateForm: Codable {
    let contentType: String?
    let contentId: Int?
    let content: String?
    let deviceInfo: String?
}

struct CommentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let commentId: String?
    let content: String?
    let contentType: String?
    let contentId: Int?
    let userId: Int?
    let status: String?
    let likes: Int?
    let replyCount: Int?
    let isTop: Bool?
    let parentId: Int?
}

struct PlusApiResultCommentVO: Codable {
    let data: CommentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CommentReplyForm: Codable {
    let content: String?
    let deviceInfo: String?
}

struct CollectionCreateForm: Codable {
    let name: String?
    let description: String?
    let type: String?
    let parentId: Int?
}

struct CollectionItemAddForm: Codable {
    let contentType: String?
    let contentId: Int?
    let title: String?
    let description: String?
    let position: Int?
}

struct CollectionItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let itemId: String?
    let collectionId: String?
    let contentType: String?
    let contentId: Int?
    let title: String?
    let description: String?
    let coverImage: String?
    let position: Int?
    let isPinned: Bool?
    let tags: String?
    let addedAt: String?
}

struct PlusApiResultCollectionItemVO: Codable {
    let data: CollectionItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatSessionCreateForm: Codable {
    let name: String?
    let description: String?
    let modelId: String?
    let systemPrompt: String?
    let temperature: Double?
    let maxTokens: Int?
    let topP: Double?
    let type: String?
    let resourceId: String?
}

struct ChatSessionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let type: String?
    let status: String?
    let modelId: String?
    let messageCount: Int?
    let unreadCount: Int?
    let lastMessageTime: String?
    let lastMessageContent: String?
    let createTime: String?
    let updateTime: String?
}

struct PlusApiResultChatSessionVO: Codable {
    let data: ChatSessionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatMessageSendForm: Codable {
    let sessionId: Int?
    let content: String?
    let type: String?
    let format: String?
    let quoteMessageId: Int?
    let needThinking: Bool?
    let streaming: Bool?
    let modelId: String?
    let systemPrompt: String?
    let temperature: Double?
    let maxTokens: Int?
    let topP: Double?
}

struct AttachmentVO: Codable {
    let id: String?
    let name: String?
    let type: String?
    let size: Int?
    let url: String?
    let thumbnailUrl: String?
}

struct ChatMessageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let sessionId: Int?
    let content: String?
    let type: String?
    let format: String?
    let status: String?
    let senderType: String?
    let senderId: String?
    let receiverId: String?
    let quoteMessageId: Int?
    let thinking: String?
    let modelId: String?
    let responseTime: Int?
    let tokenCount: Int?
    let attachments: [AttachmentVO]?
    let createTime: String?
    let updateTime: String?
}

struct PlusApiResultChatMessageVO: Codable {
    let data: ChatMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatExportForm: Codable {
    let format: String?
    let scope: String?
    let count: Int?
    let includeThinking: Bool?
    let includeSystemMessages: Bool?
    let includeAttachments: Bool?
    let fileName: String?
}

struct ExportVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let fileUrl: String?
    let fileName: String?
    let fileSize: Int?
    let status: String?
    let format: String?
    let exportCount: Int?
    let expireTime: String?
}

struct PlusApiResultExportVO: Codable {
    let data: ExportVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CharacterCreateForm: Codable {
    let name: String?
    let type: String?
    let description: String?
    let agentId: Int?
}

struct CategoryCreateForm: Codable {
    let name: String?
    let type: String?
    let code: String?
    let icon: String?
    let description: String?
    let parentId: Int?
    let sort: Int?
    let status: Int?
}

struct TagCreateForm: Codable {
    let name: String?
    let code: String?
    let color: String?
    let description: String?
    let status: Int?
}

struct PlusApiResultTagVO: Codable {
    let data: TagVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TagVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let code: String?
    let color: String?
    let description: String?
    let count: Int?
    let status: Int?
}

struct AddCartItemForm: Codable {
    let skuId: Int?
    let productId: Int?
    let quantity: Int?
    let cartGroupUuid: String?
}

struct VerifyCodeCheckForm: Codable {
    let target: String?
    let type: String?
    let verifyType: String?
    let code: String?
}

struct PlusApiResultVerifyResultVO: Codable {
    let data: VerifyResultVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VerifyResultVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let valid: Bool?
}

struct VerifyCodeSendForm: Codable {
    let target: String?
    let type: String?
    let verifyType: String?
    let deviceId: String?
}

struct RegisterForm: Codable {
    let username: String?
    let password: String?
    let confirmPassword: String?
    let email: String?
    let phone: String?
}

struct PlusApiResultUserInfoVO: Codable {
    let data: UserInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let username: String?
    let email: String?
    let phone: String?
    let nickname: String?
    let avatar: String?
    let role: String?
    let status: String?
}

struct TokenRefreshForm: Codable {
    let refreshToken: String?
}

struct LoginVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let accessToken: String?
    let refreshToken: String?
    let tokenType: String?
    let expiresIn: Int?
    let userInfo: UserInfoVO?
}

struct PlusApiResultLoginVO: Codable {
    let data: LoginVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultQrCodeVO: Codable {
    let data: QrCodeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct QrCodeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let qrKey: String?
    let qrUrl: String?
    let qrContent: String?
    let expireTime: Int?
}

struct QrCodeConfirmForm: Codable {
    let qrKey: String?
    let token: String?
}

struct PhoneLoginForm: Codable {
    let phone: String?
    let code: String?
    let deviceId: String?
    let deviceType: String?
    let deviceName: String?
    let appVersion: String?
}

struct PasswordResetForm: Codable {
    let account: String?
    let code: String?
    let newPassword: String?
    let confirmPassword: String?
}

struct OAuthAuthUrlForm: Codable {
    let provider: String?
    let redirectUri: String?
    let scope: String?
    let state: String?
}

struct OAuthUrlVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let authUrl: String?
}

struct PlusApiResultOAuthUrlVO: Codable {
    let data: OAuthUrlVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OAuthLoginForm: Codable {
    let provider: String?
    let code: String?
    let state: String?
    let deviceId: String?
    let deviceType: String?
}

struct LoginForm: Codable {
    let username: String?
    let password: String?
    let captcha: String?
}

struct AuditAppealForm: Codable {
    let reason: String?
    let description: String?
    let evidenceUrl: String?
    let contactEmail: String?
    let expectedAction: String?
}

struct AuditAppealVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let appealId: String?
    let recordId: String?
    let reason: String?
    let description: String?
    let evidenceUrl: String?
    let status: String?
    let result: String?
    let comment: String?
    let submitTime: String?
    let processTime: String?
}

struct PlusApiResultAuditAppealVO: Codable {
    let data: AuditAppealVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoAuditForm: Codable {
    let videoUrl: String?
    let contentId: String?
    let title: String?
    let description: String?
    let contentType: String?
    let checkTypes: [String]?
    let callbackUrl: String?
    let duration: Int?
}

struct AudioAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let result: String?
    let riskLevel: String?
    let duration: Int?
    let transcript: String?
    let violationSegments: [ViolationSegment]?
    let suggestion: String?
}

struct ImageAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let result: String?
    let riskLevel: String?
    let confidence: Double?
    let details: [ImageDetectionDetail]?
    let violationRegions: [Region]?
    let suggestion: String?
}

struct ImageDetectionDetail: Codable {
    let type: String?
    let hit: Bool?
    let confidence: Double?
    let subType: String?
}

struct KeyFrameResult: Codable {
    let timestamp: Int?
    let frameUrl: String?
    let detectionResult: ImageAuditVO?
}

struct PlusApiResultVideoAuditVO: Codable {
    let data: VideoAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct Region: Codable {
    let x: Int?
    let y: Int?
    let width: Int?
    let height: Int?
}

struct VideoAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let status: String?
    let videoUrl: String?
    let duration: Int?
    let result: String?
    let riskLevel: String?
    let keyFrameResults: [KeyFrameResult]?
    let audioResult: AudioAuditVO?
    let suggestion: String?
}

struct ViolationSegment: Codable {
    let startTime: Int?
    let endTime: Int?
    let violationType: String?
    let text: String?
    let confidence: Double?
}

struct TextAuditForm: Codable {
    let content: String?
    let contentId: String?
    let contentType: String?
    let scene: String?
    let userId: String?
    let checkTypes: [String]?
    let async: Bool?
}

struct DetectionDetail: Codable {
    let type: String?
    let hit: Bool?
    let confidence: Double?
    let keywords: [String]?
}

struct PlusApiResultTextAuditVO: Codable {
    let data: TextAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TextAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let result: String?
    let riskLevel: String?
    let confidence: Double?
    let details: [DetectionDetail]?
    let sensitiveWords: [String]?
    let suggestion: String?
    let processedText: String?
}

struct TextSuggestForm: Codable {
    let text: String?
    let suggestType: String?
    let scene: String?
}

struct PlusApiResultTextSuggestVO: Codable {
    let data: TextSuggestVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ReplacementPosition: Codable {
    let start: Int?
    let end: Int?
    let original: String?
    let replacement: String?
}

struct TextSuggestVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let originalText: String?
    let suggestedText: String?
    let replacementCount: Int?
    let positions: [ReplacementPosition]?
    let alternativeSuggestions: [String]?
}

struct BatchTextAuditForm: Codable {
    let items: [TextItem]?
    let checkTypes: [String]?
    let scene: String?
}

struct TextItem: Codable {
    let id: String?
    let content: String?
    let contentType: String?
}

struct BatchTextAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let batchId: String?
    let results: [TextAuditItem]?
    let overallStatus: String?
    let totalCount: Int?
    let passCount: Int?
    let rejectCount: Int?
}

struct PlusApiResultBatchTextAuditVO: Codable {
    let data: BatchTextAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TextAuditItem: Codable {
    let id: String?
    let auditResult: TextAuditVO?
}

struct SensitiveWordsForm: Codable {
    let text: String?
    let wordListType: String?
    let mode: String?
    let replacement: String?
    let categories: [String]?
}

struct PlusApiResultSensitiveWordsVO: Codable {
    let data: SensitiveWordsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SensitiveWordsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let hasSensitiveWords: Bool?
    let count: Int?
    let words: [WordHit]?
    let processedText: String?
    let riskLevel: String?
}

struct WordHit: Codable {
    let word: String?
    let startIndex: Int?
    let endIndex: Int?
    let category: String?
    let severity: String?
}

struct BehaviorRiskCheckForm: Codable {
    let userId: String?
    let behaviorType: String?
    let frequency: Int?
    let context: [String: Any]?
    let timeWindow: Int?
}

struct AnomalyPattern: Codable {
    let type: String?
    let description: String?
    let severity: String?
    let detectedAt: String?
}

struct BehaviorRiskVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: String?
    let behaviorType: String?
    let riskLevel: String?
    let riskScore: Int?
    let anomalies: [AnomalyPattern]?
    let frequencyStats: FrequencyStats?
    let suggestion: String?
    let restrictions: [String]?
}

struct FrequencyStats: Codable {
    let currentFrequency: Int?
    let avgFrequency: Int?
    let limit: Int?
    let excessRatio: Double?
}

struct PlusApiResultBehaviorRiskVO: Codable {
    let data: BehaviorRiskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AccountRiskCheckForm: Codable {
    let userId: String?
    let deviceId: String?
    let ipAddress: String?
    let scene: String?
    let location: String?
}

struct AccountRiskVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: String?
    let deviceId: String?
    let riskLevel: String?
    let riskScore: Int?
    let risks: [RiskItem]?
    let suggestion: String?
    let needVerification: Bool?
}

struct PlusApiResultAccountRiskVO: Codable {
    let data: AccountRiskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RiskItem: Codable {
    let type: String?
    let name: String?
    let description: String?
    let level: String?
    let confidence: Double?
}

struct RealtimeAuditForm: Codable {
    let streamId: String?
    let streamUrl: String?
    let streamType: String?
    let roomId: String?
    let publisherId: String?
    let checkTypes: [String]?
    let callbackUrl: String?
    let checkAudio: Bool?
    let checkVideo: Bool?
}

struct PlusApiResultRealtimeAuditVO: Codable {
    let data: RealtimeAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RealtimeAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let streamId: String?
    let taskId: String?
    let status: String?
    let videoEnabled: Bool?
    let audioEnabled: Bool?
    let pushUrl: String?
    let startTime: String?
    let estimatedEndTime: String?
}

struct ImageAuditForm: Codable {
    let imageUrl: String?
    let imageBase64: String?
    let contentId: String?
    let contentType: String?
    let checkTypes: [String]?
    let scene: String?
    let async: Bool?
}

struct PlusApiResultImageAuditVO: Codable {
    let data: ImageAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ImageOcrAuditForm: Codable {
    let imageUrl: String?
    let contentId: String?
    let checkTypes: [String]?
    let language: String?
    let returnFullText: Bool?
}

struct ImageOcrAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let ocrText: String?
    let textBlocks: [TextBlock]?
    let textAuditResult: TextAuditVO?
    let overallResult: String?
}

struct PlusApiResultImageOcrAuditVO: Codable {
    let data: ImageOcrAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TextBlock: Codable {
    let text: String?
    let region: Region?
    let confidence: Double?
}

struct BatchImageAuditForm: Codable {
    let images: [ImageItem]?
    let checkTypes: [String]?
    let scene: String?
}

struct ImageItem: Codable {
    let id: String?
    let url: String?
    let contentType: String?
}

struct BatchImageAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let batchId: String?
    let results: [ImageAuditItem]?
    let overallStatus: String?
    let totalCount: Int?
    let passCount: Int?
    let rejectCount: Int?
}

struct ImageAuditItem: Codable {
    let id: String?
    let auditResult: ImageAuditVO?
}

struct PlusApiResultBatchImageAuditVO: Codable {
    let data: BatchImageAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ContentAuditForm: Codable {
    let contentId: String?
    let textContent: String?
    let imageUrls: [String]?
    let videoUrl: String?
    let audioUrl: String?
    let contentType: String?
    let scene: String?
    let checkTypes: [String]?
    let metadata: [String: Any]?
    let userId: String?
}

struct AuditResultItem: Codable {
    let type: String?
    let result: String?
    let riskLevel: String?
    let confidence: Double?
}

struct ContentAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let contentId: String?
    let overallResult: String?
    let riskLevel: String?
    let results: [String: AuditResultItem]?
    let textResult: TextAuditVO?
    let imageResults: [ImageAuditVO]?
    let videoResult: VideoAuditVO?
    let audioResult: AudioAuditVO?
    let suggestion: String?
}

struct PlusApiResultContentAuditVO: Codable {
    let data: ContentAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AudioAuditForm: Codable {
    let audioUrl: String?
    let format: String?
    let contentId: String?
    let duration: Int?
    let checkTypes: [String]?
    let sampleRate: Int?
}

struct PlusApiResultAudioAuditVO: Codable {
    let data: AudioAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AudioAsrAuditForm: Codable {
    let audioUrl: String?
    let contentId: String?
    let language: String?
    let checkTypes: [String]?
    let withTimestamp: Bool?
}

struct AudioAsrAuditVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let fullText: String?
    let segments: [TimestampedSegment]?
    let textAuditResult: TextAuditVO?
    let overallResult: String?
    let language: String?
}

struct PlusApiResultAudioAsrAuditVO: Codable {
    let data: AudioAsrAuditVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TimestampedSegment: Codable {
    let startTime: Int?
    let endTime: Int?
    let text: String?
    let speakerId: Int?
    let confidence: Double?
}

struct FolderCreateForm: Codable {
    let name: String?
    let parentId: String?
}

struct FolderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let folderId: String?
    let folderName: String?
    let parentId: String?
    let childCount: Int?
    let fileCount: Int?
}

struct PlusApiResultFolderVO: Codable {
    let data: FolderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AppCreateForm: Codable {
    let name: String?
    let description: String?
    let appType: String?
    let projectId: Int?
}

struct PageViewTrackForm: Codable {
    let pageUrl: String?
    let pageTitle: String?
    let referrer: String?
    let timestamp: String?
    let deviceId: String?
    let userId: String?
    let properties: [String: Any]?
    let sessionId: String?
    let duration: Int?
}

struct StatsExportForm: Codable {
    let reportType: String?
    let startDate: String?
    let endDate: String?
    let format: String?
    let email: String?
    let deviceType: String?
    let osType: String?
}

struct ExportResultVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let exportId: String?
    let reportType: String?
    let status: String?
    let downloadUrl: String?
    let fileSize: Int?
    let completedAt: String?
    let errorMessage: String?
}

struct PlusApiResultExportResultVO: Codable {
    let data: ExportResultVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct EventTrackForm: Codable {
    let eventName: String?
    let eventType: String?
    let timestamp: String?
    let deviceId: String?
    let userId: String?
    let properties: [String: Any]?
    let sessionId: String?
    let pageUrl: String?
    let referrer: String?
}

struct BatchEventTrackForm: Codable {
    let events: [EventTrackForm]?
    let deviceId: String?
    let userId: String?
    let submitTime: String?
}

struct ErrorTrackForm: Codable {
    let errorType: String?
    let errorMessage: String?
    let stackTrace: String?
    let deviceId: String?
    let userId: String?
    let appVersion: String?
    let deviceModel: String?
    let osVersion: String?
    let context: String?
    let errorTime: String?
}

struct AdvertReportForm: Codable {
    let advertId: String?
    let reportType: String?
    let reason: String?
    let screenshotUrl: String?
    let deviceId: String?
    let ipAddress: String?
}

struct VideoProgressForm: Codable {
    let advertId: String?
    let videoId: String?
    let progress: Int?
    let timestamp: String?
    let deviceId: String?
    let ipAddress: String?
}

struct AdvertImpressionForm: Codable {
    let advertId: String?
    let positionId: String?
    let impressionTime: String?
    let deviceId: String?
    let ipAddress: String?
    let userAgent: String?
    let screenSize: String?
}

struct VideoCompleteForm: Codable {
    let advertId: String?
    let videoId: String?
    let completeTime: String?
    let duration: String?
    let deviceId: String?
    let ipAddress: String?
}

struct AdvertCloseForm: Codable {
    let advertId: String?
    let positionId: String?
    let closeTime: String?
    let duration: String?
    let deviceId: String?
    let ipAddress: String?
}

struct AdvertClickForm: Codable {
    let advertId: String?
    let positionId: String?
    let clickTime: String?
    let deviceId: String?
    let ipAddress: String?
    let userAgent: String?
}

struct RewardVerifyForm: Codable {
    let advertId: String?
    let rewardId: String?
    let verificationToken: String?
    let deviceId: String?
    let ipAddress: String?
}

struct PlusApiResultRewardVerifyVO: Codable {
    let data: RewardVerifyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RewardVerifyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let verified: Bool?
    let rewardId: String?
    let rewardType: String?
    let rewardAmount: Int?
    let message: String?
    let verificationToken: String?
}

struct ActivityJoinForm: Codable {
    let extraParams: [String: Any]?
    let inviteCode: String?
}

struct ActivityJoinVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: String?
    let success: Bool?
    let result: String?
    let rewards: [String: Any]?
    let remainingCount: Int?
    let message: String?
}

struct PlusApiResultActivityJoinVO: Codable {
    let data: ActivityJoinVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultTaskRewardVO: Codable {
    let data: TaskRewardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TaskRewardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let rewardId: String?
    let taskId: String?
    let rewardType: String?
    let rewardAmount: Int?
    let status: String?
    let message: String?
    let claimedAt: String?
}

struct PointsExchangeForm: Codable {
    let quantity: Int?
    let addressId: String?
    let remark: String?
}

struct PlusApiResultPointsExchangeVO: Codable {
    let data: PointsExchangeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsExchangeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: String?
    let success: Bool?
    let goodsName: String?
    let pointsCost: Int?
    let remainingPoints: Int?
    let quantity: Int?
    let exchangeTime: String?
    let status: String?
    let rewardContent: String?
    let message: String?
}

struct LotteryDrawVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let isWin: Bool?
    let prizeId: String?
    let prizeName: String?
    let prizeImage: String?
    let prizeType: String?
    let isGrandPrize: Bool?
    let winTime: String?
    let recordId: String?
    let remainingFreeCount: Int?
    let pointsCost: Int?
    let message: String?
}

struct PlusApiResultLotteryDrawVO: Codable {
    let data: LotteryDrawVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPrizeClaimVO: Codable {
    let data: PrizeClaimVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PrizeClaimVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let prizeName: String?
    let prizeType: String?
    let claimTime: String?
    let rewardDetails: [String: Any]?
    let message: String?
}

struct CheckInVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let checkInDate: String?
    let consecutiveDays: Int?
    let points: Int?
    let extraRewards: [String: Any]?
    let checkedInToday: Bool?
    let message: String?
}

struct PlusApiResultCheckInVO: Codable {
    let data: CheckInVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CheckInMakeUpForm: Codable {
    let date: String?
}

struct CheckInMakeUpVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let date: String?
    let costPoints: Int?
    let remainingPoints: Int?
    let consecutiveDays: Int?
    let message: String?
}

struct PlusApiResultCheckInMakeUpVO: Codable {
    let data: CheckInMakeUpVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsTransferForm: Codable {
    let toUserId: String?
    let points: Int?
    let remarks: String?
}

struct PlusApiResultPointsTransferVO: Codable {
    let data: PointsTransferVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsTransferVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let transactionId: String?
    let fromAccountId: String?
    let toAccountId: String?
    let points: Int?
    let status: String?
    let fromPointsAfter: Int?
    let toPointsAfter: Int?
}

struct PlusApiResultPointsAccountInfoVO: Codable {
    let data: PointsAccountInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsAccountInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let accountId: String?
    let accountType: String?
    let accountTypeName: String?
    let ownerId: String?
    let userId: String?
    let availablePoints: Int?
    let frozenPoints: Int?
    let totalPoints: Int?
    let tokenBalance: Int?
    let status: String?
    let statusName: String?
    let pendingPoints: Int?
    let totalEarned: Int?
    let totalSpent: Int?
    let level: Int?
    let levelName: String?
    let experience: Int?
}

struct CashWithdrawForm: Codable {
    let amount: Double?
    let withdrawMethod: String?
    let accountNo: String?
    let accountName: String?
    let bankName: String?
    let remarks: String?
}

struct CashWithdrawVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let transactionId: String?
    let accountId: String?
    let amount: Double?
    let balanceAfter: Double?
    let frozenBalance: Double?
    let status: String?
    let estimatedArrivalTime: String?
    let withdrawMethod: String?
}

struct PlusApiResultCashWithdrawVO: Codable {
    let data: CashWithdrawVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CashTransferForm: Codable {
    let toUserId: String?
    let amount: Double?
    let remarks: String?
    let payPassword: String?
}

struct CashTransferVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let transactionId: String?
    let fromAccountId: String?
    let toAccountId: String?
    let amount: Double?
    let status: String?
    let fromBalanceAfter: Double?
    let toBalanceAfter: Double?
}

struct PlusApiResultCashTransferVO: Codable {
    let data: CashTransferVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CashRechargeForm: Codable {
    let amount: Double?
    let paymentMethod: String?
    let remarks: String?
    let couponId: String?
}

struct CashRechargeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let transactionId: String?
    let accountId: String?
    let amount: Double?
    let balanceAfter: Double?
    let status: String?
    let paymentMethod: String?
    let payUrl: String?
}

struct PlusApiResultCashRechargeVO: Codable {
    let data: CashRechargeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExperimentFeedbackForm: Codable {
    let experimentKey: String?
    let feedbackType: String?
    let feedbackContent: String?
    let rating: Int?
}

struct BatchFeatureCheckForm: Codable {
    let featureKeys: [String]?
    let userAttributes: Any?
}

struct FeatureFlagVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let featureKey: String?
    let featureName: String?
    let enabled: Bool?
    let value: Any?
    let description: String?
}

struct PlusApiResultMapStringFeatureFlagVO: Codable {
    let data: [String: FeatureFlagVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExperimentExposureForm: Codable {
    let experimentKey: String?
    let variantKey: String?
    let exposureContext: Any?
}

struct ExperimentEventForm: Codable {
    let experimentKey: String?
    let eventType: String?
    let eventData: Any?
}

struct ExperimentConversionForm: Codable {
    let experimentKey: String?
    let conversionGoal: String?
    let conversionValue: Double?
}

struct BatchAssignmentForm: Codable {
    let experimentKeys: [String]?
    let userAttributes: [String: Any]?
}

struct ExperimentAssignmentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let experimentKey: String?
    let variantKey: String?
    let variantName: String?
    let assignmentReason: String?
    let assignmentParams: [String: Any]?
}

struct PlusApiResultMapStringExperimentAssignmentVO: Codable {
    let data: [String: ExperimentAssignmentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListWorkspaceVO: Codable {
    let data: [WorkspaceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectQueryForm: Codable {
    let workspaceId: String?
    let keyword: String?
    let projectName: String?
    let type: String?
    let projectTags: [String]?
    let status: String?
    let creatorId: String?
    let startTime: String?
    let endTime: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageProjectVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ProjectVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageProjectVO: Codable {
    let data: PageProjectVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MemberVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let memberId: String?
    let userId: String?
    let username: String?
    let nickname: String?
    let avatar: String?
    let email: String?
    let roleId: String?
    let roleName: String?
    let permissions: [String]?
    let joinTime: String?
    let lastActiveTime: String?
    let status: String?
    let isCreator: Bool?
    let isAdmin: Bool?
}

struct PlusApiResultProjectDetailVO: Codable {
    let data: ProjectDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let projectId: String?
    let projectName: String?
    let projectTitle: String?
    let projectDescription: String?
    let projectType: String?
    let projectTypeName: String?
    let projectCode: String?
    let projectIcon: String?
    let coverImageUrl: String?
    let projectTags: [String]?
    let workspaceId: String?
    let workspaceName: String?
    let creatorId: String?
    let creatorName: String?
    let author: String?
    let sitePath: String?
    let domainPrefix: String?
    let startTime: String?
    let endTime: String?
    let isTemplate: Bool?
    let createTime: String?
    let updateTime: String?
    let members: [MemberVO]?
    let status: String?
    let statusName: String?
    let settings: ProjectSettings?
}

struct PlusApiResultListMemberVO: Codable {
    let data: [MemberVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultVoteDetailVO: Codable {
    let data: VoteDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoteDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let voteId: String?
    let userId: Int?
    let contentType: String?
    let contentId: Int?
    let rating: String?
    let source: String?
    let clientIp: String?
    let deviceInfo: String?
}

struct PlusApiResultListLong: Codable {
    let data: [Int]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultVoteStatusVO: Codable {
    let data: VoteStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoteStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let hasVoted: Bool?
    let userRating: String?
}

struct PlusApiResultVoteStatisticsVO: Codable {
    let data: VoteStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoteStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalVotes: Int?
    let likes: Int?
    let dislikes: Int?
    let neutrals: Int?
    let likeRatio: String?
}

struct PageVoteDetailVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [VoteDetailVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageVoteDetailVO: Codable {
    let data: PageVoteDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceSpeakerQueryForm: Codable {
    let page: Int?
    let size: Int?
    let keyword: String?
    let gender: String?
    let ageType: String?
    let type: String?
    let channel: String?
    let status: String?
}

struct PageVoiceSpeakerVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [VoiceSpeakerVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageVoiceSpeakerVO: Codable {
    let data: PageVoiceSpeakerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultVoiceSpeakerDetailVO: Codable {
    let data: VoiceSpeakerDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceSourceVO: Codable {
    let id: String?
    let name: String?
    let type: String?
    let language: String?
    let sampleRate: Int?
}

struct VoiceSpeakerDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let localName: String?
    let code: String?
    let faceImageUrl: String?
    let faceVideoUrl: String?
    let resourceUrls: [String]?
    let channel: String?
    let channelName: String?
    let product: String?
    let gender: String?
    let genderName: String?
    let ageType: String?
    let ageTypeName: String?
    let type: String?
    let typeName: String?
    let models: [String]?
    let channelSpeakerId: String?
    let version: String?
    let isDefault: Bool?
    let status: String?
    let statusName: String?
    let description: String?
    let tags: [String]?
    let voiceSources: [VoiceSourceVO]?
    let sampleAudios: [String]?
    let attributes: [String: Any]?
}

struct PlusApiResultSpeakerStatisticsVO: Codable {
    let data: SpeakerStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SpeakerStatisticsVO: Codable {
    let totalSpeakers: Int?
    let activeSpeakers: Int?
    let inactiveSpeakers: Int?
}

struct PlusApiResultListVoiceSpeakerVO: Codable {
    let data: [VoiceSpeakerVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultVipStatusVO: Codable {
    let data: VipStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipStatusVO: Codable {
    let isVip: Bool?
    let vipLevel: Int?
    let expireTime: String?
    let pointBalance: Int?
}

struct PlusApiResultVipPrivilegeUsageVO: Codable {
    let data: VipPrivilegeUsageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipPrivilegeUsageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let speedUpUsed: Int?
    let speedUpLimit: Int?
    let priorityQueueUsed: Int?
    let priorityQueueLimit: Int?
    let exclusiveModelUsed: Int?
    let exclusiveModelLimit: Int?
}

struct PlusApiResultListVipPointsHistoryVO: Codable {
    let data: [VipPointsHistoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipPointsHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let changeType: String?
    let changeAmount: Int?
    let beforeBalance: Int?
    let afterBalance: Int?
    let sourceType: String?
    let remark: String?
}

struct PlusApiResultVipDailyRewardStatusVO: Codable {
    let data: VipDailyRewardStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipDailyRewardStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let canClaim: Bool?
    let claimedToday: Bool?
    let consecutiveDays: Int?
    let totalDays: Int?
}

struct PlusApiResultLong: Codable {
    let data: Int?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipPackGroupQueryForm: Codable {
    let vipLevelId: Int?
    let recommendedOnly: Bool?
}

struct PlusApiResultListVipPackGroupVO: Codable {
    let data: [VipPackGroupVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipPackGroupVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let sortWeight: Int?
    let packs: [VipPackVO]?
}

struct VipPackVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let price: Double?
    let originalPrice: Double?
    let pointAmount: Int?
    let vipDurationDays: Int?
    let levelName: String?
    let sortWeight: Int?
    let recommended: Bool?
    let tags: [String]?
}

struct PlusApiResultVipPackGroupDetailVO: Codable {
    let data: VipPackGroupDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipPackGroupDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let sortWeight: Int?
    let packs: [VipPackVO]?
}

struct PlusApiResultListVipPackVO: Codable {
    let data: [VipPackVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultVipPackDetailVO: Codable {
    let data: VipPackDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipBenefitVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let benefitKey: String?
    let type: String?
    let description: String?
    let icon: String?
    let claimed: Bool?
    let usageLimit: Int?
    let usedCount: Int?
}

struct VipPackDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let price: Double?
    let originalPrice: Double?
    let pointAmount: Int?
    let vipDurationDays: Int?
    let levelId: Int?
    let levelName: String?
    let groupId: Int?
    let groupName: String?
    let validFrom: String?
    let validTo: String?
    let sortWeight: Int?
    let benefits: [VipBenefitVO]?
}

struct PlusApiResultListVipLevelVO: Codable {
    let data: [VipLevelVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipLevelVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let levelValue: Int?
    let requiredPoints: Int?
    let description: String?
    let icon: String?
    let badge: String?
}

struct InviteRulesVO: Codable {
    let title: String?
    let description: String?
    let inviterReward: Int?
    let inviteeReward: Int?
    let rules: [String]?
}

struct PlusApiResultInviteRulesVO: Codable {
    let data: InviteRulesVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListVipInviteRecordVO: Codable {
    let data: [VipInviteRecordVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipInviteRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let inviteeId: Int?
    let inviteeNickname: String?
    let inviteeAvatar: String?
    let status: String?
    let rewardPoints: Int?
    let invitedAt: String?
    let completedAt: String?
}

struct PlusApiResultVipInviteInfoVO: Codable {
    let data: VipInviteInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipInviteInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let inviteCode: String?
    let inviteLink: String?
    let totalInvites: Int?
    let successfulInvites: Int?
    let rewardPoints: Int?
    let rewardRule: String?
}

struct CustomerServiceInfo: Codable {
    let serviceId: String?
    let serviceName: String?
    let servicePhone: String?
    let serviceWechat: String?
    let online: Bool?
}

struct PlusApiResultVipInfoVO: Codable {
    let data: VipInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipCouponVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let discount: Double?
    let minAmount: Double?
    let reduceAmount: Double?
    let validFrom: String?
    let validTo: String?
    let status: String?
    let used: Bool?
}

struct VipInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let vipLevel: Int?
    let vipLevelName: String?
    let vipStatus: String?
    let effectiveTime: String?
    let expireTime: String?
    let remainingDays: Int?
    let totalDays: Int?
    let totalSpent: Int?
    let vipPoints: Int?
    let growthValue: Int?
    let upgradeGrowthValue: Int?
    let customerService: CustomerServiceInfo?
    let benefits: [VipBenefitVO]?
    let coupons: [VipCouponVO]?
}

struct PlusApiResultListVipCouponVO: Codable {
    let data: [VipCouponVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultBoolean: Codable {
    let data: Bool?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListVipBenefitVO: Codable {
    let data: [VipBenefitVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ImageMediaResourceList: Codable {
    let images: [ImageMediaResource]?
}

struct PlusApiResultVideoDetailVO: Codable {
    let data: VideoDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let videoId: String?
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let thumbnailUrl: String?
    let width: Int?
    let height: Int?
    let aspectRatio: String?
    let resolution: String?
    let fileSize: Int?
    let categoryId: Int?
    let coverImages: ImageMediaResourceList?
    let resource: VideoMediaResource?
    let author: AuthorInfo?
    let status: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let playCount: Int?
    let downloadCount: Int?
    let likeCount: Int?
}

struct PlusApiResultVideoStatisticsVO: Codable {
    let data: VideoStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalVideos: Int?
    let completedVideos: Int?
    let processingVideos: Int?
}

struct PageVideoVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [VideoVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageVideoVO: Codable {
    let data: PageVideoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct LoginHistoryQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let loginType: String?
    let deviceType: String?
    let status: String?
    let ipAddress: String?
    let startTime: String?
    let endTime: String?
    let size: Int?
    let page: Int?
}

struct PageMapStringObject: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [[String: Any]]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageMapStringObject: Codable {
    let data: PageMapStringObject?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerationHistoryQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let generationType: String?
    let status: String?
    let keyword: String?
    let startTime: String?
    let endTime: String?
    let size: Int?
    let page: Int?
}

struct PlusApiResultListUserAddressVO: Codable {
    let data: [UserAddressVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultStorageUsageVO: Codable {
    let data: StorageUsageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct StorageUsageVO: Codable {
    let totalSize: Int?
    let usedSize: Int?
    let remainingSize: Int?
    let fileCount: Int?
}

struct PageFileVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [FileVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageFileVO: Codable {
    let data: PageFileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListInteger: Codable {
    let data: [Int]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InstallAppList: Codable {
    let appIdList: [Int]?
}

struct PlusApiResultTenantDetailVO: Codable {
    let data: TenantDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TenantDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let type: String?
    let bizType: String?
    let bizId: Int?
    let status: String?
    let description: String?
    let adminUserId: Int?
    let installAppList: InstallAppList?
    let metadata: TenantMetadata?
    let contactPerson: String?
    let contactPhone: String?
    let tokenExpirationMs: Int?
    let refreshTokenExpirationMs: Int?
    let expireTime: String?
}

struct TenantMetadata: Codable {
    let spMchId: Int?
}

struct PlusApiResultListTenantTypeVO: Codable {
    let data: [TenantTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TenantTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let name: String?
}

struct PlusApiResultTenantStatisticsVO: Codable {
    let data: TenantStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TenantStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalTenants: Int?
    let activeTenants: Int?
    let frozenTenants: Int?
    let closedTenants: Int?
}

struct PageTenantVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [TenantVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageTenantVO: Codable {
    let data: PageTenantVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FollowStatsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let followingCount: Int?
    let followersCount: Int?
    let mutualCount: Int?
}

struct PlusApiResultFollowStatsVO: Codable {
    let data: FollowStatsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MessageUnreadCountVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalUnread: Int?
    let privateUnread: Int?
    let systemUnread: Int?
}

struct PlusApiResultMessageUnreadCountVO: Codable {
    let data: MessageUnreadCountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FollowQueryForm: Codable {
    let page: Int?
    let size: Int?
    let queryType: String?
    let userId: String?
    let keyword: String?
}

struct FollowUserVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: String?
    let username: String?
    let nickname: String?
    let avatar: String?
    let followTime: String?
    let isMutual: Bool?
}

struct PageFollowUserVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [FollowUserVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageFollowUserVO: Codable {
    let data: PageFollowUserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultFollowCheckVO: Codable {
    let data: FollowCheckVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ConversationQueryForm: Codable {
    let page: Int?
    let size: Int?
    let conversationType: String?
    let showUnread: Bool?
    let keyword: String?
}

struct ConversationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let conversationId: String?
    let conversationType: String?
    let otherUserId: String?
    let otherUsername: String?
    let otherNickname: String?
    let otherAvatar: String?
    let lastMessage: String?
    let lastMessageTime: String?
    let unreadCount: Int?
    let isTop: Bool?
}

struct PageConversationVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ConversationVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageConversationVO: Codable {
    let data: PageConversationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MessageQueryForm: Codable {
    let conversationId: String?
    let page: Int?
    let size: Int?
    let messageType: String?
    let startTime: String?
    let endTime: String?
}

struct PagePrivateMessageVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PrivateMessageVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePrivateMessageVO: Codable {
    let data: PagePrivateMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BlockedUserQueryForm: Codable {
    let page: Int?
    let size: Int?
    let keyword: String?
    let startTime: String?
    let endTime: String?
}

struct BlockedUserVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: String?
    let username: String?
    let nickname: String?
    let avatar: String?
    let blockTime: String?
    let blockReason: String?
}

struct PageBlockedUserVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [BlockedUserVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageBlockedUserVO: Codable {
    let data: PageBlockedUserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BlockCheckVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let isBlocked: Bool?
    let blockTime: String?
    let blockReason: String?
}

struct PlusApiResultBlockCheckVO: Codable {
    let data: BlockCheckVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultSkuDetailVO: Codable {
    let data: SkuDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SkuDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let productId: String?
    let productName: String?
    let skuCode: String?
    let skuName: String?
    let attributes: [String: String]?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let warningStock: Int?
    let sales: Int?
    let mainImage: String?
    let images: [String]?
    let weight: Double?
    let volume: Double?
    let status: String?
    let sort: Int?
}

struct PlusApiResultSkuStockVO: Codable {
    let data: SkuStockVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SkuStockVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let skuId: String?
    let productId: String?
    let skuCode: String?
    let skuName: String?
    let quantity: Int?
    let warningStock: Int?
    let lockedStock: Int?
    let availableStock: Int?
    let status: String?
}

struct PageSkuVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [SkuVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageSkuVO: Codable {
    let data: PageSkuVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SkuVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let productId: String?
    let skuCode: String?
    let skuName: String?
    let attributes: [String: String]?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let sales: Int?
    let image: String?
    let status: String?
    let sort: Int?
}

struct PlusApiResultSkuStatisticsVO: Codable {
    let data: SkuStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SkuStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let productId: String?
    let productName: String?
    let totalSkuCount: Int?
    let enabledSkuCount: Int?
    let disabledSkuCount: Int?
    let totalStock: Int?
    let totalSales: Int?
    let averagePrice: Double?
    let warningStockCount: Int?
    let stockTrend: [String: Int]?
    let salesTrend: [String: Int]?
}

struct PlusApiResultSkuVO: Codable {
    let data: SkuVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListSkuVO: Codable {
    let data: [SkuVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShopQueryForm: Codable {
    let page: Int?
    let size: Int?
    let keyword: String?
    let status: String?
}

struct PageShopVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ShopVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageShopVO: Codable {
    let data: PageShopVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultShopDetailVO: Codable {
    let data: ShopDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShopDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let description: String?
    let logoUrl: String?
    let coverUrl: String?
    let contactPhone: String?
    let contactEmail: String?
    let address: String?
    let latitude: Double?
    let longitude: Double?
    let licenseNumber: String?
    let tags: [String]?
    let businessHours: String?
    let status: String?
    let statusName: String?
    let ownerId: String?
    let ownerName: String?
    let productCount: Int?
    let orderCount: Int?
    let rating: Double?
    let followerCount: Int?
}

struct PlusApiResultShopStatisticsVO: Codable {
    let data: ShopStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShopStatisticsVO: Codable {
    let totalShops: Int?
    let activeShops: Int?
    let inactiveShops: Int?
}

struct PlusApiResultListShopVO: Codable {
    let data: [ShopVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShareVisitorQueryForm: Codable {
    let shareId: String?
    let page: Int?
    let size: Int?
    let startTime: String?
    let endTime: String?
}

struct PageShareVisitorVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ShareVisitorVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageShareVisitorVO: Codable {
    let data: PageShareVisitorVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShareVisitorVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let visitorId: String?
    let visitTime: String?
    let userAgent: String?
    let ipAddress: String?
    let deviceInfo: String?
    let visitType: String?
}

struct PlusApiResultShareStatisticsVO: Codable {
    let data: ShareStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShareStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalShares: Int?
    let totalVisits: Int?
    let todayShares: Int?
    let todayVisits: Int?
    let successRate: String?
}

struct PlusApiResultShareInfoVO: Codable {
    let data: ShareInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListSharePlatformVO: Codable {
    let data: [SharePlatformVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SharePlatformVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let platformId: String?
    let platformName: String?
    let platformIcon: String?
    let supported: Bool?
}

struct ShareQueryForm: Codable {
    let page: Int?
    let size: Int?
    let shareType: String?
    let status: String?
    let keyword: String?
    let startTime: String?
    let endTime: String?
}

struct PageShareRecordVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ShareRecordVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageShareRecordVO: Codable {
    let data: PageShareRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InviteRecordQueryForm: Codable {
    let page: Int?
    let size: Int?
    let status: String?
    let startTime: String?
    let endTime: String?
}

struct InviteRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let inviteeId: String?
    let inviteeNickname: String?
    let inviteTime: String?
    let status: String?
    let rewardAmount: String?
}

struct PageInviteRecordVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [InviteRecordVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageInviteRecordVO: Codable {
    let data: PageInviteRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InviteInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let inviteCode: String?
    let inviteLink: String?
    let inviteCount: Int?
    let rewardAmount: String?
    let remainingReward: String?
}

struct PlusApiResultInviteInfoVO: Codable {
    let data: InviteInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultMapStringObject: Codable {
    let data: [String: Any]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUISettingsVO: Codable {
    let data: UISettingsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UISettingsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let theme: String?
    let language: String?
    let fontSize: String?
    let zoomLevel: Int?
    let notificationsEnabled: Bool?
    let shortcutsEnabled: Bool?
    let sidebarState: String?
    let autoSaveEnabled: Bool?
}

struct PlusApiResultSecuritySettingsVO: Codable {
    let data: SecuritySettingsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SecuritySettingsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let twoFactorEnabled: Bool?
    let biometricEnabled: Bool?
    let autoLockEnabled: Bool?
    let autoLockMinutes: Int?
    let loginNotificationsEnabled: Bool?
    let ipRestrictionEnabled: Bool?
    let allowedIps: [String]?
    let passwordStrengthCheckEnabled: Bool?
    let passwordExpiryDays: Int?
    let lastPasswordChangeTime: String?
}

struct PlusApiResultPrivacySettingsVO: Codable {
    let data: PrivacySettingsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AppVersionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let currentVersion: String?
    let latestVersion: String?
    let updateRequired: Bool?
    let forceUpdate: Bool?
    let updateDescription: String?
    let updateUrl: String?
    let updateSize: String?
    let releaseDate: Int?
}

struct PlusApiResultAppVersionVO: Codable {
    let data: AppVersionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultMapStringBoolean: Codable {
    let data: [String: Bool]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AppConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let version: String?
    let buildNumber: String?
    let apiVersion: String?
    let serverTime: Int?
    let features: [String: Bool]?
    let systemConfig: [String: Any]?
    let maintenanceMode: Bool?
    let maintenanceMessage: String?
}

struct PlusApiResultAppConfigVO: Codable {
    let data: AppConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GlobalSearchRequest: Codable {
    let keyword: String?
    let type: String?
    let page: Int?
    let size: Int?
}

struct AssetSearchResult: Codable {
    let id: String?
    let name: String?
    let type: String?
    let path: String?
    let workspaceId: String?
}

struct GlobalSearchVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let projects: [ProjectSearchResult]?
    let assets: [AssetSearchResult]?
    let notes: [NoteSearchResult]?
    let users: [UserSearchResult]?
}

struct NoteSearchResult: Codable {
    let id: Int?
    let title: String?
    let summary: String?
    let folderId: String?
    let folderName: String?
}

struct PlusApiResultGlobalSearchVO: Codable {
    let data: GlobalSearchVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectSearchResult: Codable {
    let id: String?
    let name: String?
    let description: String?
    let workspaceId: String?
    let workspaceName: String?
    let type: String?
}

struct UserSearchResult: Codable {
    let id: Int?
    let username: String?
    let realName: String?
    let userType: String?
    let avatarUrl: String?
}

struct UserSearchRequest: Codable {
    let keyword: String?
    let userType: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageUserSearchResult: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [UserSearchResult]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageUserSearchResult: Codable {
    let data: PageUserSearchResult?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListSearchSuggestionVO: Codable {
    let data: [SearchSuggestionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SearchSuggestionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let keyword: String?
    let type: String?
    let count: Int?
}

struct PlusApiResultSearchStatisticsVO: Codable {
    let data: SearchStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SearchStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalSearches: Int?
    let todaySearches: Int?
    let thisWeekSearches: Int?
    let thisMonthSearches: Int?
    let hotKeywords: [String: Int]?
    let typeDistribution: [String: Int]?
    let lastSearchTime: String?
}

struct ProjectSearchRequest: Codable {
    let keyword: String?
    let workspaceId: String?
    let type: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageProjectSearchResult: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ProjectSearchResult]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageProjectSearchResult: Codable {
    let data: PageProjectSearchResult?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NoteSearchRequest: Codable {
    let keyword: String?
    let folderId: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageNoteSearchResult: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [NoteSearchResult]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageNoteSearchResult: Codable {
    let data: PageNoteSearchResult?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct HotSearchVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let keyword: String?
    let count: Int?
    let rank: Int?
}

struct PlusApiResultListHotSearchVO: Codable {
    let data: [HotSearchVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListSearchHistoryVO: Codable {
    let data: [SearchHistoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SearchHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let keyword: String?
    let searchTime: String?
    let count: Int?
}

struct PlusApiResultSearchFiltersVO: Codable {
    let data: SearchFiltersVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SearchFiltersVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let typeFilters: [String: String]?
    let dateFilters: [String: String]?
    let otherFilters: [String: Any]?
}

struct AssetSearchRequest: Codable {
    let keyword: String?
    let type: String?
    let workspaceId: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageAssetSearchResult: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [AssetSearchResult]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageAssetSearchResult: Codable {
    let data: PageAssetSearchResult?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePromptVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PromptVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePromptVO: Codable {
    let data: PagePromptVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PromptQueryForm: Codable {
    let keyword: String?
    let type: String?
    let bizType: String?
    let enabled: Bool?
    let model: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let page: Int?
    let size: Int?
    let sortBy: String?
    let sortDirection: String?
}

struct PlusApiResultPromptHistoryVO: Codable {
    let data: PromptHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PromptHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let promptId: Int?
    let promptTitle: String?
    let promptContent: String?
    let usedContent: String?
    let responseContent: String?
    let model: String?
    let duration: Int?
    let inputTokens: Int?
    let outputTokens: Int?
    let success: Bool?
    let errorMessage: String?
}

struct PromptHistoryQueryForm: Codable {
    let promptId: Int?
    let keyword: String?
    let model: String?
    let success: Bool?
    let page: Int?
    let size: Int?
    let sortBy: String?
    let sortDirection: String?
}

struct PagePromptHistoryVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PromptHistoryVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePromptHistoryVO: Codable {
    let data: PagePromptHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectListQueryRequest: Codable {
    let keyword: String?
    let workspaceId: String?
    let type: String?
    let status: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PlusApiResultProjectStatisticsVO: Codable {
    let data: ProjectStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProjectStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let projectId: String?
    let totalFiles: Int?
    let totalMembers: Int?
    let totalConversations: Int?
    let documentCount: Int?
    let tagCount: Int?
    let lastActivityTime: String?
    let activityStats: [String: Int]?
    let documentTypeStats: [String: Int]?
}

struct PlusApiResultListProjectVO: Codable {
    let data: [ProjectVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageProductVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ProductVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageProductVO: Codable {
    let data: PageProductVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProductVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let type: String?
    let summary: String?
    let mainImage: String?
    let price: Double?
    let originalPrice: Double?
    let sales: Int?
    let status: String?
    let recommended: Bool?
    let hot: Bool?
    let categoryName: String?
    let brandName: String?
    let tags: [String]?
}

struct PlusApiResultProductDetailVO: Codable {
    let data: ProductDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProductAttributeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let values: [String]?
    let searchable: Bool?
    let filterable: Bool?
    let sort: Int?
}

struct ProductDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let type: String?
    let description: String?
    let summary: String?
    let categoryId: String?
    let categoryName: String?
    let brandId: String?
    let brandName: String?
    let tagIds: [String]?
    let tags: [String]?
    let mainImage: String?
    let images: [String]?
    let videoUrl: String?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let sales: Int?
    let status: String?
    let recommended: Bool?
    let hot: Bool?
    let sort: Int?
    let shelfTime: String?
    let offShelfTime: String?
    let attributes: [ProductAttributeVO]?
    let skus: [SkuVO]?
    let reviewStatistics: [String: Any]?
}

struct PlusApiResultInteger: Codable {
    let data: Int?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultProductStatisticsVO: Codable {
    let data: ProductStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ProductStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let productId: String?
    let totalSales: Int?
    let totalStock: Int?
    let reviewCount: Int?
    let averageRating: Double?
    let viewCount: Int?
    let favoriteCount: Int?
    let shareCount: Int?
    let salesTrend: [String: Int]?
    let stockTrend: [String: Int]?
}

struct PlusApiResultListProductVO: Codable {
    let data: [ProductVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultProductVO: Codable {
    let data: ProductVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PaymentStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let paymentOrderId: String?
    let merchantOrderId: String?
    let status: String?
    let statusName: String?
    let amount: String?
    let payTime: Int?
    let paymentMethod: String?
    let paymentId: Int?
    let paymentSn: String?
    let orderId: Int?
    let paymentProvider: String?
    let transactionId: String?
    let outTradeNo: String?
    let successTime: String?
}

struct PlusApiResultPaymentStatusVO: Codable {
    let data: PaymentStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PaymentStatisticsVO: Codable {
    let totalPayments: Int?
    let pendingPayments: Int?
    let successPayments: Int?
    let failedPayments: Int?
    let closedPayments: Int?
}

struct PlusApiResultPaymentStatisticsVO: Codable {
    let data: PaymentStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PaymentQueryForm: Codable {
    let paymentOrderId: String?
    let merchantOrderId: String?
    let queryType: String?
    let status: String?
    let page: Int?
    let size: Int?
}

struct PagePaymentStatusVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PaymentStatusVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePaymentStatusVO: Codable {
    let data: PagePaymentStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPaymentStatusVO: Codable {
    let data: [PaymentStatusVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PaymentMethodVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let code: String?
    let methodId: String?
    let methodName: String?
    let methodIcon: String?
    let enabled: Bool?
    let sort: Int?
    let icon: String?
    let available: Bool?
    let productTypes: [PaymentProductTypeVO]?
}

struct PaymentProductTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let code: String?
    let name: String?
    let available: Bool?
}

struct PlusApiResultListPaymentMethodVO: Codable {
    let data: [PaymentMethodVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PartnerDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let partnerId: String?
    let name: String?
    let level: String?
    let status: String?
    let promotionCode: String?
    let contactName: String?
    let contactPhone: String?
    let contactEmail: String?
    let companyAddress: String?
    let businessLicense: String?
    let settlementAccount: String?
    let commissionRate: Double?
    let totalCommission: Double?
    let withdrawableCommission: Double?
    let withdrawnCommission: Double?
    let parentId: Int?
    let cooperationStartTime: String?
    let cooperationEndTime: String?
    let remark: String?
}

struct PlusApiResultPartnerDetailVO: Codable {
    let data: PartnerDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePartnerVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PartnerVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePartnerVO: Codable {
    let data: PagePartnerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PartnerStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalPartners: Int?
    let activePartners: Int?
    let pendingPartners: Int?
    let totalCommission: Double?
    let withdrawableCommission: Double?
}

struct PlusApiResultPartnerStatisticsVO: Codable {
    let data: PartnerStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrganizationDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let status: String?
    let description: String?
    let parentId: Int?
    let contactPerson: String?
    let contactPhone: String?
    let contactEmail: String?
    let address: String?
    let website: String?
    let logoUrl: String?
    let metadata: OrganizationMetadata?
    let installAppList: InstallAppList?
    let memberCount: Int?
    let departmentCount: Int?
    let positionCount: Int?
}

struct OrganizationMetadata: Codable {
    let spMchId: Int?
    let partnerId: Int?
    let agentId: Int?
    let shopId: Int?
}

struct PlusApiResultOrganizationDetailVO: Codable {
    let data: OrganizationDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPositionVO: Codable {
    let data: [PositionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PathNode: Codable {
    let id: Int?
    let name: String?
    let code: String?
    let level: Int?
    let isCurrent: Bool?
}

struct PlusApiResultListPositionDetailVO: Codable {
    let data: [PositionDetailVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PositionDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let description: String?
    let ownerId: Int?
    let parentId: Int?
    let level: Int?
    let isActive: Bool?
    let sortOrder: Int?
    let treePath: TreeNodePath?
    let fullPathName: String?
    let category: String?
    let levelName: String?
    let requiredExperienceYears: Int?
    let requiredEducation: String?
    let maxMemberCount: Int?
    let currentMemberCount: Int?
    let isFull: Bool?
}

struct TreeNodePath: Codable {
    let nodes: [PathNode]?
    let level: Int?
    let depth: Int?
    let pathName: String?
    let rootNode: PathNode?
    let parentNode: PathNode?
    let pathIds: [Int]?
    let currentNode: PathNode?
}

struct PageMemberVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [MemberVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageMemberVO: Codable {
    let data: PageMemberVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListDepartmentVO: Codable {
    let data: [DepartmentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DepartmentDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let code: String?
    let description: String?
    let ownerId: Int?
    let parentId: Int?
    let level: Int?
    let isActive: Bool?
    let sortOrder: Int?
    let treePath: TreeNodePath?
    let fullPathName: String?
    let managerId: Int?
    let phone: String?
    let email: String?
    let memberCount: Int?
    let childrenCount: Int?
}

struct PlusApiResultListDepartmentDetailVO: Codable {
    let data: [DepartmentDetailVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListOrganizationVO: Codable {
    let data: [OrganizationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrganizationStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalOrganizations: Int?
    let activeOrganizations: Int?
    let totalMembers: Int?
    let totalDepartments: Int?
    let totalPositions: Int?
}

struct PlusApiResultOrganizationStatisticsVO: Codable {
    let data: OrganizationStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPositionDetailVO: Codable {
    let data: PositionDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultMemberVO: Codable {
    let data: MemberVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageOrganizationVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [OrganizationVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageOrganizationVO: Codable {
    let data: PageOrganizationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultDepartmentDetailVO: Codable {
    let data: DepartmentDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderListQueryForm: Codable {
    let page: Int?
    let size: Int?
    let status: String?
    let orderType: String?
    let keyword: String?
    let startTime: String?
    let endTime: String?
}

struct PageOrderVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [OrderVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageOrderVO: Codable {
    let data: PageOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CouponInfoVO: Codable {
    let couponId: String?
    let couponName: String?
    let discountAmount: String?
    let couponType: String?
}

struct OrderAddressVO: Codable {
    let recipient: String?
    let phone: String?
    let address: String?
}

struct OrderDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: String?
    let orderSn: String?
    let orderType: String?
    let orderTypeName: String?
    let subject: String?
    let productId: String?
    let productImage: String?
    let quantity: Int?
    let productAmount: String?
    let shippingAmount: String?
    let discountAmount: String?
    let taxAmount: String?
    let totalAmount: String?
    let paidAmount: String?
    let paidPointsAmount: String?
    let refundedAmount: String?
    let status: String?
    let statusName: String?
    let refundStatus: String?
    let refundStatusName: String?
    let paymentMethod: String?
    let paymentProvider: String?
    let transactionId: String?
    let outTradeNo: String?
    let currency: String?
    let payTime: String?
    let expireTime: String?
    let completeTime: String?
    let cancelTime: String?
    let remark: String?
    let merchantRemark: String?
    let sourceChannel: String?
    let userId: Int?
    let username: String?
    let email: String?
    let receiverName: String?
    let receiverPhone: String?
    let receiverAddress: String?
    let logisticsCompany: String?
    let logisticsNo: String?
    let deliverTime: String?
    let couponInfo: CouponInfoVO?
    let items: [OrderItemVO]?
    let address: OrderAddressVO?
}

struct OrderItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let orderId: String?
    let categoryId: String?
    let productType: String?
    let productId: String?
    let skuId: String?
    let productName: String?
    let productImage: String?
    let quantity: Int?
    let unitPrice: String?
    let totalAmount: String?
    let discountAmount: String?
    let paidAmount: String?
    let refundedAmount: String?
    let skuSpec: String?
    let currency: String?
    let refundStatus: String?
    let reviewStatus: String?
    let paymentProvider: String?
    let paymentProductType: String?
    let expireTime: String?
}

struct PlusApiResultOrderDetailVO: Codable {
    let data: OrderDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderStatusVO: Codable {
    let orderId: String?
    let status: String?
    let statusName: String?
    let expireTime: Int?
}

struct PlusApiResultOrderStatusVO: Codable {
    let data: OrderStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalOrders: Int?
    let pendingPayment: Int?
    let pendingShipment: Int?
    let pendingReceipt: Int?
    let completed: Int?
    let totalAmount: String?
}

struct PlusApiResultOrderStatisticsVO: Codable {
    let data: OrderStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NotificationQueryForm: Codable {
    let type: String?
    let read: Bool?
    let page: Int?
    let size: Int?
    let sortBy: String?
    let sortDirection: String?
}

struct PageNotificationVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [NotificationVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageNotificationVO: Codable {
    let data: PageNotificationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NotificationDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let notificationId: String?
    let title: String?
    let content: String?
    let type: String?
    let status: String?
    let source: String?
    let redirectUrl: String?
    let isRead: Bool?
    let readAt: String?
    let extraData: [String: Any]?
}

struct PlusApiResultNotificationDetailVO: Codable {
    let data: NotificationDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultMapStringInteger: Codable {
    let data: [String: Int]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NotificationTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let name: String?
    let enabled: Bool?
    let pushMethod: String?
    let needReminder: Bool?
    let description: String?
}

struct PlusApiResultListNotificationTypeVO: Codable {
    let data: [NotificationTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListString: Codable {
    let data: [String]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DeviceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let deviceId: String?
    let deviceType: String?
    let deviceName: String?
    let pushToken: String?
    let osVersion: String?
    let appVersion: String?
    let isActive: Bool?
    let registerTime: String?
    let lastActiveAt: String?
}

struct PlusApiResultListDeviceVO: Codable {
    let data: [DeviceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NoteListQueryRequest: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortOrder: String?
    let folderId: String?
    let keyword: String?
}

struct NoteVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let content: String?
    let userId: Int?
    let folderId: String?
    let folderPath: String?
    let tags: [String]?
    let accessScope: String?
    let hasPassword: Bool?
    let coverImageUrl: String?
    let status: String?
    let summary: String?
    let favorited: Bool?
    let wordCount: Int?
}

struct PageNoteVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [NoteVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageNoteVO: Codable {
    let data: PageNoteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultNoteVO: Codable {
    let data: NoteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NoteStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalNotes: Int?
    let totalFolders: Int?
    let favoritedNotes: Int?
    let thisMonthNotes: Int?
    let thisWeekNotes: Int?
    let todayNotes: Int?
    let totalWords: Int?
    let lastUpdateTime: String?
    let folderNoteCounts: [String: Int]?
    let tagUsageCounts: [String: Int]?
}

struct PlusApiResultNoteStatisticsVO: Codable {
    let data: NoteStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListNoteFolderVO: Codable {
    let data: [NoteFolderVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct NewsDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let newsId: String?
    let title: String?
    let summary: String?
    let url: String?
    let source: String?
    let categoryId: Int?
    let tags: TagsContent?
    let publishTime: String?
}

struct PlusApiResultNewsDetailVO: Codable {
    let data: NewsDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageNewsVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [NewsVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageNewsVO: Codable {
    let data: PageNewsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MusicDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let musicId: String?
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let artist: String?
    let genre: String?
    let bitrate: Int?
    let fileSize: Int?
    let thumbnailUrl: String?
    let coverImages: ImageMediaResourceList?
    let resource: MusicMediaResource?
    let author: AuthorInfo?
    let status: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let playCount: Int?
    let downloadCount: Int?
    let likeCount: Int?
}

struct PlusApiResultMusicDetailVO: Codable {
    let data: MusicDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MusicStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalMusic: Int?
    let completedMusic: Int?
    let processingMusic: Int?
}

struct PlusApiResultMusicStatisticsVO: Codable {
    let data: MusicStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageMusicVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [MusicVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageMusicVO: Codable {
    let data: PageMusicVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AspectRatio: Codable {
    let ratio: String?
    let width: Double?
    let height: Double?
}

struct ModelInfoDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let modelId: String?
    let model: String?
    let name: String?
    let description: String?
    let channel: String?
    let vendor: String?
    let modelType: String?
    let family: String?
    let version: String?
    let openSource: Bool?
    let apiEndpoint: String?
    let ownedBy: String?
    let scenes: SceneContent?
    let tags: TagsContent?
    let limitInfo: ModelLimitInfo?
    let priceInfo: ModelPrice?
    let metadata: ModelMetadata?
    let defaultTemperature: Double?
    let defaultTopP: Double?
    let defaultFrequencyPenalty: Double?
    let defaultPresencePenalty: Double?
    let status: String?
    let usageCount: Int?
    let totalTokens: Int?
    let avgResponseTime: Int?
}

struct ModelLimitInfo: Codable {
    let unit: String?
    let items: [ModelLimitItem]?
}

struct ModelLimitItem: Codable {
    let type: String?
    let value: Double?
}

struct ModelMetadata: Codable {
    let durations: [Int]?
    let resolutions: [String]?
    let ratios: [AspectRatio]?
    let isMultimodal: Bool?
    let isReasoning: Bool?
    let isToolCall: Bool?
}

struct ModelPrice: Codable {
    let unit: String?
    let items: [ModelPriceItem]?
    let currency: String?
}

struct ModelPriceItem: Codable {
    let type: String?
    let price: Double?
}

struct PlusApiResultModelInfoDetailVO: Codable {
    let data: ModelInfoDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SceneContent: Codable {
    let scenes: [String]?
    let children: [SceneContent]?
}

struct ModelTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let name: String?
}

struct PlusApiResultListModelTypeVO: Codable {
    let data: [ModelTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ModelInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let modelId: String?
    let model: String?
    let name: String?
    let description: String?
    let channel: String?
    let modelType: String?
    let family: String?
    let version: String?
    let openSource: Bool?
    let status: String?
    let usageCount: Int?
}

struct PageModelInfoVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ModelInfoVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageModelInfoVO: Codable {
    let data: PageModelInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ModelStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalModels: Int?
    let activeModels: Int?
    let chatModels: Int?
    let imageModels: Int?
    let audioModels: Int?
}

struct PlusApiResultModelStatisticsVO: Codable {
    let data: ModelStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultModelPriceVO: Codable {
    let data: ModelPriceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InvoiceDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let invoiceId: String?
    let title: String?
    let titleType: String?
    let taxNo: String?
    let type: String?
    let status: String?
    let invoiceCode: String?
    let invoiceNo: String?
    let amountExcludingTax: Double?
    let taxAmount: Double?
    let totalAmount: Double?
    let taxRate: Double?
    let currency: String?
    let bankName: String?
    let bankAccount: String?
    let registerAddress: String?
    let registerPhone: String?
    let electronicUrl: String?
    let invoiceTime: String?
    let items: [InvoiceItemVO]?
}

struct InvoiceItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let itemId: String?
    let productName: String?
    let specification: String?
    let unit: String?
    let quantity: Double?
    let unitPriceExcludingTax: Double?
    let amountExcludingTax: Double?
    let taxAmount: Double?
    let totalAmount: Double?
    let taxRate: Double?
}

struct PlusApiResultInvoiceDetailVO: Codable {
    let data: InvoiceDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListInvoiceItemVO: Codable {
    let data: [InvoiceItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InvoiceStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalInvoices: Int?
    let pendingInvoices: Int?
    let completedInvoices: Int?
    let totalAmount: Double?
}

struct PlusApiResultInvoiceStatisticsVO: Codable {
    let data: InvoiceStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageInvoiceVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [InvoiceVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageInvoiceVO: Codable {
    let data: PageInvoiceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ImageDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let imageId: String?
    let title: String?
    let description: String?
    let url: String?
    let format: String?
    let width: Int?
    let height: Int?
    let aspectRatio: String?
    let fileSize: Int?
    let resource: ImageMediaResource?
    let author: AuthorInfo?
    let status: String?
    let isPublic: Bool?
    let isFavorite: Bool?
    let viewCount: Int?
    let downloadCount: Int?
    let likeCount: Int?
}

struct PlusApiResultImageDetailVO: Codable {
    let data: ImageDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ImageStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalImages: Int?
    let completedImages: Int?
    let processingImages: Int?
}

struct PlusApiResultImageStatisticsVO: Codable {
    let data: ImageStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageImageVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ImageVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageImageVO: Codable {
    let data: PageImageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct HistoryStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let browseCount: Int?
    let operationCount: Int?
    let generationCount: Int?
    let loginCount: Int?
    let activeSessionCount: Int?
    let todayOperationCount: Int?
    let weeklyOperationCount: Int?
    let monthlyOperationCount: Int?
    let mostFrequentAction: String?
    let mostFrequentBrowseType: String?
}

struct PlusApiResultHistoryStatisticsVO: Codable {
    let data: HistoryStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BrowseStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalCount: Int?
    let totalDuration: Int?
    let averageDuration: Int?
    let todayCount: Int?
    let weeklyCount: Int?
    let monthlyCount: Int?
    let typeDistribution: [String: Int]?
    let sourceDistribution: [String: Int]?
    let dailyTrend: [String: Int]?
}

struct PlusApiResultBrowseStatisticsVO: Codable {
    let data: BrowseStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListSessionInfoVO: Codable {
    let data: [SessionInfoVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SessionInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let sessionId: String?
    let loginTime: String?
    let lastActivityTime: String?
    let ipAddress: String?
    let location: String?
    let device: String?
    let browser: String?
    let os: String?
    let loginMethod: String?
    let status: String?
    let remainingMinutes: Int?
}

struct PlusApiResultSessionInfoVO: Codable {
    let data: SessionInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OperationHistoryQueryForm: Codable {
    let action: String?
    let result: String?
    let page: Int?
    let size: Int?
    let sortField: String?
    let sortOrder: String?
}

struct OperationHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let action: String?
    let description: String?
    let targetType: String?
    let targetId: String?
    let targetName: String?
    let result: String?
    let operationTime: String?
    let ipAddress: String?
    let userAgent: String?
}

struct PageOperationHistoryVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [OperationHistoryVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageOperationHistoryVO: Codable {
    let data: PageOperationHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListOperationHistoryVO: Codable {
    let data: [OperationHistoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct LoginHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let loginTime: String?
    let ipAddress: String?
    let location: String?
    let device: String?
    let browser: String?
    let os: String?
    let loginMethod: String?
    let status: String?
    let result: String?
    let failureReason: String?
}

struct PageLoginHistoryVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [LoginHistoryVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageLoginHistoryVO: Codable {
    let data: PageLoginHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerationHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let taskId: String?
    let title: String?
    let description: String?
    let status: String?
    let duration: Int?
    let resultUrl: String?
    let resultPreview: String?
    let startTime: String?
    let endTime: String?
    let modelName: String?
    let tokenUsage: Int?
}

struct PageGenerationHistoryVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [GenerationHistoryVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageGenerationHistoryVO: Codable {
    let data: PageGenerationHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListGenerationHistoryVO: Codable {
    let data: [GenerationHistoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BrowseHistoryQueryForm: Codable {
    let type: String?
    let targetId: String?
    let page: Int?
    let size: Int?
    let sortField: String?
    let sortOrder: String?
}

struct BrowseHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let targetId: String?
    let targetName: String?
    let targetDescription: String?
    let targetIcon: String?
    let browseTime: String?
    let duration: Int?
    let source: String?
}

struct PageBrowseHistoryVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [BrowseHistoryVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageBrowseHistoryVO: Codable {
    let data: PageBrowseHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultVoiceSpeakerGenerationVO: Codable {
    let data: VoiceSpeakerGenerationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceSpeakerGenerationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let speakerId: String?
    let speakerName: String?
    let description: String?
    let previewAudioUrl: String?
    let gender: String?
    let ageRange: String?
    let language: String?
    let style: String?
    let status: String?
    let favorite: Bool?
    let completedAt: String?
}

struct Pageable: Codable {
    let page: Int?
    let size: Int?
    let sort: [String]?
}

struct PageGenerationTaskVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [GenerationTaskVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageGenerationTaskVO: Codable {
    let data: PageGenerationTaskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceSpeakerListQueryForm: Codable {
    let gender: String?
    let language: String?
    let style: String?
    let ageRange: String?
    let pageNum: Int?
    let pageSize: Int?
    let onlyFavorite: Bool?
}

struct PageVoiceSpeakerListVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [VoiceSpeakerListVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageVoiceSpeakerListVO: Codable {
    let data: PageVoiceSpeakerListVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceSpeakerItem: Codable {
    let speakerId: String?
    let speakerName: String?
    let description: String?
    let previewAudioUrl: String?
    let gender: String?
    let ageRange: String?
    let language: String?
    let style: String?
    let favorite: Bool?
    let createdAt: String?
}

struct VoiceSpeakerListVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let speakers: [VoiceSpeakerItem]?
    let total: Int?
    let page: Int?
    let size: Int?
}

struct GenerationStyleDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let styleId: String?
    let name: String?
    let description: String?
    let type: String?
    let configParams: [String: Any]?
    let tags: TagsContent?
    let coverImage: ImageMediaResource?
    let assets: AssetMediaResourceList?
    let previewImage: ImageMediaResource?
    let isPublic: Bool?
    let status: String?
    let usageCount: Int?
}

struct PlusApiResultGenerationStyleDetailVO: Codable {
    let data: GenerationStyleDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListStyleTypeVO: Codable {
    let data: [StyleTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct StyleTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let name: String?
}

struct PlusApiResultStyleStatisticsVO: Codable {
    let data: StyleStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct StyleStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalStyles: Int?
    let activeStyles: Int?
    let imageStyles: Int?
    let videoStyles: Int?
    let musicStyles: Int?
}

struct PageGenerationStyleVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [GenerationStyleVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageGenerationStyleVO: Codable {
    let data: PageGenerationStyleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultSoundEffectGenerationVO: Codable {
    let data: SoundEffectGenerationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SoundEffectGenerationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let soundEffectId: String?
    let name: String?
    let description: String?
    let audioUrl: String?
    let waveformUrl: String?
    let category: String?
    let duration: Int?
    let status: String?
    let completedAt: String?
}

struct SoundEffectCategoriesQueryForm: Codable {
    let parentCategory: String?
    let language: String?
    let includeSubcategories: Bool?
}

struct CategoryItem: Codable {
    let id: String?
    let name: String?
    let description: String?
    let parentId: String?
    let subcategories: [CategoryItem]?
    let tags: [String]?
}

struct PlusApiResultSoundEffectCategoriesVO: Codable {
    let data: SoundEffectCategoriesVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SoundEffectCategoriesVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let categories: [CategoryItem]?
}

struct MusicStylesQueryForm: Codable {
    let category: String?
    let genre: String?
    let style: String?
    let mood: String?
    let instrument: String?
}

struct GenreVO: Codable {
    let name: String?
    let description: String?
}

struct InstrumentVO: Codable {
    let name: String?
    let description: String?
}

struct MoodVO: Codable {
    let name: String?
    let description: String?
}

struct MusicStylesVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let genres: [GenreVO]?
    let styles: [StyleVO]?
    let moods: [MoodVO]?
    let instruments: [InstrumentVO]?
}

struct PlusApiResultMusicStylesVO: Codable {
    let data: MusicStylesVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct StyleVO: Codable {
    let name: String?
    let description: String?
    let genre: String?
}

struct CharacterGenerationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let characterId: String?
    let name: String?
    let description: String?
    let imageUrl: String?
    let thumbnailUrl: String?
    let style: String?
    let status: String?
    let completedAt: String?
}

struct PlusApiResultCharacterGenerationVO: Codable {
    let data: CharacterGenerationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CharacterListQueryForm: Codable {
    let style: String?
    let keyword: String?
    let pageNum: Int?
    let pageSize: Int?
    let sortBy: String?
    let sortOrder: String?
}

struct CharacterListVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let characters: [CharacterItem]?
    let total: Int?
    let page: Int?
    let size: Int?
}

struct PageCharacterListVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [CharacterListVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageCharacterListVO: Codable {
    let data: PageCharacterListVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceListQueryForm: Codable {
    let language: String?
    let gender: String?
    let style: String?
    let ageRange: String?
}

struct PlusApiResultVoiceListVO: Codable {
    let data: VoiceListVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VoiceItem: Codable {
    let voiceId: String?
    let name: String?
    let description: String?
    let language: String?
    let gender: String?
    let style: String?
    let previewAudioUrl: String?
}

struct VoiceListVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let voices: [VoiceItem]?
}

struct FileSystemNodeListForm: Codable {
    let diskId: String?
    let parentId: String?
    let keyword: String?
    let sortField: String?
    let sortOrder: String?
    let pageNum: Int?
    let pageSize: Int?
}

struct PageFileSystemNodeVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [FileSystemNodeVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageFileSystemNodeVO: Codable {
    let data: PageFileSystemNodeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FileSystemDiskVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let diskId: String?
    let diskUuid: String?
    let name: String?
    let type: String?
    let owner: String?
    let ownerId: String?
    let totalSize: Int?
    let usedSize: Int?
    let remainingSize: Int?
    let usageRate: Double?
    let fileCount: Int?
    let description: String?
}

struct PlusApiResultListFileSystemDiskVO: Codable {
    let data: [FileSystemDiskVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultFileSystemDiskVO: Codable {
    let data: FileSystemDiskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListFeedItemVO: Codable {
    let data: [FeedItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FeedListQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let type: String?
    let contentType: String?
    let keyword: String?
    let authorId: Int?
    let size: Int?
    let page: Int?
}

struct FeedbackQueryForm: Codable {
    let type: String?
    let status: String?
    let page: Int?
    let size: Int?
}

struct PageFeedbackVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [FeedbackVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageFeedbackVO: Codable {
    let data: PageFeedbackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TutorialQueryForm: Codable {
    let categoryId: String?
    let keyword: String?
    let page: Int?
    let size: Int?
}

struct PageTutorialVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [TutorialVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageTutorialVO: Codable {
    let data: PageTutorialVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TutorialVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let description: String?
    let categoryId: String?
    let categoryName: String?
    let viewCount: Int?
    let likeCount: Int?
    let coverImage: String?
}

struct PlusApiResultTutorialDetailVO: Codable {
    let data: TutorialDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TutorialDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let description: String?
    let content: String?
    let categoryId: String?
    let categoryName: String?
    let viewCount: Int?
    let likeCount: Int?
    let coverImage: String?
}

struct PlusApiResultSupportInfoVO: Codable {
    let data: SupportInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SupportInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let hotline: String?
    let email: String?
    let workingHours: String?
    let wechatQrcode: String?
    let onlineSupportUrl: String?
    let faqUrl: String?
    let helpCenterUrl: String?
}

struct SupportMessageQueryForm: Codable {
    let sessionId: String?
    let page: Int?
    let size: Int?
}

struct PageSupportMessageVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [SupportMessageVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageSupportMessageVO: Codable {
    let data: PageSupportMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ReportQueryForm: Codable {
    let type: String?
    let status: String?
    let page: Int?
    let size: Int?
}

struct PageReportVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ReportVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageReportVO: Codable {
    let data: PageReportVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultReportDetailVO: Codable {
    let data: ReportDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ReportDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let targetId: String?
    let content: String?
    let attachmentUrl: String?
    let screenshotUrl: String?
    let status: String?
    let submitTime: String?
    let processTime: String?
    let processResult: String?
}

struct OnboardingStepVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let description: String?
    let order: Int?
    let completed: Bool?
    let completeTime: String?
}

struct PlusApiResultListOnboardingStepVO: Codable {
    let data: [OnboardingStepVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FaqQueryForm: Codable {
    let categoryId: String?
    let keyword: String?
    let page: Int?
    let size: Int?
}

struct FaqVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let question: String?
    let categoryId: String?
    let categoryName: String?
    let viewCount: Int?
    let helpfulCount: Int?
}

struct PageFaqVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [FaqVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageFaqVO: Codable {
    let data: PageFaqVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FaqDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let question: String?
    let answer: String?
    let categoryId: String?
    let categoryName: String?
    let viewCount: Int?
    let helpfulCount: Int?
}

struct PlusApiResultFaqDetailVO: Codable {
    let data: FaqDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListFaqVO: Codable {
    let data: [FaqVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FaqCategoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let icon: String?
    let sortOrder: Int?
    let faqCount: Int?
}

struct PlusApiResultListFaqCategoryVO: Codable {
    let data: [FaqCategoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteQueryForm: Codable {
    let favoriteType: String?
    let type: String?
    let folderId: String?
    let keyword: String?
    let sortField: String?
    let sortDirection: String?
    let page: Int?
    let size: Int?
}

struct PageFavoriteItemVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [FavoriteItemVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageFavoriteItemVO: Codable {
    let data: PageFavoriteItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let favoriteId: String?
    let favoriteType: String?
    let targetId: String?
    let favoriteName: String?
    let favoriteDescription: String?
    let folderId: String?
    let folderName: String?
    let tags: String?
    let favoriteTime: String?
    let updateTime: String?
    let targetInfo: Any?
}

struct PlusApiResultFavoriteDetailVO: Codable {
    let data: FavoriteDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalCount: Int?
    let folderCount: Int?
    let monthlyAdded: Int?
    let lastFavoritedTime: String?
    let countByType: [String: Int]?
}

struct PlusApiResultFavoriteStatisticsVO: Codable {
    let data: FavoriteStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListFavoriteItemVO: Codable {
    let data: [FavoriteItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListFavoriteFolderVO: Codable {
    let data: [FavoriteFolderVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FavoriteTypeCountVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let count: Int?
    let typeName: String?
}

struct PlusApiResultListFavoriteTypeCountVO: Codable {
    let data: [FavoriteTypeCountVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultFavoriteCheckVO: Codable {
    let data: FavoriteCheckVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DriveItemListForm: Codable {
    let keyword: String?
    let assetType: String?
    let folderId: String?
    let diskId: String?
    let sortField: String?
    let sortDirection: String?
    let pageNum: Int?
    let pageSize: Int?
}

struct PageDriveItemVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [DriveItemVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageDriveItemVO: Codable {
    let data: PageDriveItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DriveItemDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let itemId: String?
    let itemUuid: String?
    let itemName: String?
    let fileType: String?
    let directory: Bool?
    let assetType: String?
    let mimeType: String?
    let extension: String?
    let size: Int?
    let parentId: String?
    let path: String?
    let objectKey: String?
    let status: String?
    let resource: FileMediaResource?
    let coverImage: ImageMediaResource?
    let diskId: String?
    let uploadStatus: String?
    let description: String?
    let author: String?
    let versionId: String?
    let referenceFileId: String?
    let workspaceId: String?
    let projectId: String?
    let etag: String?
}

struct PlusApiResultDriveItemDetailVO: Codable {
    let data: DriveItemDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DocumentListQueryRequest: Codable {
    let keyword: String?
    let folderId: String?
    let sortField: String?
    let sortOrder: String?
    let pageNum: Int?
    let pageSize: Int?
}

struct DocumentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let documentId: String?
    let documentUuid: String?
    let title: String?
    let folderId: String?
    let assetType: String?
    let mimeType: String?
    let description: String?
    let tags: [String]?
    let status: String?
    let summary: String?
    let wordCount: Int?
    let charCount: Int?
}

struct PageDocumentVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [DocumentVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageDocumentVO: Codable {
    let data: PageDocumentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DocumentDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let documentId: String?
    let documentUuid: String?
    let title: String?
    let folderId: String?
    let assetType: String?
    let mimeType: String?
    let description: String?
    let tags: [String]?
    let status: String?
    let summary: String?
    let wordCount: Int?
    let charCount: Int?
    let path: String?
    let objectKey: String?
    let versionId: String?
    let contentVersion: String?
    let extension: String?
}

struct PlusApiResultDocumentDetailVO: Codable {
    let data: DocumentDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListTrendingItemVO: Codable {
    let data: [TrendingItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TrendingItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let description: String?
    let icon: String?
    let cover: String?
    let type: String?
    let url: String?
    let hotScore: Int?
    let rating: Double?
    let downloads: Int?
    let favorites: Int?
    let comments: Int?
    let author: String?
    let tags: [String]?
    let price: String?
    let isFree: Bool?
    let updateTime: String?
}

struct PlusApiResultListTodoItemVO: Codable {
    let data: [TodoItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TodoItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let description: String?
    let status: String?
    let priority: String?
    let dueDate: String?
    let createTime: String?
    let updateTime: String?
    let completedAt: String?
    let creator: String?
    let assignee: String?
    let resourceId: String?
    let resourceType: String?
    let tags: [String]?
    let progress: Int?
    let reminderTime: String?
}

struct AchievementStatisticsVO: Codable {
    let totalAchievements: Int?
    let unlockedAchievements: Int?
    let completionRate: Double?
    let totalPoints: Int?
    let recentAchievements: [AchievementVO]?
}

struct AchievementVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let description: String?
    let icon: String?
    let level: String?
    let status: String?
    let unlockedAt: String?
    let progress: Int?
    let target: Int?
    let type: String?
    let points: Int?
    let sort: Int?
}

struct GenerationStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let todayCount: Int?
    let weekCount: Int?
    let monthCount: Int?
    let totalCount: Int?
    let avgGenerationTime: Int?
    let maxGenerationTime: Int?
    let minGenerationTime: Int?
    let successRate: Double?
    let mostUsedModel: String?
    let typeDistribution: GenerationTypeDistributionVO?
}

struct GenerationTypeDistributionVO: Codable {
    let text: Double?
    let image: Double?
    let audio: Double?
    let video: Double?
    let code: Double?
}

struct PlusApiResultUserStatisticsVO: Codable {
    let data: UserStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PrivilegeVO: Codable {
    let privilegeId: String?
    let name: String?
    let description: String?
    let icon: String?
    let type: String?
    let status: String?
}

struct UsageFrequencyVO: Codable {
    let monday: Int?
    let tuesday: Int?
    let wednesday: Int?
    let thursday: Int?
    let friday: Int?
    let saturday: Int?
    let sunday: Int?
}

struct UsageStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let todayUsage: Int?
    let weekUsage: Int?
    let monthUsage: Int?
    let totalUsage: Int?
    let avgDailyUsage: Double?
    let maxDailyUsage: Int?
    let frequency: UsageFrequencyVO?
    let timeDistribution: UsageTimeDistributionVO?
}

struct UsageTimeDistributionVO: Codable {
    let midnight: Int?
    let morning: Int?
    let afternoon: Int?
    let evening: Int?
}

struct UserLevelVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let icon: String?
    let description: String?
    let level: Int?
    let currentExp: Int?
    let requiredExp: Int?
    let expProgress: Double?
    let privileges: [PrivilegeVO]?
    let validUntil: String?
    let status: String?
}

struct UserStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: String?
    let username: String?
    let avatar: String?
    let registeredAt: String?
    let lastLoginAt: String?
    let loginCount: Int?
    let totalUsageTime: Int?
    let totalGenerations: Int?
    let totalProjects: Int?
    let totalFiles: Int?
    let totalStorage: Int?
    let level: UserLevelVO?
    let vipInfo: VipStatisticsVO?
    let achievementStats: AchievementStatisticsVO?
    let usageStats: UsageStatisticsVO?
    let generationStats: GenerationStatisticsVO?
}

struct VipPrivilegeVO: Codable {
    let id: String?
    let name: String?
    let description: String?
    let icon: String?
    let status: String?
    let type: String?
}

struct VipRenewalVO: Codable {
    let price: String?
    let period: String?
    let renewalUrl: String?
    let autoRenew: Bool?
}

struct VipStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let status: String?
    let level: String?
    let startedAt: String?
    let expiredAt: String?
    let remainingDays: Int?
    let totalDays: Int?
    let privileges: [VipPrivilegeVO]?
    let renewalInfo: VipRenewalVO?
    let upgradeInfo: VipUpgradeVO?
}

struct VipUpgradeVO: Codable {
    let price: String?
    let targetLevel: String?
    let upgradeUrl: String?
    let discount: String?
}

struct PlusApiResultVipStatisticsVO: Codable {
    let data: VipStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUsageStatisticsVO: Codable {
    let data: UsageStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultStorageStatisticsVO: Codable {
    let data: StorageStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct StorageStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalStorage: Int?
    let usedStorage: Int?
    let remainingStorage: Int?
    let usageRate: Double?
    let typeDistribution: StorageTypeDistributionVO?
    let trend: StorageTrendVO?
}

struct StorageTrendVO: Codable {
    let last7Days: Int?
    let last30Days: Int?
    let last90Days: Int?
    let avgDailyGrowth: Int?
}

struct StorageTypeDistributionVO: Codable {
    let text: Double?
    let image: Double?
    let audio: Double?
    let video: Double?
    let other: Double?
}

struct PlusApiResultGenerationStatisticsVO: Codable {
    let data: GenerationStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListShortcutVO: Codable {
    let data: [ShortcutVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShortcutVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let icon: String?
    let url: String?
    let type: String?
    let sort: Int?
    let group: String?
    let description: String?
    let isDefault: Bool?
    let enabled: Bool?
    let usageCount: Int?
    let lastUsedAt: String?
}

struct PlusApiResultListRecommendationVO: Codable {
    let data: [RecommendationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RecommendationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let title: String?
    let description: String?
    let icon: String?
    let image: String?
    let url: String?
    let rating: Double?
    let hotScore: Int?
    let reason: String?
    let scenarios: [String]?
    let tags: [String]?
    let isFree: Bool?
    let price: String?
    let priority: Int?
}

struct PlusApiResultUserLevelVO: Codable {
    let data: UserLevelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChartConfigVO: Codable {
    let showLegend: Bool?
    let showTooltip: Bool?
    let responsive: Bool?
    let height: Int?
}

struct ChartDataVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let title: String?
    let labels: [String]?
    let datasets: [DatasetVO]?
    let config: ChartConfigVO?
}

struct DailyUsageVO: Codable {
    let generationCount: Int?
    let usageTime: Int?
    let storageUsage: Int?
}

struct DatasetVO: Codable {
    let label: String?
    let data: [Any]?
    let backgroundColor: [String]?
    let borderColor: [String]?
    let borderWidth: Int?
}

struct HomeDashboardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userInfo: UserInfoVO?
    let statistics: StatisticsVO?
    let shortcuts: [ShortcutVO]?
    let recentActivities: [RecentActivityVO]?
    let recentProjects: [RecentProjectVO]?
    let todoItems: [TodoItemVO]?
    let recommendations: [RecommendationVO]?
    let trendingItems: [TrendingItemVO]?
    let achievements: [AchievementVO]?
    let notifications: [PopupNotificationVO]?
    let chartData: [ChartDataVO]?
}

struct NotificationButtonVO: Codable {
    let text: String?
    let type: String?
    let url: String?
    let action: String?
    let closeOnClick: Bool?
}

struct PlusApiResultHomeDashboardVO: Codable {
    let data: HomeDashboardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PopupNotificationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let content: String?
    let type: String?
    let icon: String?
    let image: String?
    let url: String?
    let buttons: [NotificationButtonVO]?
    let needConfirm: Bool?
    let closable: Bool?
    let duration: Int?
    let priority: Int?
}

struct RecentActivityVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let type: String?
    let title: String?
    let description: String?
    let icon: String?
    let url: String?
    let status: String?
    let resourceId: String?
    let resourceType: String?
    let creator: String?
    let createTime: String?
    let read: Bool?
    let priority: Int?
}

struct RecentProjectVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let description: String?
    let icon: String?
    let cover: String?
    let type: String?
    let status: String?
    let url: String?
    let createTime: String?
    let updateTime: String?
    let memberCount: Int?
    let fileCount: Int?
    let size: Int?
    let tags: [String]?
    let isPublic: Bool?
    let isFavorite: Bool?
}

struct StatisticsVO: Codable {
    let totalProjects: Int?
    let totalGenerations: Int?
    let totalUsageTime: Int?
    let storage: StorageStatisticsVO?
    let dailyUsage: DailyUsageVO?
}

struct PlusApiResultChartDataVO: Codable {
    let data: ChartDataVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListRecentActivityVO: Codable {
    let data: [RecentActivityVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListAchievementVO: Codable {
    let data: [AchievementVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CurrencyTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let name: String?
}

struct PlusApiResultListCurrencyTypeVO: Codable {
    let data: [CurrencyTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListExchangeRateVO: Codable {
    let data: [ExchangeRateVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageCurrencyVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [CurrencyVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageCurrencyVO: Codable {
    let data: PageCurrencyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListCurrencyVO: Codable {
    let data: [CurrencyVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CouponListForm: Codable {
    let type: String?
    let status: String?
    let keyword: String?
    let pageNum: Int?
    let pageSize: Int?
}

struct CouponVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let couponId: String?
    let name: String?
    let type: String?
    let typeName: String?
    let description: String?
    let amount: Int?
    let discount: Double?
    let minConsume: Int?
    let startTime: String?
    let endTime: String?
    let total: Int?
    let getLimit: Int?
    let receivedCount: Int?
    let usedCount: Int?
    let status: String?
    let statusName: String?
    let stackable: Bool?
    let scopeType: Int?
    let scopeValue: String?
    let remainingCount: Int?
    let canReceive: Bool?
}

struct PageCouponVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [CouponVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageCouponVO: Codable {
    let data: PageCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultCouponVO: Codable {
    let data: CouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CouponStatisticsVO: Codable {
    let totalCoupons: Int?
    let unusedCount: Int?
    let usedCount: Int?
    let expiredCount: Int?
}

struct PlusApiResultCouponStatisticsVO: Codable {
    let data: CouponStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserCouponListForm: Codable {
    let status: String?
    let type: String?
    let pageNum: Int?
    let pageSize: Int?
}

struct PageUserCouponVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [UserCouponVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageUserCouponVO: Codable {
    let data: PageUserCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CommentDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let commentId: String?
    let content: String?
    let contentType: String?
    let contentId: Int?
    let userId: Int?
    let status: String?
    let likes: Int?
    let replyCount: Int?
    let isTop: Bool?
    let parentId: Int?
    let ipAddress: String?
    let deviceInfo: String?
    let replies: [CommentVO]?
}

struct PlusApiResultCommentDetailVO: Codable {
    let data: CommentDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageCommentVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [CommentVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageCommentVO: Codable {
    let data: PageCommentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CommentStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalComments: Int?
}

struct PlusApiResultCommentStatisticsVO: Codable {
    let data: CommentStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CollectionDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let collectionId: String?
    let name: String?
    let description: String?
    let type: String?
    let coverImage: String?
    let isPublic: Bool?
    let isPinned: Bool?
    let itemCount: Int?
    let viewCount: Int?
    let favoriteCount: Int?
    let parentId: Int?
    let items: [CollectionItemVO]?
}

struct PlusApiResultCollectionDetailVO: Codable {
    let data: CollectionDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListCollectionVO: Codable {
    let data: [CollectionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListCollectionItemVO: Codable {
    let data: [CollectionItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CollectionTreeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let collectionId: String?
    let name: String?
    let type: String?
    let itemCount: Int?
    let parentId: Int?
}

struct PlusApiResultListCollectionTreeVO: Codable {
    let data: [CollectionTreeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageCollectionVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [CollectionVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageCollectionVO: Codable {
    let data: PageCollectionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatSessionQueryForm: Codable {
    let sessionId: Int?
    let name: String?
    let type: String?
    let page: Int?
    let size: Int?
    let sortBy: String?
    let sortDirection: String?
    let includeMessageCount: Bool?
}

struct PageChatSessionVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ChatSessionVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageChatSessionVO: Codable {
    let data: PageChatSessionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatSessionDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let type: String?
    let status: String?
    let userId: String?
    let modelId: String?
    let systemPrompt: String?
    let temperature: Double?
    let maxTokens: Int?
    let topP: Double?
    let messageCount: Int?
    let unreadCount: Int?
    let lastMessageTime: String?
    let lastMessageContent: String?
    let resourceId: String?
    let resourceType: String?
    let createTime: String?
    let updateTime: String?
    let extra: [String: Any]?
    let stats: SessionStatsVO?
}

struct PlusApiResultChatSessionDetailVO: Codable {
    let data: ChatSessionDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SessionStatsVO: Codable {
    let totalMessages: Int?
    let userMessages: Int?
    let aiMessages: Int?
    let totalTokens: Int?
    let avgResponseTime: Int?
    let totalDuration: Int?
}

struct ChatMessageQueryForm: Codable {
    let sessionId: Int?
    let messageId: Int?
    let page: Int?
    let size: Int?
    let sort: String?
}

struct PageChatMessageVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ChatMessageVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageChatMessageVO: Codable {
    let data: PageChatMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CharacterDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let characterId: String?
    let name: String?
    let type: String?
    let description: String?
    let avatar: ImageMediaResource?
    let threeViewImage: ImageMediaResource?
    let gridShotsImage: ImageMediaResource?
    let avatarVideo: VideoMediaResource?
    let status: String?
    let agentId: Int?
    let personality: String?
    let background: String?
    let interactionSettings: String?
    let version: String?
    let isPublic: Bool?
    let usageCount: Int?
    let likeCount: Int?
    let lastUsedAt: String?
}

struct PlusApiResultCharacterDetailVO: Codable {
    let data: CharacterDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageCharacterVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [CharacterVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageCharacterVO: Codable {
    let data: PageCharacterVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListCategoryVO: Codable {
    let data: [CategoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CategoryDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let code: String?
    let icon: String?
    let description: String?
    let parentId: Int?
    let parentName: String?
    let sort: Int?
    let status: Int?
    let type: String?
    let groupName: String?
    let visible: Int?
}

struct PlusApiResultCategoryDetailVO: Codable {
    let data: CategoryDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CategoryTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let type: String?
    let name: String?
    let description: String?
}

struct PlusApiResultListCategoryTypeVO: Codable {
    let data: [CategoryTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CategoryTreeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let code: String?
    let icon: String?
    let parentId: Int?
    let sort: Int?
    let status: Int?
    let children: [CategoryTreeVO]?
}

struct PlusApiResultListCategoryTreeVO: Codable {
    let data: [CategoryTreeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListTagVO: Codable {
    let data: [TagVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CartGroupVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let uuid: String?
    let name: String?
    let items: [CartItemVO]?
    let totalQuantity: Int?
    let totalPrice: Double?
}

struct PlusApiResultShoppingCartVO: Codable {
    let data: ShoppingCartVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShoppingCartVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let cartId: String?
    let uuid: String?
    let name: String?
    let description: String?
    let owner: String?
    let ownerId: Int?
    let status: String?
    let groups: [CartGroupVO]?
    let totalQuantity: Int?
    let totalPrice: Double?
    let selectedQuantity: Int?
    let selectedPrice: Double?
}

struct CartStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let cartId: String?
    let itemCount: Int?
    let totalQuantity: Int?
    let totalPrice: Double?
    let selectedItemCount: Int?
    let selectedQuantity: Int?
    let selectedPrice: Double?
}

struct PlusApiResultCartStatisticsVO: Codable {
    let data: CartStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListCartItemVO: Codable {
    let data: [CartItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultQrCodeStatusVO: Codable {
    let data: QrCodeStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct QrCodeStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let status: String?
    let userInfo: UserInfoVO?
    let token: LoginVO?
}

struct PlusApiResultListSensitiveWordListVO: Codable {
    let data: [SensitiveWordListVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SensitiveWordListVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let listId: String?
    let name: String?
    let description: String?
    let type: String?
    let wordCount: Int?
    let categories: [String]?
    let version: String?
    let enabled: Bool?
}

struct FrameDetection: Codable {
    let timestamp: Int?
    let result: String?
    let riskLevel: String?
}

struct PlusApiResultVideoAuditStatusVO: Codable {
    let data: VideoAuditStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoAuditStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let status: String?
    let progress: Int?
    let processedDuration: Int?
    let totalDuration: Int?
    let detections: [FrameDetection]?
    let estimatedCompleteTime: String?
}

struct AuditRecordQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let contentType: String?
    let result: String?
    let riskLevel: String?
    let startDate: String?
    let endDate: String?
    let checkTypes: [String]?
    let keyword: String?
    let size: Int?
    let page: Int?
}

struct AuditRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: String?
    let contentId: String?
    let contentType: String?
    let contentPreview: String?
    let result: String?
    let riskLevel: String?
    let checkTypes: [String]?
    let violationTypes: [String]?
    let auditTime: String?
    let processTime: Int?
}

struct PageAuditRecordVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [AuditRecordVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageAuditRecordVO: Codable {
    let data: PageAuditRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AuditRecordDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: String?
    let contentId: String?
    let contentType: String?
    let originalContent: String?
    let processedContent: String?
    let userId: String?
    let result: String?
    let riskLevel: String?
    let confidence: Double?
    let detectionResults: [DetectionResult]?
    let checkTypes: [String]?
    let scene: String?
    let deviceInfo: [String: Any]?
    let ipAddress: String?
    let location: String?
    let auditTime: String?
    let processTime: Int?
    let hasAppeal: Bool?
}

struct DetectionResult: Codable {
    let type: String?
    let hit: Bool?
    let confidence: Double?
    let keywords: [String]?
}

struct PlusApiResultAuditRecordDetailVO: Codable {
    let data: AuditRecordDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AuditPolicyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let policyId: String?
    let name: String?
    let description: String?
    let scenes: [String]?
    let detectionTypes: [DetectionTypeConfig]?
    let thresholds: [String: Double]?
    let enabled: Bool?
    let priority: Int?
}

struct DetectionTypeConfig: Codable {
    let type: String?
    let name: String?
    let enabled: Bool?
    let sensitivity: String?
    let threshold: Double?
}

struct PlusApiResultListAuditPolicyVO: Codable {
    let data: [AuditPolicyVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct MyAuditRecordQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let contentType: String?
    let result: String?
    let startDate: String?
    let endDate: String?
    let size: Int?
    let page: Int?
}

struct PageAuditAppealVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [AuditAppealVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageAuditAppealVO: Codable {
    let data: PageAuditAppealVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AuditAppealStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let appealId: String?
    let recordId: String?
    let currentStatus: String?
    let statusDescription: String?
    let progress: Int?
    let estimatedCompleteTime: String?
    let result: String?
    let canAddEvidence: Bool?
    let canCancel: Bool?
}

struct PlusApiResultAuditAppealStatusVO: Codable {
    let data: AuditAppealStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AssetListForm: Codable {
    let type: String?
    let folderId: String?
    let keyword: String?
    let sortField: String?
    let sortDirection: String?
    let pageNum: Int?
    let pageSize: Int?
}

struct AssetVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let assetId: String?
    let assetName: String?
    let assetType: String?
    let fileType: String?
    let mimeType: String?
    let size: Int?
    let description: String?
    let tags: [String]?
    let folderId: String?
    let status: String?
    let coverImage: ImageMediaResource?
    let assets: [AssetMediaResource]?
    let primaryUrl: String?
    let thumbnailUrl: String?
}

struct PageAssetVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [AssetVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageAssetVO: Codable {
    let data: PageAssetVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AssetDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let assetId: String?
    let assetName: String?
    let assetType: String?
    let fileType: String?
    let fileTypeName: String?
    let mimeType: String?
    let size: Int?
    let description: String?
    let tags: [String]?
    let folderId: String?
    let status: String?
    let statusName: String?
    let coverImage: ImageMediaResource?
    let assets: [AssetMediaResource]?
    let primaryUrl: String?
    let thumbnailUrl: String?
    let diskId: String?
    let path: String?
    let versionId: String?
    let downloadCount: Int?
    let favorited: Bool?
    let author: String?
    let extension: String?
}

struct PlusApiResultAssetDetailVO: Codable {
    let data: AssetDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AssetDownloadForm: Codable {
    let format: String?
}

struct DownloadUrlVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let resource: AssetMediaResource?
    let expiresIn: Int?
}

struct PlusApiResultDownloadUrlVO: Codable {
    let data: DownloadUrlVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AssetStatisticsVO: Codable {
    let totalAssets: Int?
    let imageCount: Int?
    let videoCount: Int?
    let audioCount: Int?
}

struct PlusApiResultAssetStatisticsVO: Codable {
    let data: AssetStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListFolderVO: Codable {
    let data: [FolderVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AppDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let appId: String?
    let name: String?
    let description: String?
    let icon: ImageMediaResource?
    let iconUrl: String?
    let accessUrl: String?
    let version: String?
    let appType: String?
    let status: String?
    let projectId: Int?
    let platforms: AppPlatforms?
    let packageName: String?
    let bundleId: String?
    let storeUrl: String?
    let downloadUrl: String?
}

struct AppPlatforms: Codable {
    let platforms: [String]?
}

struct PlusApiResultAppDetailVO: Codable {
    let data: AppDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AppStatisticsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let totalApps: Int?
}

struct PlusApiResultAppStatisticsVO: Codable {
    let data: AppStatisticsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageAppVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [AppVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageAppVO: Codable {
    let data: PageAppVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AnnouncementQueryForm: Codable {
    let type: String?
    let status: String?
    let pageSize: Int?
    let pageNum: Int?
}

struct AnnouncementVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let announcementId: String?
    let title: String?
    let type: String?
    let status: String?
    let publishTime: String?
    let expireTime: String?
    let viewCount: Int?
    let isTop: Bool?
    let coverImage: String?
}

struct PageAnnouncementVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [AnnouncementVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageAnnouncementVO: Codable {
    let data: PageAnnouncementVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AnnouncementDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let announcementId: String?
    let title: String?
    let content: String?
    let type: String?
    let status: String?
    let author: String?
    let publishTime: String?
    let expireTime: String?
    let viewCount: Int?
    let isTop: Bool?
    let coverImage: String?
}

struct PlusApiResultAnnouncementDetailVO: Codable {
    let data: AnnouncementDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUpdateCheckVO: Codable {
    let data: UpdateCheckVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UpdateCheckVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let hasUpdate: Bool?
    let latestVersion: String?
    let currentVersion: String?
    let downloadUrl: String?
    let updateType: String?
    let title: String?
    let description: String?
    let fileSize: Int?
    let forceUpdate: Bool?
}

struct ChangelogVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let version: String?
    let releaseDate: String?
    let title: String?
    let features: [String]?
    let bugFixes: [String]?
    let improvements: [String]?
    let status: String?
    let downloadUrl: String?
}

struct PlusApiResultListChangelogVO: Codable {
    let data: [ChangelogVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListAnnouncementVO: Codable {
    let data: [AnnouncementVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultSystemStatusVO: Codable {
    let data: SystemStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ServiceStatus: Codable {
    let api: String?
    let database: String?
    let cache: String?
    let storage: String?
    let thirdParty: String?
}

struct SystemStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let status: String?
    let message: String?
    let timestamp: String?
    let version: String?
    let services: ServiceStatus?
}

struct MaintenanceNoticeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let noticeId: String?
    let title: String?
    let content: String?
    let startTime: String?
    let endTime: String?
    let status: String?
    let maintenanceType: String?
    let affectedServices: String?
    let contactInfo: String?
    let isEmergency: Bool?
}

struct PlusApiResultMaintenanceNoticeVO: Codable {
    let data: MaintenanceNoticeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPopupNotificationVO: Codable {
    let data: [PopupNotificationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OnboardingPageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let pageId: String?
    let title: String?
    let description: String?
    let images: [String]?
    let buttons: [String]?
    let backgroundColor: String?
    let textColor: String?
    let isActive: Bool?
    let order: Int?
}

struct PlusApiResultListOnboardingPageVO: Codable {
    let data: [OnboardingPageVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUserUsageStatsVO: Codable {
    let data: UserUsageStatsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserUsageStatsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let statsId: String?
    let userId: String?
    let totalSessions: Int?
    let totalDuration: Int?
    let activeDays: Int?
    let lastActiveDays: Int?
    let deviceType: String?
    let osType: String?
    let firstSeen: String?
    let lastSeen: String?
    let userType: String?
}

struct PlusApiResultRetentionAnalysisVO: Codable {
    let data: RetentionAnalysisVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RetentionAnalysisVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let retentionType: String?
    let retentionRates: [String: Double]?
    let averageRetentionRate: Double?
    let totalUsers: Int?
    let cohortSizes: [String: Int]?
}

struct PlusApiResultListReportTypeVO: Codable {
    let data: [ReportTypeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ReportTypeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let reportTypeId: String?
    let reportName: String?
    let reportType: String?
    let description: String?
    let enabled: Bool?
    let icon: String?
}

struct PlusApiResultRealtimeOnlineVO: Codable {
    let data: RealtimeOnlineVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RealtimeOnlineVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let currentOnline: Int?
    let peakOnline: Int?
    let averageOnline: Int?
    let newUsers: Int?
    let activeUsers: Int?
    let timestamp: String?
}

struct PlusApiResultListRealtimeEventVO: Codable {
    let data: [RealtimeEventVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RealtimeEventVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let eventId: String?
    let eventName: String?
    let eventType: String?
    let userId: String?
    let deviceId: String?
    let timestamp: String?
    let pageUrl: String?
    let referrer: String?
}

struct PathAnalysisQueryForm: Codable {
    let startDate: String?
    let endDate: String?
    let startPage: String?
    let endPage: String?
    let maxSteps: Int?
    let deviceType: String?
    let osType: String?
}

struct PathAnalysisVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let startPage: String?
    let endPage: String?
    let steps: [PathStepVO]?
    let totalUsers: Int?
    let averageSteps: Double?
    let conversionRate: Double?
}

struct PathStepVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let pageUrl: String?
    let pageTitle: String?
    let userCount: Int?
    let percentage: Double?
    let nextSteps: [PathStepVO]?
}

struct PlusApiResultPathAnalysisVO: Codable {
    let data: PathAnalysisVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FunnelQueryForm: Codable {
    let funnelName: String?
    let events: [String]?
    let startDate: String?
    let endDate: String?
    let deviceType: String?
    let osType: String?
}

struct FunnelAnalysisVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let funnelName: String?
    let steps: [FunnelStepVO]?
    let overallConversionRate: Double?
    let totalUsers: Int?
    let convertedUsers: Int?
}

struct FunnelStepVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let eventName: String?
    let userCount: Int?
    let conversionRate: Double?
    let stepConversionRate: Double?
}

struct PlusApiResultFunnelAnalysisVO: Codable {
    let data: FunnelAnalysisVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct EventTrendQueryForm: Codable {
    let eventName: String?
    let startDate: String?
    let endDate: String?
    let interval: String?
    let deviceType: String?
    let osType: String?
    let channel: String?
}

struct EventTrendVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let eventName: String?
    let timePoints: [String]?
    let values: [Int]?
    let totalCount: Int?
    let growthRate: Double?
    let interval: String?
}

struct PlusApiResultEventTrendVO: Codable {
    let data: EventTrendVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListTopEventVO: Codable {
    let data: [TopEventVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TopEventVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let eventName: String?
    let count: Int?
    let percentage: Double?
    let eventType: String?
}

struct EventStatsQueryForm: Codable {
    let eventName: String?
    let startDate: String?
    let endDate: String?
    let interval: String?
    let deviceType: String?
    let osType: String?
}

struct EventStatsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let eventName: String?
    let totalCount: Int?
    let averagePerUser: Double?
    let hourlyStats: [String: Int]?
    let dailyStats: [String: Int]?
    let topProperties: [String: Any]?
}

struct PlusApiResultEventStatsVO: Codable {
    let data: EventStatsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct DeviceDistributionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let deviceType: String?
    let deviceModel: String?
    let osType: String?
    let osVersion: String?
    let userCount: Int?
    let percentage: Double?
    let activeCount: Int?
}

struct PlusApiResultDeviceDistributionVO: Codable {
    let data: DeviceDistributionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ConversionPathVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let pathId: String?
    let steps: [String]?
    let conversionCount: Int?
    let conversionRate: Double?
    let averageTime: Double?
    let startPage: String?
    let endPage: String?
}

struct PlusApiResultConversionPathVO: Codable {
    let data: ConversionPathVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChannelQueryForm: Codable {
    let startDate: String?
    let endDate: String?
    let channelType: String?
    let deviceType: String?
    let pageSize: Int?
    let pageNum: Int?
}

struct ChannelAnalysisVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let channelId: String?
    let channelName: String?
    let channelType: String?
    let clickCount: Int?
    let installCount: Int?
    let activeCount: Int?
    let conversionRate: Double?
    let costPerInstall: Double?
    let roi: Double?
}

struct PlusApiResultChannelAnalysisVO: Codable {
    let data: ChannelAnalysisVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AiUsageStatsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let statsId: String?
    let modelName: String?
    let promptTokens: Int?
    let completionTokens: Int?
    let totalTokens: Int?
    let requestCount: Int?
    let errorCount: Int?
    let date: String?
    let userId: String?
}

struct PlusApiResultAiUsageStatsVO: Codable {
    let data: AiUsageStatsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserActivityQueryForm: Codable {
    let startDate: String?
    let endDate: String?
    let activityType: String?
    let userId: String?
    let pageSize: Int?
    let pageNum: Int?
}

struct PlusApiResultUserActivityVO: Codable {
    let data: UserActivityVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserActivityVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let activityId: String?
    let userId: String?
    let activityType: String?
    let activityName: String?
    let timestamp: String?
    let deviceId: String?
    let ipAddress: String?
    let pageUrl: String?
    let referrer: String?
}

struct PlusApiResultSplashAdvertVO: Codable {
    let data: SplashAdvertVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SplashAdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
    let displayDuration: Int?
    let skipEnabled: Bool?
    let skipDelay: Int?
    let backgroundColor: String?
    let logoUrl: String?
}

struct AdvertSettingsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let enabled: Bool?
    let personalized: Bool?
    let maxDailyAds: Int?
    let adBlockLevel: String?
    let rewardVideoEnabled: Bool?
    let interstitialEnabled: Bool?
    let bannerEnabled: Bool?
    let lastUpdated: String?
}

struct PlusApiResultAdvertSettingsVO: Codable {
    let data: AdvertSettingsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultRewardedAdvertVO: Codable {
    let data: RewardedAdvertVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RewardedAdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
    let rewardType: String?
    let rewardAmount: Int?
    let videoDuration: Int?
    let skipEnabled: Bool?
    let rewardMessage: String?
}

struct AdvertPositionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let positionId: String?
    let positionName: String?
    let positionType: String?
    let description: String?
    let priority: Int?
    let enabled: Bool?
    let advertCount: Int?
}

struct PlusApiResultListAdvertPositionVO: Codable {
    let data: [AdvertPositionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AdvertPositionDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let positionId: String?
    let positionName: String?
    let positionType: String?
    let description: String?
    let priority: Int?
    let enabled: Bool?
    let adverts: [AdvertVO]?
}

struct AdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
}

struct PlusApiResultAdvertPositionDetailVO: Codable {
    let data: AdvertPositionDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListAdvertVO: Codable {
    let data: [AdvertVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPopupAdvertVO: Codable {
    let data: PopupAdvertVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PopupAdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
    let popupSize: String?
    let displayDuration: Int?
    let closeButtonEnabled: Bool?
    let popupPosition: String?
}

struct InterstitialAdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
    let interstitialSize: String?
    let displayTime: Int?
    let skipEnabled: Bool?
    let skipDelay: Int?
}

struct PlusApiResultInterstitialAdvertVO: Codable {
    let data: InterstitialAdvertVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FeedAdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
    let title: String?
    let description: String?
    let imageUrl: String?
    let likes: Int?
    let comments: Int?
}

struct PlusApiResultListFeedAdvertVO: Codable {
    let data: [FeedAdvertVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AdvertConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let configId: String?
    let enabled: Bool?
    let maxAdsPerHour: Int?
    let minInterval: Int?
    let adNetwork: String?
    let apiKey: String?
    let status: String?
}

struct PlusApiResultAdvertConfigVO: Codable {
    let data: AdvertConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BannerAdvertVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let advertId: String?
    let advertName: String?
    let advertType: String?
    let positionId: String?
    let creativeUrl: String?
    let landingUrl: String?
    let priority: Int?
    let enabled: Bool?
    let startTime: String?
    let endTime: String?
    let clickCount: Int?
    let impressionCount: Int?
    let bannerSize: String?
    let animationType: String?
    let refreshInterval: Int?
}

struct PlusApiResultListBannerAdvertVO: Codable {
    let data: [BannerAdvertVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ActivityDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let description: String?
    let type: String?
    let coverImage: String?
    let bannerImages: [String]?
    let rules: String?
    let startTime: String?
    let endTime: String?
    let participantCount: Int?
    let hasJoined: Bool?
    let maxJoinCount: Int?
    let joinedCount: Int?
    let remainingCount: Int?
    let rewards: [ActivityReward]?
    let extraConfig: [String: Any]?
}

struct ActivityReward: Codable {
    let type: String?
    let name: String?
    let quantity: Int?
    let icon: String?
}

struct PlusApiResultActivityDetailVO: Codable {
    let data: ActivityDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListTaskVO: Codable {
    let data: [TaskVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TaskVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let taskId: String?
    let taskName: String?
    let taskType: String?
    let status: String?
    let progress: Int?
    let total: Int?
    let rewardType: String?
    let rewardAmount: Int?
    let expireAt: String?
}

struct ActivityRecordQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let activityId: String?
    let recordType: String?
    let size: Int?
    let page: Int?
}

struct ActivityRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let activityId: String?
    let activityTitle: String?
    let activityType: String?
    let participateTime: String?
    let status: String?
    let result: String?
    let rewards: [String: Any]?
}

struct PageActivityRecordVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ActivityRecordVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageActivityRecordVO: Codable {
    let data: PageActivityRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultRankingVO: Codable {
    let data: RankingVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RankInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let rank: Int?
    let userId: String?
    let username: String?
    let score: Int?
    let avatar: String?
    let isCurrentUser: Bool?
}

struct RankingVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let rankingType: String?
    let period: String?
    let rankings: [RankInfoVO]?
    let myRank: RankInfoVO?
    let totalUsers: Int?
}

struct PlusApiResultRankInfoVO: Codable {
    let data: RankInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsGoodsQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let category: String?
    let minPoints: Int?
    let maxPoints: Int?
    let exchangeable: Bool?
    let size: Int?
    let page: Int?
}

struct PagePointsGoodsVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PointsGoodsVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePointsGoodsVO: Codable {
    let data: PagePointsGoodsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsGoodsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let image: String?
    let category: String?
    let points: Int?
    let originalPoints: Int?
    let stock: Int?
    let exchangeable: Bool?
    let limitPerUser: Int?
    let exchangedCount: Int?
    let tags: [String]?
    let sortWeight: Int?
}

struct PlusApiResultPointsGoodsDetailVO: Codable {
    let data: PointsGoodsDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsGoodsDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let name: String?
    let description: String?
    let images: [String]?
    let category: String?
    let points: Int?
    let originalPoints: Int?
    let stock: Int?
    let exchangeable: Bool?
    let limitPerUser: Int?
    let myExchangedCount: Int?
    let exchangeNote: String?
    let validUntil: String?
    let usageInstructions: String?
}

struct ExchangeRecordQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let status: String?
    let size: Int?
    let page: Int?
}

struct PagePointsExchangeRecordVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [PointsExchangeRecordVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPagePointsExchangeRecordVO: Codable {
    let data: PagePointsExchangeRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsExchangeRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: String?
    let goodsId: String?
    let goodsName: String?
    let goodsImage: String?
    let quantity: Int?
    let pointsCost: Int?
    let exchangeTime: String?
    let status: String?
    let deliverTime: String?
    let logisticsInfo: String?
    let remark: String?
}

struct LotteryDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let description: String?
    let rules: String?
    let startTime: String?
    let endTime: String?
    let freeDrawCount: Int?
    let remainingFreeCount: Int?
    let pointsCost: Int?
    let myPoints: Int?
    let prizes: [LotteryPrize]?
    let recentWinners: [RecentWinner]?
}

struct LotteryPrize: Codable {
    let prizeId: String?
    let name: String?
    let image: String?
    let probability: String?
    let isGrandPrize: Bool?
    let remainingCount: Int?
}

struct PlusApiResultLotteryDetailVO: Codable {
    let data: LotteryDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RecentWinner: Codable {
    let nickname: String?
    let prizeName: String?
    let winTime: String?
}

struct LotteryPrizeQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let claimStatus: String?
    let size: Int?
    let page: Int?
}

struct LotteryPrizeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: String?
    let lotteryId: String?
    let lotteryTitle: String?
    let prizeId: String?
    let prizeName: String?
    let prizeImage: String?
    let prizeType: String?
    let isGrandPrize: Bool?
    let winTime: String?
    let claimStatus: String?
    let claimTime: String?
    let expireTime: String?
    let canClaim: Bool?
}

struct PageLotteryPrizeVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [LotteryPrizeVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageLotteryPrizeVO: Codable {
    let data: PageLotteryPrizeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct LotteryActivityVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let coverImage: String?
    let startTime: String?
    let endTime: String?
    let freeDrawCount: Int?
    let pointsCost: Int?
    let prizePreview: [PrizePreview]?
    let canDraw: Bool?
}

struct PlusApiResultListLotteryActivityVO: Codable {
    let data: [LotteryActivityVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PrizePreview: Codable {
    let name: String?
    let image: String?
    let isGrandPrize: Bool?
}

struct ActivityQueryForm: Codable {
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
    let type: String?
    let status: String?
    let size: Int?
    let page: Int?
}

struct ActivityVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: String?
    let title: String?
    let subtitle: String?
    let type: String?
    let coverImage: String?
    let status: String?
    let startTime: String?
    let endTime: String?
    let hasJoined: Bool?
    let maxJoinCount: Int?
    let joinedCount: Int?
    let tags: [String]?
}

struct PageActivityVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [ActivityVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageActivityVO: Codable {
    let data: PageActivityVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CheckInReward: Codable {
    let points: Int?
    let extraReward: String?
}

struct CheckInStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let checkedInToday: Bool?
    let consecutiveDays: Int?
    let monthlyCheckInCount: Int?
    let monthlyCheckInDates: [String]?
    let missedDates: [String]?
    let todayReward: CheckInReward?
    let tomorrowReward: CheckInReward?
    let makeUpCost: Int?
    let remainingMakeUpCount: Int?
}

struct PlusApiResultCheckInStatusVO: Codable {
    let data: CheckInStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CheckInRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let date: String?
    let checkedIn: Bool?
    let isMakeUp: Bool?
    let points: Int?
    let consecutiveDays: Int?
    let extraRewards: [String: Any]?
}

struct PlusApiResultListCheckInRecordVO: Codable {
    let data: [CheckInRecordVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AccountSummaryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let cashAvailable: Double?
    let cashFrozen: Double?
    let pointsAvailable: Int?
    let pointsFrozen: Int?
    let tokenAvailable: Int?
    let tokenFrozen: Int?
    let hasPayPassword: Bool?
}

struct PlusApiResultAccountSummaryVO: Codable {
    let data: AccountSummaryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct HistoryQueryForm: Codable {
    let transactionType: String?
    let status: String?
    let startDate: String?
    let endDate: String?
    let pageNum: Int?
    let pageSize: Int?
    let sortField: String?
    let sortDirection: String?
}

struct HistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let historyId: String?
    let accountId: String?
    let transactionType: String?
    let transactionTypeName: String?
    let amount: Double?
    let points: Int?
    let tokens: Int?
    let balanceBefore: Double?
    let balanceAfter: Double?
    let pointsBefore: Int?
    let pointsAfter: Int?
    let transactionId: String?
    let relatedId: String?
    let relatedType: String?
    let remarks: String?
    let status: String?
    let statusName: String?
    let counterpartyAccountId: String?
    let counterpartyUserId: String?
    let counterpartyUserName: String?
}

struct PageHistoryVO: Codable {
    let totalPages: Int?
    let totalElements: Int?
    let size: Int?
    let content: [HistoryVO]?
    let number: Int?
    let sort: SortObject?
    let first: Bool?
    let last: Bool?
    let numberOfElements: Int?
    let pageable: PageableObject?
    let empty: Bool?
}

struct PlusApiResultPageHistoryVO: Codable {
    let data: PageHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CashAccountInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let accountId: String?
    let accountType: String?
    let accountTypeName: String?
    let ownerId: String?
    let userId: String?
    let availableBalance: Double?
    let frozenBalance: Double?
    let totalBalance: Double?
    let status: String?
    let statusName: String?
    let pendingBalance: Double?
    let totalRecharged: Double?
    let totalSpent: Double?
    let totalWithdrawn: Double?
}

struct PlusApiResultCashAccountInfoVO: Codable {
    let data: CashAccountInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExperimentResultsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let experimentKey: String?
    let results: [[String: Any]]?
    let statistics: [String: Any]?
    let status: String?
    let generatedAt: String?
}

struct PlusApiResultExperimentResultsVO: Codable {
    let data: ExperimentResultsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExperimentReportVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let experimentKey: String?
    let reportType: String?
    let reportData: [String: Any]?
    let generatedAt: String?
    let version: String?
}

struct PlusApiResultExperimentReportVO: Codable {
    let data: ExperimentReportVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUiConfigVO: Codable {
    let data: UiConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UiConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let configKey: String?
    let configName: String?
    let uiConfig: [String: Any]?
    let version: String?
}

struct PlusApiResultListRolloutConfigVO: Codable {
    let data: [RolloutConfigVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RolloutConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let rolloutKey: String?
    let rolloutName: String?
    let config: [String: Any]?
    let status: String?
}

struct PlusApiResultRolloutCheckVO: Codable {
    let data: RolloutCheckVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RolloutCheckVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let rolloutKey: String?
    let canRollout: Bool?
    let reason: String?
    let status: String?
    let checkedAt: String?
}

struct PlusApiResultListFeatureFlagVO: Codable {
    let data: [FeatureFlagVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultFeatureFlagVO: Codable {
    let data: FeatureFlagVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExperimentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let experimentKey: String?
    let experimentName: String?
    let experimentDescription: String?
    let status: String?
}

struct PlusApiResultListExperimentVO: Codable {
    let data: [ExperimentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ExperimentDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let experimentKey: String?
    let experimentName: String?
    let experimentDescription: String?
    let status: String?
    let variants: [[String: Any]]?
    let config: [String: Any]?
}

struct PlusApiResultExperimentDetailVO: Codable {
    let data: ExperimentDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultExperimentAssignmentVO: Codable {
    let data: ExperimentAssignmentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AlgorithmConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let algorithmType: String?
    let algorithmParams: Any?
    let version: String?
}

struct PlusApiResultAlgorithmConfigVO: Codable {
    let data: AlgorithmConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct BatchCancelShareForm: Codable {
    let shareIds: [String]?
    let reason: String?
}

struct AccountDeleteForm: Codable {
    let password: String?
    let reason: String?
    let confirm: Bool?
    let timestamp: Int?
}

struct NotificationBatchDeleteForm: Codable {
    let notificationIds: [String]?
}

struct HistoryBatchDeleteForm: Codable {
    let historyIds: [String]?
    let type: String?
}

struct FavoriteBatchRemoveForm: Codable {
    let favoriteIds: [String]?
}

struct PasswordResetRequestForm: Codable {
    let account: String?
    let channel: String?
    let deviceId: String?
    let locale: String?
    let redirectUri: String?
}

struct PromptEnhanceRequest: Codable {
    let prompt: String?
    let scene: String?
    let style: String?
    let language: String?
    let maxWords: Int?
}

struct PromptEnhanceResponse: Codable {
    let prompt: String?
    let tokensEstimated: Int?
}

struct PlusApiResultPromptEnhanceResponse: Codable {
    let code: Int?
    let msg: String?
    let data: PromptEnhanceResponse?
    let timestamp: String?
    let traceId: String?
}

struct PlusApiErrorResult: Codable {
    let code: Int?
    let msg: String?
    let data: Any?
    let timestamp: String?
    let traceId: String?
}

struct UploadAvatarRequest: Codable {
    let file: String?
}

struct ImageRequest: Codable {
    let file: String?
}

struct FileRequest: Codable {
    let file: String?
}

struct ChunkRequest: Codable {
    let file: String?
}

struct PaymentCallbackRequest: Codable {

}

struct PaymentCallbackResponse: Codable {

}

struct GetModelPricesRequest: Codable {

}

struct BatchDeleteNotesRequest: Codable {

}

struct BatchDeleteAssetsRequest: Codable {

}
