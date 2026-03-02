package types

// 创建收藏文件夹请求
type FavoriteFolderCreateForm struct {
	FolderName string `json:"folderName"`
	Name string `json:"name"`
	ParentFolderId string `json:"parentFolderId"`
	FolderDescription string `json:"folderDescription"`
}
