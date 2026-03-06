using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FriendRequestCreateForm
    {
        public string? ToUserId { get; set; }
        public string? Message { get; set; }
    }
}
