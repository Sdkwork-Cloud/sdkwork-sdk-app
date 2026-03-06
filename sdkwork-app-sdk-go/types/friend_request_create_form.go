package types

// Create friend request
type FriendRequestCreateForm struct {
	ToUserId string `json:"toUserId"`
	Message string `json:"message"`
}
