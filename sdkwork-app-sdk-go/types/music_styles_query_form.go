package types

// 音乐风格查询请求
type MusicStylesQueryForm struct {
	Category string `json:"category"`
	Genre string `json:"genre"`
	Style string `json:"style"`
	Mood string `json:"mood"`
	Instrument string `json:"instrument"`
}
