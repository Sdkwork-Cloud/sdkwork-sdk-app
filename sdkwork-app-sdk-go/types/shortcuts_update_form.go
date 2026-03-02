package types

// 更新快捷方式请求
type ShortcutsUpdateForm struct {
	Shortcuts []ShortcutItemForm `json:"shortcuts"`
}
