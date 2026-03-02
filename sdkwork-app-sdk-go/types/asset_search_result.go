package types


type AssetSearchResult struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Type string `json:"type"`
	Path string `json:"path"`
	WorkspaceId string `json:"workspaceId"`
}
