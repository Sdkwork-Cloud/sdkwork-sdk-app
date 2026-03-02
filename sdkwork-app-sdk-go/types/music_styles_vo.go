package types

// 音乐风格响应
type MusicStylesVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Genres []GenreVO `json:"genres"`
	Styles []StyleVO `json:"styles"`
	Moods []MoodVO `json:"moods"`
	Instruments []InstrumentVO `json:"instruments"`
}
