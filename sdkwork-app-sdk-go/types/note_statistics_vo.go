package types

// 笔记统计响应
type NoteStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalNotes int `json:"totalNotes"`
	TotalFolders int `json:"totalFolders"`
	FavoritedNotes int `json:"favoritedNotes"`
	ThisMonthNotes int `json:"thisMonthNotes"`
	ThisWeekNotes int `json:"thisWeekNotes"`
	TodayNotes int `json:"todayNotes"`
	TotalWords int `json:"totalWords"`
	LastUpdateTime string `json:"lastUpdateTime"`
	FolderNoteCounts map[string]int `json:"folderNoteCounts"`
	TagUsageCounts map[string]int `json:"tagUsageCounts"`
}
