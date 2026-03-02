package types

// 服务状态
type ServiceStatus struct {
	Api string `json:"api"`
	Database string `json:"database"`
	Cache string `json:"cache"`
	Storage string `json:"storage"`
	ThirdParty string `json:"thirdParty"`
}
