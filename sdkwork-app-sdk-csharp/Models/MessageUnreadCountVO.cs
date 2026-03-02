using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MessageUnreadCountVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalUnread { get; set; }
        public int? PrivateUnread { get; set; }
        public int? SystemUnread { get; set; }
    }
}
