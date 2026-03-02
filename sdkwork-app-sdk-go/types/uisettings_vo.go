package types

// 界面设置响应
type UISettingsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Theme string `json:"theme"`
	Language string `json:"language"`
	FontSize string `json:"fontSize"`
	ZoomLevel int `json:"zoomLevel"`
	NotificationsEnabled bool `json:"notificationsEnabled"`
	ShortcutsEnabled bool `json:"shortcutsEnabled"`
	SidebarState string `json:"sidebarState"`
	AutoSaveEnabled bool `json:"autoSaveEnabled"`
}
