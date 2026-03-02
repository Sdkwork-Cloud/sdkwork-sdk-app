package types

// Filesystem disk object
type FileSystemDiskVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DiskId string `json:"diskId"`
	DiskUuid string `json:"diskUuid"`
	Name string `json:"name"`
	Type string `json:"type"`
	Owner string `json:"owner"`
	OwnerId string `json:"ownerId"`
	TotalSize int `json:"totalSize"`
	UsedSize int `json:"usedSize"`
	RemainingSize int `json:"remainingSize"`
	UsageRate float64 `json:"usageRate"`
	FileCount int `json:"fileCount"`
	Description string `json:"description"`
}
