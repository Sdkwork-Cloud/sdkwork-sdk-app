package types

// Document operation response
type DocumentOperationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	OperationType string `json:"operationType"`
	Message string `json:"message"`
	DocumentId string `json:"documentId"`
	DocumentUuid string `json:"documentUuid"`
	Title string `json:"title"`
	OperationTime string `json:"operationTime"`
}
