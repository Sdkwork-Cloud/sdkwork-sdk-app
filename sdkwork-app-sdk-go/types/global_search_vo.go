package types

// 全局搜索响应
type GlobalSearchVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Projects []ProjectSearchResult `json:"projects"`
	Assets []AssetSearchResult `json:"assets"`
	Notes []NoteSearchResult `json:"notes"`
	Users []UserSearchResult `json:"users"`
}
