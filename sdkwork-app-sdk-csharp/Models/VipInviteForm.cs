using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipInviteForm
    {
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? Channel { get; set; }
    }
}
