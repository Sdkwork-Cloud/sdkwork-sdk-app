package types

// 快捷方式项
type ShortcutItemForm struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Icon string `json:"icon"`
	Url string `json:"url"`
	Sort int `json:"sort"`
	Type string `json:"type"`
}
