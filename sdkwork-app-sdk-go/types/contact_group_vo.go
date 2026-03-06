package types

// Contact group
type ContactGroupVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	MemberIds []string `json:"memberIds"`
}
