using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FriendRequestVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? FromId { get; set; }
        public string? FromName { get; set; }
        public string? FromAvatar { get; set; }
        public string? ToId { get; set; }
        public string? Status { get; set; }
        public string? Message { get; set; }
    }
}
