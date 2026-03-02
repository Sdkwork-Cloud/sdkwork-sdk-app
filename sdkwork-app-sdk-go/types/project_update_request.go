package types


type ProjectUpdateRequest struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Tags []string `json:"tags"`
	IsPublic bool `json:"isPublic"`
}
