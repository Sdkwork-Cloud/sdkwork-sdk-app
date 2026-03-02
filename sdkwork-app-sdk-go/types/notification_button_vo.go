package types

// 通知按钮
type NotificationButtonVO struct {
	Text string `json:"text"`
	Type string `json:"type"`
	Url string `json:"url"`
	Action string `json:"action"`
	CloseOnClick bool `json:"closeOnClick"`
}
