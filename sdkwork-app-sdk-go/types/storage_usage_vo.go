package types


type StorageUsageVO struct {
	TotalSize int `json:"totalSize"`
	UsedSize int `json:"usedSize"`
	RemainingSize int `json:"remainingSize"`
	FileCount int `json:"fileCount"`
}
