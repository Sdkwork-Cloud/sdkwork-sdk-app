using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationBatchDeleteForm
    {
        public List<string>? NotificationIds { get; set; }
    }
}
