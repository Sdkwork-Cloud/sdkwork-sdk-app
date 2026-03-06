package types

// 技能用户配置更新参数
type SkillConfigUpdateForm struct {
	Config map[string]interface{} `json:"config"`
}
