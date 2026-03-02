package types

// 笔记响应
type NoteVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Content string `json:"content"`
	UserId int `json:"userId"`
	FolderId string `json:"folderId"`
	FolderPath string `json:"folderPath"`
	Tags []string `json:"tags"`
	AccessScope string `json:"accessScope"`
	HasPassword bool `json:"hasPassword"`
	CoverImageUrl string `json:"coverImageUrl"`
	Status string `json:"status"`
	Summary string `json:"summary"`
	Favorited bool `json:"favorited"`
	WordCount int `json:"wordCount"`
}
