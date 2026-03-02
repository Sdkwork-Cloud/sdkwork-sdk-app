package types

// 更新收藏文件夹请求
type FavoriteFolderUpdateForm struct {
	FolderId string `json:"folderId"`
	FolderName string `json:"folderName"`
	ParentFolderId string `json:"parentFolderId"`
	FolderDescription string `json:"folderDescription"`
}
