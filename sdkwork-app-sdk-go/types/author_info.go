package types

// 作者信息
type AuthorInfo struct {
	Id int `json:"id"`
	Name string `json:"name"`
	Avatar string `json:"avatar"`
	Bio string `json:"bio"`
	IsFollowing bool `json:"isFollowing"`
}
