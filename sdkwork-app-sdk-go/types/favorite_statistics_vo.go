package types


type FavoriteStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalCount int `json:"totalCount"`
	FolderCount int `json:"folderCount"`
	MonthlyAdded int `json:"monthlyAdded"`
	LastFavoritedTime string `json:"lastFavoritedTime"`
	CountByType map[string]int `json:"countByType"`
}
