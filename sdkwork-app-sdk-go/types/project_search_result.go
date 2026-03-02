package types


type ProjectSearchResult struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	WorkspaceId string `json:"workspaceId"`
	WorkspaceName string `json:"workspaceName"`
	Type string `json:"type"`
}
