package types

// 设备控制命令表单
type DeviceControlForm struct {
	Action string `json:"action"`
	Params map[string]interface{} `json:"params"`
}
