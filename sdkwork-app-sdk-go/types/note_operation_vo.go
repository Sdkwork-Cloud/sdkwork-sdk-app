package types

// 笔记操作响应
type NoteOperationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	NoteId int `json:"noteId"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	OperationType string `json:"operationType"`
	OperationTime string `json:"operationTime"`
	Message string `json:"message"`
}
