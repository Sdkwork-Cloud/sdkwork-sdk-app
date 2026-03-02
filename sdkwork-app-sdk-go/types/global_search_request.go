package types


type GlobalSearchRequest struct {
	Keyword string `json:"keyword"`
	Type string `json:"type"`
	Page int `json:"page"`
	Size int `json:"size"`
}
