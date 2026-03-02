package types


type ProjectCreateRequest struct {
	Name string `json:"name"`
	Description string `json:"description"`
	WorkspaceId string `json:"workspaceId"`
	Type string `json:"type"`
	Tags []string `json:"tags"`
	IsPublic bool `json:"isPublic"`
}
