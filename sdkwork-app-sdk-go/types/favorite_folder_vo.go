package types

// 收藏文件夹响应
type FavoriteFolderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FolderId string `json:"folderId"`
	FolderName string `json:"folderName"`
	ParentFolderId string `json:"parentFolderId"`
	FolderDescription string `json:"folderDescription"`
	SubFolders []FavoriteFolderVO `json:"subFolders"`
	FavoriteItems []FavoriteItemVO `json:"favoriteItems"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	FavoriteCount int `json:"favoriteCount"`
}
