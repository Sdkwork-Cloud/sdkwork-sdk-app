package types

// Update contact group request
type ContactGroupUpdateForm struct {
	Name string `json:"name"`
	MemberIds []string `json:"memberIds"`
}
