package types

// Create contact group request
type ContactGroupCreateForm struct {
	Name string `json:"name"`
	MemberIds []string `json:"memberIds"`
}
