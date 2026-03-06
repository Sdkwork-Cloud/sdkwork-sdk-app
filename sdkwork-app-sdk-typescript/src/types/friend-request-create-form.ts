/** Create friend request */
export interface FriendRequestCreateForm {
  /** Target user id */
  toUserId: string;
  /** Apply message */
  message?: string;
}
