package types


type NoteSearchResult struct {
	Id int `json:"id"`
	Title string `json:"title"`
	Summary string `json:"summary"`
	FolderId string `json:"folderId"`
	FolderName string `json:"folderName"`
}
