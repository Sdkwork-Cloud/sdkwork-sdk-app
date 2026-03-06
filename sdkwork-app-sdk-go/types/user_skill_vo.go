package types

// 用户技能安装信息
type UserSkillVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserSkillId int `json:"userSkillId"`
	SkillId int `json:"skillId"`
	Enabled bool `json:"enabled"`
	Config map[string]interface{} `json:"config"`
	InstalledAt string `json:"installedAt"`
	LastEnabledAt string `json:"lastEnabledAt"`
	LastUsedAt string `json:"lastUsedAt"`
	UsedCount int `json:"usedCount"`
	Skill SkillVO `json:"skill"`
}
