package types

// 笔记文件夹响应
type NoteFolderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	ParentId int `json:"parentId"`
	ParentName string `json:"parentName"`
	Path string `json:"path"`
	SubFolderCount int `json:"subFolderCount"`
	NoteCount int `json:"noteCount"`
	Children []NoteFolderVO `json:"children"`
}
