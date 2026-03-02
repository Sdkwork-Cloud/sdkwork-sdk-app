package types


type BrowseHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	TargetName string `json:"targetName"`
	TargetDescription string `json:"targetDescription"`
	TargetIcon string `json:"targetIcon"`
	BrowseTime string `json:"browseTime"`
	Duration int `json:"duration"`
	Source string `json:"source"`
}
