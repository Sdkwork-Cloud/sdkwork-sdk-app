package types

// 更新界面设置请求
type UISettingsUpdateForm struct {
	Theme string `json:"theme"`
	Language string `json:"language"`
	FontSize string `json:"fontSize"`
	ZoomLevel int `json:"zoomLevel"`
	NotificationsEnabled bool `json:"notificationsEnabled"`
	ShortcutsEnabled bool `json:"shortcutsEnabled"`
	SidebarState string `json:"sidebarState"`
	AutoSaveEnabled bool `json:"autoSaveEnabled"`
}
