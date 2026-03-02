package types


type UserSearchResult struct {
	Id int `json:"id"`
	Username string `json:"username"`
	RealName string `json:"realName"`
	UserType string `json:"userType"`
	AvatarUrl string `json:"avatarUrl"`
}
