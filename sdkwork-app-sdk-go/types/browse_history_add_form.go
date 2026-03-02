package types


type BrowseHistoryAddForm struct {
	Type string `json:"type"`
	TargetId string `json:"targetId"`
	TargetName string `json:"targetName"`
	TargetDescription string `json:"targetDescription"`
	TargetIcon string `json:"targetIcon"`
	Duration int `json:"duration"`
	Source string `json:"source"`
}
