using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TenantUpdateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? ContactPerson { get; set; }
        public string? ContactPhone { get; set; }
        public string? ExpireTime { get; set; }
    }
}
